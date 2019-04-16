package com.hi.pushmessage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hi.pushmessage.bo.MessageReceivedBo;
import com.hi.pushmessage.PushMessageCodeEnum;
import com.hi.pushmessage.service.MessageReceivedService;
import com.tinklabs.corecommonbase.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @description:
 * @author: Landin
 * @date: 2019-04-12
 **/
@Slf4j
@Service
public class MessageReceivedServiceImpl implements MessageReceivedService {
    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;
    @Value("${spring.kafka.topic.acknowledge}")
    private String acknowledgeTopic;
    @Override
    public void sendAcknowledgeMessage(MessageReceivedBo messageReceivedBo) throws BusinessException {
        try{
            String message = JSONObject.toJSONString(messageReceivedBo);
            log.info("Send acknowledge message to topic:{}   message:{}", acknowledgeTopic, message);
            kafkaTemplate.send(acknowledgeTopic, message);
            log.info("Send acknowledge message to kafka successfully");
        } catch (Exception e) {
            log.error("Failed to Send acknowledge message to kafka, email: {} + Exception message: {}", messageReceivedBo.getMessageInfoId(), e.getMessage());
            throw new BusinessException(PushMessageCodeEnum.FAILED_TO_SEND_MESSAGE_EXCEPTION.getCode(), PushMessageCodeEnum.FAILED_TO_SEND_MESSAGE_EXCEPTION.getMessage());

        }
    }
}
