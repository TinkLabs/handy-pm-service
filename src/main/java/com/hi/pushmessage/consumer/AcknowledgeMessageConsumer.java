package com.hi.pushmessage.consumer;

import cn.hutool.core.date.DateTime;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.hi.pushmessage.bo.MessageReceivedBo;
import com.hi.pushmessage.common.Consts;
import com.hi.pushmessage.common.PushMessageCodeEnum;
import com.hi.pushmessage.entity.Devices;
import com.hi.pushmessage.entity.MessageRecipients;
import com.hi.pushmessage.service.DevicesService;
import com.hi.pushmessage.service.MessageRecipientsService;
import com.tinklabs.corecommonbase.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: Landin
 * @date: 2019-04-12
 **/
@Slf4j
@Component
public class AcknowledgeMessageConsumer {
    @Autowired
    MessageRecipientsService messageRecipientsService;
    @Autowired
    private DevicesService devicesService;
    @KafkaListener(topics = {"acknowledge_message"})
    public void consumerAcknowledgeMessage(String message) throws Exception {
        log.info("receive message from topic 'acknowledge_message' : {}", message);
        if (StringUtils.isNotEmpty(message)) {
            try{
                MessageReceivedBo messageReceivedBo = JSONObject.parseObject(message, MessageReceivedBo.class);
                List<MessageRecipients> messageRecipients = messageRecipientsService.findNotReceivedMessageRecipients(messageReceivedBo.getMessageInfoId(), messageReceivedBo.getImei());
                if(messageRecipients.size() > 1){
                    throw new BusinessException(PushMessageCodeEnum.RECIPIENT_DUPLICATE.getCode(),PushMessageCodeEnum.RECIPIENT_DUPLICATE.getMessage());
                }
                Wrapper wrapper = new EntityWrapper();
                wrapper.eq(Consts.BARCODE, messageReceivedBo.getImei());
                List<Devices> devicesList = devicesService.selectList(wrapper);
                if(devicesList.size() > 1){
                    throw new BusinessException(PushMessageCodeEnum.DEVICE_IMEI_DUPLICATE.getCode(),PushMessageCodeEnum.DEVICE_IMEI_DUPLICATE.getMessage());
                }
                if(messageRecipients.size() == 1) {
                    MessageRecipients messageRecipient = messageRecipients.get(0);
                    Devices devices = devicesList.get(0);
                    messageRecipient.setStatus("received");
                    Date now = new Date();
                    messageRecipient.setAcknowledgeDatetime(now);
                    messageRecipient.setModified(new DateTime());
                    messageRecipient.setDeviceUserId(devices.getDeviceUserId());
                    messageRecipientsService.updateById(messageRecipient);
                    log.info("acknowledge_message");
                    //log acknowledge_message special fields in json format
                    MDC.put("recipient_id", messageRecipient.getId().toString());
                    MDC.put("message_info_id", messageReceivedBo.getMessageInfoId().toString());
                    MDC.put("device_user_id", messageRecipient.getDeviceUserId().toString());
                    MDC.put("status", messageRecipient.getStatus());
                    MDC.put("acknowledgeDatetime", messageRecipient.getAcknowledgeDatetime().toString());
                    MDC.remove("userId");
                }
            }catch (Exception e) {
                log.error("Consuming the acknowledge_message  exception: {}", e.getMessage());
                throw e;
            }
        }
    }
}
