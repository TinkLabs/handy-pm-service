package com.hi.service.impl;

import com.hi.entity.MessageRecipients;
import com.hi.mapper.MessageRecipientsMapper;
import com.hi.service.MessageRecipientsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author  Landin
 * @since 2019-04-12
 */
@Service
public class MessageRecipientsServiceImpl extends ServiceImpl<MessageRecipientsMapper, MessageRecipients> implements MessageRecipientsService {

    @Override
    public List<MessageRecipients> findNotReceivedMessageRecipients(Integer messageInfoId, Integer deviceUserId) {
        return baseMapper.findNotReceivedMessageRecipients(messageInfoId, deviceUserId);
    }
}
