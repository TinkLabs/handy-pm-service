package com.hi.pushmessage.service.impl;

import com.hi.pushmessage.entity.Messages;
import com.hi.pushmessage.mapper.MessagesMapper;
import com.hi.pushmessage.service.MessagesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Landin
 * @since 2019-04-13
 */
@Service
public class MessagesServiceImpl extends ServiceImpl<MessagesMapper, Messages> implements MessagesService {

}
