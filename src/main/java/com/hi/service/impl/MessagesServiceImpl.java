package com.hi.service.impl;

import com.hi.entity.Messages;
import com.hi.mapper.MessagesMapper;
import com.hi.service.MessagesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Landin
 * @since 2019-04-13
 */
@Service
public class MessagesServiceImpl extends ServiceImpl<MessagesMapper, Messages> implements MessagesService {

}
