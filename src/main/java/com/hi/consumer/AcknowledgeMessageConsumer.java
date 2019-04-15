package com.hi.consumer;

import com.alibaba.fastjson.JSONObject;
import com.hi.bo.MessageReceivedBo;
import com.hi.entity.MessageRecipients;
import com.hi.service.MessageRecipientsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
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
    @KafkaListener(topics = {"acknowledge_message"})
    public void consumerAcknowledgeMessage(String message) throws Exception {

        log.info("receive message from topic 'acknowledge_message' : {}", message);
        if (StringUtils.isNotEmpty(message)) {
            try{
                MessageReceivedBo messageReceivedBo = JSONObject.parseObject(message, MessageReceivedBo.class);
                List<MessageRecipients> messageRecipients = messageRecipientsService.findNotReceivedMessageRecipients(messageReceivedBo.getMessageInfoId(),messageReceivedBo.getDeviceUserId());
                if(messageRecipients != null && messageRecipients.size() > 0) {
                    for (MessageRecipients messageRecipient : messageRecipients) {
                        messageRecipient.setStatus("received");
                        messageRecipient.setAcknowledgeDatetime(new Date());
                        messageRecipient.setDeviceUserId(messageReceivedBo.getDeviceUserId());
                    }
                    messageRecipientsService.updateBatchById(messageRecipients);
                }
            }catch (Exception e) {
                log.error("Consuming the acknowledge_message  exception: {}", e.getMessage());
                throw e;
            }
        }


    }
}
