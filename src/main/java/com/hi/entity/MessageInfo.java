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
 * @author Landin
 * @since 2019-04-12
 */
@TableName("message_info")
public class MessageInfo extends Model<MessageInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("message_id")
    private Integer messageId;
    @TableField("hotel_id")
    private Integer hotelId;
    @TableField("recipient_count")
    private Integer recipientCount;
    @TableField("pushy_id")
    private String pushyId;
    @TableField("pushy_app2_id")
    private String pushyApp2Id;
    @TableField("send_at")
    private Date sendAt;
    private Date created;
    private String status;
    private Integer expiry;
    @TableField("send_to_pushy")
    private Date sendToPushy;
    @TableField("retry_at")
    private Date retryAt;
    @TableField("retry_mqtt")
    private Date retryMqtt;
    private Date modified;
    @TableField("only_once")
    private Integer onlyOnce;
    @TableField("alarm_id")
    private Integer alarmId;
    private String payload;
    private Integer received;
    private Integer viewed;
    private Integer clicked;


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

    public Integer getRecipientCount() {
        return recipientCount;
    }

    public void setRecipientCount(Integer recipientCount) {
        this.recipientCount = recipientCount;
    }

    public String getPushyId() {
        return pushyId;
    }

    public void setPushyId(String pushyId) {
        this.pushyId = pushyId;
    }

    public String getPushyApp2Id() {
        return pushyApp2Id;
    }

    public void setPushyApp2Id(String pushyApp2Id) {
        this.pushyApp2Id = pushyApp2Id;
    }

    public Date getSendAt() {
        return sendAt;
    }

    public void setSendAt(Date sendAt) {
        this.sendAt = sendAt;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getExpiry() {
        return expiry;
    }

    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    public Date getSendToPushy() {
        return sendToPushy;
    }

    public void setSendToPushy(Date sendToPushy) {
        this.sendToPushy = sendToPushy;
    }

    public Date getRetryAt() {
        return retryAt;
    }

    public void setRetryAt(Date retryAt) {
        this.retryAt = retryAt;
    }

    public Date getRetryMqtt() {
        return retryMqtt;
    }

    public void setRetryMqtt(Date retryMqtt) {
        this.retryMqtt = retryMqtt;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getOnlyOnce() {
        return onlyOnce;
    }

    public void setOnlyOnce(Integer onlyOnce) {
        this.onlyOnce = onlyOnce;
    }

    public Integer getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getViewed() {
        return viewed;
    }

    public void setViewed(Integer viewed) {
        this.viewed = viewed;
    }

    public Integer getClicked() {
        return clicked;
    }

    public void setClicked(Integer clicked) {
        this.clicked = clicked;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "MessageInfo{" +
        ", id=" + id +
        ", messageId=" + messageId +
        ", hotelId=" + hotelId +
        ", recipientCount=" + recipientCount +
        ", pushyId=" + pushyId +
        ", pushyApp2Id=" + pushyApp2Id +
        ", sendAt=" + sendAt +
        ", created=" + created +
        ", status=" + status +
        ", expiry=" + expiry +
        ", sendToPushy=" + sendToPushy +
        ", retryAt=" + retryAt +
        ", retryMqtt=" + retryMqtt +
        ", modified=" + modified +
        ", onlyOnce=" + onlyOnce +
        ", alarmId=" + alarmId +
        ", payload=" + payload +
        ", received=" + received +
        ", viewed=" + viewed +
        ", clicked=" + clicked +
        "}";
    }
}
