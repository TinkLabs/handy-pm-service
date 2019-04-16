package com.hi.pushmessage.service;

import com.hi.pushmessage.entity.MessageRecipients;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * @author  Landin
 * @since 2019-04-12
 */
public interface MessageRecipientsService extends IService<MessageRecipients> {
    List<MessageRecipients> findNotReceivedMessageRecipients(Integer messageInfoId, Integer deviceUserId);
}
