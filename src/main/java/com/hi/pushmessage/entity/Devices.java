package com.hi.pushmessage.entity;

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
 * <p>
 * 
 * </p>
 *
 * @author Landin
 * @since 2019-04-18
 */
public class Devices extends Model<Devices> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("zone_id")
    private Integer zoneId;
    @TableField("device_user_id")
    private Integer deviceUserId;
    @TableField("devices_delivery_id")
    private Integer devicesDeliveryId;
    private String barcode;
    private String token;
    @TableField("softsim_key")
    private String softsimKey;
    private String status;
    private String model;
    @TableField("hotel_id")
    private Integer hotelId;
    @TableField("hotel_config_id")
    private Integer hotelConfigId;
    private String version;
    private String section;
    @TableField("hotel_room_number")
    private String hotelRoomNumber;
    @TableField("hotel_hide")
    private Integer hotelHide;
    private String issue;
    private String comment;
    @TableField("external_comment")
    private String externalComment;
    private String config;
    private String debug;
    @TableField("debug_package")
    private String debugPackage;
    @TableField("wifi_mac_address")
    private String wifiMacAddress;
    @TableField("service_provider")
    private String serviceProvider;
    @TableField("sim_id")
    private String simId;
    private String imsi;
    @TableField("country_code")
    private String countryCode;
    @TableField("phone_number")
    private String phoneNumber;
    @TableField("virtual_extension")
    private String virtualExtension;
    @TableField("last_online")
    private Date lastOnline;
    private BigDecimal batterylv;
    private BigDecimal latitude;
    private BigDecimal longitude;
    @TableField("last_gps")
    private Date lastGps;
    @TableField("hotel_location")
    private String hotelLocation;
    @TableField("upgrade_status")
    private String upgradeStatus;
    @TableField("device_sim_id")
    private String deviceSimId;
    private Date created;
    private Date modified;
    private Integer adb;
    private String ssid;
    @TableField("nfc_id")
    private String nfcId;
    @TableField("push_type")
    private String pushType;
    @TableField("push_package_name")
    private String pushPackageName;
    @TableField("device_type")
    private String deviceType;
    private String environment;
    @TableField("door_lock_status")
    private String doorLockStatus;


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

    public Integer getDeviceUserId() {
        return deviceUserId;
    }

    public void setDeviceUserId(Integer deviceUserId) {
        this.deviceUserId = deviceUserId;
    }

    public Integer getDevicesDeliveryId() {
        return devicesDeliveryId;
    }

    public void setDevicesDeliveryId(Integer devicesDeliveryId) {
        this.devicesDeliveryId = devicesDeliveryId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSoftsimKey() {
        return softsimKey;
    }

    public void setSoftsimKey(String softsimKey) {
        this.softsimKey = softsimKey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getHotelConfigId() {
        return hotelConfigId;
    }

    public void setHotelConfigId(Integer hotelConfigId) {
        this.hotelConfigId = hotelConfigId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getHotelRoomNumber() {
        return hotelRoomNumber;
    }

    public void setHotelRoomNumber(String hotelRoomNumber) {
        this.hotelRoomNumber = hotelRoomNumber;
    }

    public Integer getHotelHide() {
        return hotelHide;
    }

    public void setHotelHide(Integer hotelHide) {
        this.hotelHide = hotelHide;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getExternalComment() {
        return externalComment;
    }

    public void setExternalComment(String externalComment) {
        this.externalComment = externalComment;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String getDebugPackage() {
        return debugPackage;
    }

    public void setDebugPackage(String debugPackage) {
        this.debugPackage = debugPackage;
    }

    public String getWifiMacAddress() {
        return wifiMacAddress;
    }

    public void setWifiMacAddress(String wifiMacAddress) {
        this.wifiMacAddress = wifiMacAddress;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getSimId() {
        return simId;
    }

    public void setSimId(String simId) {
        this.simId = simId;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVirtualExtension() {
        return virtualExtension;
    }

    public void setVirtualExtension(String virtualExtension) {
        this.virtualExtension = virtualExtension;
    }

    public Date getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(Date lastOnline) {
        this.lastOnline = lastOnline;
    }

    public BigDecimal getBatterylv() {
        return batterylv;
    }

    public void setBatterylv(BigDecimal batterylv) {
        this.batterylv = batterylv;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public Date getLastGps() {
        return lastGps;
    }

    public void setLastGps(Date lastGps) {
        this.lastGps = lastGps;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public String getUpgradeStatus() {
        return upgradeStatus;
    }

    public void setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }

    public String getDeviceSimId() {
        return deviceSimId;
    }

    public void setDeviceSimId(String deviceSimId) {
        this.deviceSimId = deviceSimId;
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

    public Integer getAdb() {
        return adb;
    }

    public void setAdb(Integer adb) {
        this.adb = adb;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getNfcId() {
        return nfcId;
    }

    public void setNfcId(String nfcId) {
        this.nfcId = nfcId;
    }

    public String getPushType() {
        return pushType;
    }

    public void setPushType(String pushType) {
        this.pushType = pushType;
    }

    public String getPushPackageName() {
        return pushPackageName;
    }

    public void setPushPackageName(String pushPackageName) {
        this.pushPackageName = pushPackageName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getDoorLockStatus() {
        return doorLockStatus;
    }

    public void setDoorLockStatus(String doorLockStatus) {
        this.doorLockStatus = doorLockStatus;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Devices{" +
        ", id=" + id +
        ", zoneId=" + zoneId +
        ", deviceUserId=" + deviceUserId +
        ", devicesDeliveryId=" + devicesDeliveryId +
        ", barcode=" + barcode +
        ", token=" + token +
        ", softsimKey=" + softsimKey +
        ", status=" + status +
        ", model=" + model +
        ", hotelId=" + hotelId +
        ", hotelConfigId=" + hotelConfigId +
        ", version=" + version +
        ", section=" + section +
        ", hotelRoomNumber=" + hotelRoomNumber +
        ", hotelHide=" + hotelHide +
        ", issue=" + issue +
        ", comment=" + comment +
        ", externalComment=" + externalComment +
        ", config=" + config +
        ", debug=" + debug +
        ", debugPackage=" + debugPackage +
        ", wifiMacAddress=" + wifiMacAddress +
        ", serviceProvider=" + serviceProvider +
        ", simId=" + simId +
        ", imsi=" + imsi +
        ", countryCode=" + countryCode +
        ", phoneNumber=" + phoneNumber +
        ", virtualExtension=" + virtualExtension +
        ", lastOnline=" + lastOnline +
        ", batterylv=" + batterylv +
        ", latitude=" + latitude +
        ", longitude=" + longitude +
        ", lastGps=" + lastGps +
        ", hotelLocation=" + hotelLocation +
        ", upgradeStatus=" + upgradeStatus +
        ", deviceSimId=" + deviceSimId +
        ", created=" + created +
        ", modified=" + modified +
        ", adb=" + adb +
        ", ssid=" + ssid +
        ", nfcId=" + nfcId +
        ", pushType=" + pushType +
        ", pushPackageName=" + pushPackageName +
        ", deviceType=" + deviceType +
        ", environment=" + environment +
        ", doorLockStatus=" + doorLockStatus +
        "}";
    }
}
