package com.hi.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * @author Landin
 * @since 2019-04-13
 */
public class Messages extends Model<Messages> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("zone_id")
    private Integer zoneId;
    @TableField("user_id")
    private Integer userId;
    private String action;
    private Integer queue;
    private String status;
    @TableField("device_status")
    private String deviceStatus;
    @TableField("device_activation_type")
    private String deviceActivationType;
    @TableField("hotel_ids")
    private String hotelIds;
    @TableField("hotel_room_numbers")
    private String hotelRoomNumbers;
    @TableField("hotel_guest_group_id")
    private String hotelGuestGroupId;
    @TableField("hotel_group_codes")
    private String hotelGroupCodes;
    @TableField("hotel_vip_codes")
    private String hotelVipCodes;
    @TableField("owner_type")
    private Integer ownerType;
    private String dates;
    private Date time;
    private Integer expiry;
    private String locales;
    private String content;
    @TableField("latitude_start")
    private BigDecimal latitudeStart;
    @TableField("longitude_start")
    private BigDecimal longitudeStart;
    @TableField("latitude_end")
    private BigDecimal latitudeEnd;
    @TableField("longitude_end")
    private BigDecimal longitudeEnd;
    @TableField("custom_url")
    private String customUrl;
    private Date created;
    private Date modified;
    private Integer hidden;
    private String payload;
    private String category;
    @TableField("event_planner_id")
    private Integer eventPlannerId;
    @TableField("event_id")
    private Integer eventId;
    @TableField("activated_devices")
    private Integer activatedDevices;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getQueue() {
        return queue;
    }

    public void setQueue(Integer queue) {
        this.queue = queue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceActivationType() {
        return deviceActivationType;
    }

    public void setDeviceActivationType(String deviceActivationType) {
        this.deviceActivationType = deviceActivationType;
    }

    public String getHotelIds() {
        return hotelIds;
    }

    public void setHotelIds(String hotelIds) {
        this.hotelIds = hotelIds;
    }

    public String getHotelRoomNumbers() {
        return hotelRoomNumbers;
    }

    public void setHotelRoomNumbers(String hotelRoomNumbers) {
        this.hotelRoomNumbers = hotelRoomNumbers;
    }

    public String getHotelGuestGroupId() {
        return hotelGuestGroupId;
    }

    public void setHotelGuestGroupId(String hotelGuestGroupId) {
        this.hotelGuestGroupId = hotelGuestGroupId;
    }

    public String getHotelGroupCodes() {
        return hotelGroupCodes;
    }

    public void setHotelGroupCodes(String hotelGroupCodes) {
        this.hotelGroupCodes = hotelGroupCodes;
    }

    public String getHotelVipCodes() {
        return hotelVipCodes;
    }

    public void setHotelVipCodes(String hotelVipCodes) {
        this.hotelVipCodes = hotelVipCodes;
    }

    public Integer getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getExpiry() {
        return expiry;
    }

    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    public String getLocales() {
        return locales;
    }

    public void setLocales(String locales) {
        this.locales = locales;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BigDecimal getLatitudeStart() {
        return latitudeStart;
    }

    public void setLatitudeStart(BigDecimal latitudeStart) {
        this.latitudeStart = latitudeStart;
    }

    public BigDecimal getLongitudeStart() {
        return longitudeStart;
    }

    public void setLongitudeStart(BigDecimal longitudeStart) {
        this.longitudeStart = longitudeStart;
    }

    public BigDecimal getLatitudeEnd() {
        return latitudeEnd;
    }

    public void setLatitudeEnd(BigDecimal latitudeEnd) {
        this.latitudeEnd = latitudeEnd;
    }

    public BigDecimal getLongitudeEnd() {
        return longitudeEnd;
    }

    public void setLongitudeEnd(BigDecimal longitudeEnd) {
        this.longitudeEnd = longitudeEnd;
    }

    public String getCustomUrl() {
        return customUrl;
    }

    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
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

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getEventPlannerId() {
        return eventPlannerId;
    }

    public void setEventPlannerId(Integer eventPlannerId) {
        this.eventPlannerId = eventPlannerId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getActivatedDevices() {
        return activatedDevices;
    }

    public void setActivatedDevices(Integer activatedDevices) {
        this.activatedDevices = activatedDevices;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Messages{" +
        ", id=" + id +
        ", zoneId=" + zoneId +
        ", userId=" + userId +
        ", action=" + action +
        ", queue=" + queue +
        ", status=" + status +
        ", deviceStatus=" + deviceStatus +
        ", deviceActivationType=" + deviceActivationType +
        ", hotelIds=" + hotelIds +
        ", hotelRoomNumbers=" + hotelRoomNumbers +
        ", hotelGuestGroupId=" + hotelGuestGroupId +
        ", hotelGroupCodes=" + hotelGroupCodes +
        ", hotelVipCodes=" + hotelVipCodes +
        ", ownerType=" + ownerType +
        ", dates=" + dates +
        ", time=" + time +
        ", expiry=" + expiry +
        ", locales=" + locales +
        ", content=" + content +
        ", latitudeStart=" + latitudeStart +
        ", longitudeStart=" + longitudeStart +
        ", latitudeEnd=" + latitudeEnd +
        ", longitudeEnd=" + longitudeEnd +
        ", customUrl=" + customUrl +
        ", created=" + created +
        ", modified=" + modified +
        ", hidden=" + hidden +
        ", payload=" + payload +
        ", category=" + category +
        ", eventPlannerId=" + eventPlannerId +
        ", eventId=" + eventId +
        ", activatedDevices=" + activatedDevices +
        "}";
    }
}
