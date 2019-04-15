package com.hi.mapper;

import com.hi.entity.MessageRecipients;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @author  Landin
 * @since 2019-04-12
 */
public interface MessageRecipientsMapper extends BaseMapper<MessageRecipients> {

     /**
      * @description
      * @author Landin
      * @date 2019-04-13 11:44
      * @param messageInfoId, deviceUserId
      * @return java.util.List<com.hi.entity.MessageRecipients>
      */
     
     @Select("SELECT mr.*" +
             "     FROM message_recipients mr " +
             "     LEFT JOIN message_info mi ON mi.id = mr.message_info_id " +
             "     LEFT JOIN messages m ON m.id = mr.message_id " +
             "     LEFT JOIN devices d ON mr.hotel_id = d.hotel_id " +
             "     AND mr.hotel_room_number = d.hotel_room_number " +
             "     WHERE mi.send_at <= now() " +
             "     AND m.action = 'broadcastmessage' " +
             "     AND mr.status IN ('pending', 'sent') " +
             "     AND mi.id = #{messageInfoId} " +
             "     AND ( #{messageInfoId} is null OR mr.device_user_id = #{deviceUserId})")
     List<MessageRecipients> findNotReceivedMessageRecipients(Integer messageInfoId, Integer deviceUserId);
}
