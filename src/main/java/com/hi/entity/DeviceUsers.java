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
@TableName("device_users")
public class DeviceUsers extends Model<DeviceUsers> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("device_id")
    private Integer deviceId;
    @TableField("member_id")
    private Integer memberId;
    @TableField("hotel_id")
    private Integer hotelId;
    @TableField("hotel_room_number")
    private String hotelRoomNumber;
    @TableField("hotel_group_code")
    private String hotelGroupCode;
    @TableField("hotel_vip_code")
    private String hotelVipCode;
    @TableField("hotel_guest_id")
    private String hotelGuestId;
    @TableField("hotel_guest_name_id")
    private String hotelGuestNameId;
    @TableField("hotel_guest_group_id")
    private String hotelGuestGroupId;
    @TableField("hotel_guest_checkin_date")
    private Date hotelGuestCheckinDate;
    @TableField("hotel_guest_checkout_date")
    private Date hotelGuestCheckoutDate;
    @TableField("hotel_guest_express_checkout_datetime")
    private Date hotelGuestExpressCheckoutDatetime;
    @TableField("hotel_guest_integration_data")
    private String hotelGuestIntegrationData;
    @TableField("activation_datetime")
    private Date activationDatetime;
    @TableField("return_datetime")
    private Date returnDatetime;
    @TableField("scheduled_return_datetime")
    private Date scheduledReturnDatetime;
    @TableField("first_name")
    private String firstName;
    @TableField("last_name")
    private String lastName;
    private String salutation;
    private String language;
    @TableField("stripe_customer_id")
    private String stripeCustomerId;
    @TableField("paydollar_member_id")
    private String paydollarMemberId;
    @TableField("last_payment")
    private Date lastPayment;
    @TableField("cc_type")
    private String ccType;
    @TableField("cc_name")
    private String ccName;
    @TableField("cc_number")
    private String ccNumber;
    @TableField("cc_fingerprint")
    private String ccFingerprint;
    @TableField("cc_expiry")
    private String ccExpiry;
    private String email;
    @TableField("ui_states")
    private String uiStates;
    @TableField("outside_hotel")
    private Integer outsideHotel;
    private Integer dnd;
    private Date created;
    private Date modified;
    @TableField("is_paying")
    private String isPaying;
    @TableField("payment_token")
    private String paymentToken;
    private String remarks;
    @TableField("gdpr_accepted")
    private Integer gdprAccepted;
    /**
     * 0:non-opted-in 1:opted-in
     */
    @TableField("opted_in")
    private Integer optedIn;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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

    public String getHotelGroupCode() {
        return hotelGroupCode;
    }

    public void setHotelGroupCode(String hotelGroupCode) {
        this.hotelGroupCode = hotelGroupCode;
    }

    public String getHotelVipCode() {
        return hotelVipCode;
    }

    public void setHotelVipCode(String hotelVipCode) {
        this.hotelVipCode = hotelVipCode;
    }

    public String getHotelGuestId() {
        return hotelGuestId;
    }

    public void setHotelGuestId(String hotelGuestId) {
        this.hotelGuestId = hotelGuestId;
    }

    public String getHotelGuestNameId() {
        return hotelGuestNameId;
    }

    public void setHotelGuestNameId(String hotelGuestNameId) {
        this.hotelGuestNameId = hotelGuestNameId;
    }

    public String getHotelGuestGroupId() {
        return hotelGuestGroupId;
    }

    public void setHotelGuestGroupId(String hotelGuestGroupId) {
        this.hotelGuestGroupId = hotelGuestGroupId;
    }

    public Date getHotelGuestCheckinDate() {
        return hotelGuestCheckinDate;
    }

    public void setHotelGuestCheckinDate(Date hotelGuestCheckinDate) {
        this.hotelGuestCheckinDate = hotelGuestCheckinDate;
    }

    public Date getHotelGuestCheckoutDate() {
        return hotelGuestCheckoutDate;
    }

    public void setHotelGuestCheckoutDate(Date hotelGuestCheckoutDate) {
        this.hotelGuestCheckoutDate = hotelGuestCheckoutDate;
    }

    public Date getHotelGuestExpressCheckoutDatetime() {
        return hotelGuestExpressCheckoutDatetime;
    }

    public void setHotelGuestExpressCheckoutDatetime(Date hotelGuestExpressCheckoutDatetime) {
        this.hotelGuestExpressCheckoutDatetime = hotelGuestExpressCheckoutDatetime;
    }

    public String getHotelGuestIntegrationData() {
        return hotelGuestIntegrationData;
    }

    public void setHotelGuestIntegrationData(String hotelGuestIntegrationData) {
        this.hotelGuestIntegrationData = hotelGuestIntegrationData;
    }

    public Date getActivationDatetime() {
        return activationDatetime;
    }

    public void setActivationDatetime(Date activationDatetime) {
        this.activationDatetime = activationDatetime;
    }

    public Date getReturnDatetime() {
        return returnDatetime;
    }

    public void setReturnDatetime(Date returnDatetime) {
        this.returnDatetime = returnDatetime;
    }

    public Date getScheduledReturnDatetime() {
        return scheduledReturnDatetime;
    }

    public void setScheduledReturnDatetime(Date scheduledReturnDatetime) {
        this.scheduledReturnDatetime = scheduledReturnDatetime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStripeCustomerId() {
        return stripeCustomerId;
    }

    public void setStripeCustomerId(String stripeCustomerId) {
        this.stripeCustomerId = stripeCustomerId;
    }

    public String getPaydollarMemberId() {
        return paydollarMemberId;
    }

    public void setPaydollarMemberId(String paydollarMemberId) {
        this.paydollarMemberId = paydollarMemberId;
    }

    public Date getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(Date lastPayment) {
        this.lastPayment = lastPayment;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCcFingerprint() {
        return ccFingerprint;
    }

    public void setCcFingerprint(String ccFingerprint) {
        this.ccFingerprint = ccFingerprint;
    }

    public String getCcExpiry() {
        return ccExpiry;
    }

    public void setCcExpiry(String ccExpiry) {
        this.ccExpiry = ccExpiry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUiStates() {
        return uiStates;
    }

    public void setUiStates(String uiStates) {
        this.uiStates = uiStates;
    }

    public Integer getOutsideHotel() {
        return outsideHotel;
    }

    public void setOutsideHotel(Integer outsideHotel) {
        this.outsideHotel = outsideHotel;
    }

    public Integer getDnd() {
        return dnd;
    }

    public void setDnd(Integer dnd) {
        this.dnd = dnd;
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

    public String getIsPaying() {
        return isPaying;
    }

    public void setIsPaying(String isPaying) {
        this.isPaying = isPaying;
    }

    public String getPaymentToken() {
        return paymentToken;
    }

    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getGdprAccepted() {
        return gdprAccepted;
    }

    public void setGdprAccepted(Integer gdprAccepted) {
        this.gdprAccepted = gdprAccepted;
    }

    public Integer getOptedIn() {
        return optedIn;
    }

    public void setOptedIn(Integer optedIn) {
        this.optedIn = optedIn;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "DeviceUsers{" +
        ", id=" + id +
        ", deviceId=" + deviceId +
        ", memberId=" + memberId +
        ", hotelId=" + hotelId +
        ", hotelRoomNumber=" + hotelRoomNumber +
        ", hotelGroupCode=" + hotelGroupCode +
        ", hotelVipCode=" + hotelVipCode +
        ", hotelGuestId=" + hotelGuestId +
        ", hotelGuestNameId=" + hotelGuestNameId +
        ", hotelGuestGroupId=" + hotelGuestGroupId +
        ", hotelGuestCheckinDate=" + hotelGuestCheckinDate +
        ", hotelGuestCheckoutDate=" + hotelGuestCheckoutDate +
        ", hotelGuestExpressCheckoutDatetime=" + hotelGuestExpressCheckoutDatetime +
        ", hotelGuestIntegrationData=" + hotelGuestIntegrationData +
        ", activationDatetime=" + activationDatetime +
        ", returnDatetime=" + returnDatetime +
        ", scheduledReturnDatetime=" + scheduledReturnDatetime +
        ", firstName=" + firstName +
        ", lastName=" + lastName +
        ", salutation=" + salutation +
        ", language=" + language +
        ", stripeCustomerId=" + stripeCustomerId +
        ", paydollarMemberId=" + paydollarMemberId +
        ", lastPayment=" + lastPayment +
        ", ccType=" + ccType +
        ", ccName=" + ccName +
        ", ccNumber=" + ccNumber +
        ", ccFingerprint=" + ccFingerprint +
        ", ccExpiry=" + ccExpiry +
        ", email=" + email +
        ", uiStates=" + uiStates +
        ", outsideHotel=" + outsideHotel +
        ", dnd=" + dnd +
        ", created=" + created +
        ", modified=" + modified +
        ", isPaying=" + isPaying +
        ", paymentToken=" + paymentToken +
        ", remarks=" + remarks +
        ", gdprAccepted=" + gdprAccepted +
        ", optedIn=" + optedIn +
        "}";
    }
}
