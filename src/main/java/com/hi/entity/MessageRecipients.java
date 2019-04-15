package com.hi.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * @author  Landin
 * @since 2019-04-12
 */
@TableName("message_recipients")
public class MessageRecipients extends Model<MessageRecipients> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("message_id")
    private Integer messageId;
    @TableField("hotel_id")
    private Integer hotelId;
    @TableField("hotel_room_number")
    private String hotelRoomNumber;
    @TableField("device_user_id")
    private Integer deviceUserId;
    private Integer clicked;
    private Integer viewed;
    @TableField("send_datetime")
    private Date sendDatetime;
    @TableField("acknowledge_datetime")
    private Date acknowledgeDatetime;
    private String status;
    private Date created;
    private Date modified;
    @TableField("message_info_id")
    private Integer messageInfoId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelRoomNumber() {
        return hotelRoomNumber;
    }

    public void setHotelRoomNumber(String hotelRoomNumber) {
        this.hotelRoomNumber = hotelRoomNumber;
    }

    public Integer getDeviceUserId() {
        return deviceUserId;
    }

    public void setDeviceUserId(Integer deviceUserId) {
        this.deviceUserId = deviceUserId;
    }

    public Integer getClicked() {
        return clicked;
    }

    public void setClicked(Integer clicked) {
        this.clicked = clicked;
    }

    public Integer getViewed() {
        return viewed;
    }

    public void setViewed(Integer viewed) {
        this.viewed = viewed;
    }

    public Date getSendDatetime() {
        return sendDatetime;
    }

    public void setSendDatetime(Date sendDatetime) {
        this.sendDatetime = sendDatetime;
    }

    public Date getAcknowledgeDatetime() {
        return acknowledgeDatetime;
    }

    public void setAcknowledgeDatetime(Date acknowledgeDatetime) {
        this.acknowledgeDatetime = acknowledgeDatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getMessageInfoId() {
        return messageInfoId;
    }

    public void setMessageInfoId(Integer messageInfoId) {
        this.messageInfoId = messageInfoId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "MessageRecipients{" +
        ", id=" + id +
        ", messageId=" + messageId +
        ", hotelId=" + hotelId +
        ", hotelRoomNumber=" + hotelRoomNumber +
        ", deviceUserId=" + deviceUserId +
        ", clicked=" + clicked +
        ", viewed=" + viewed +
        ", sendDatetime=" + sendDatetime +
        ", acknowledgeDatetime=" + acknowledgeDatetime +
        ", status=" + status +
        ", created=" + created +
        ", modified=" + modified +
        ", messageInfoId=" + messageInfoId +
        "}";
    }
}
