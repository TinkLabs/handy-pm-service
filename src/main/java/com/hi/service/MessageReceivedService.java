package com.hi.service;

import com.hi.bo.MessageReceivedBo;
import com.tinklabs.corecommonbase.exception.BusinessException;

/**
 * @description:
 * @author: Landin
 * @date: 2019-04-12
 **/
public interface MessageReceivedService {
    /**
     * @description   send acknowledge message to kafka
     * @author Landin
     * @date 2019-04-12 17:15
     * @param messageReceivedBo
     * @return void
     */
    void sendAcknowledgeMessage(MessageReceivedBo messageReceivedBo) throws BusinessException;
}
