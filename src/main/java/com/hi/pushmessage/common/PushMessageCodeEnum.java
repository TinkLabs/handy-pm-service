package com.hi.pushmessage.common;

/**
 * @description:
 * @author: Landin
 * @date: 2019-04-12
 **/
public enum PushMessageCodeEnum {

    MESSASGE_INFO_ID_EMPTY("500001","The messageInfoId is empty."),
    HEADER_NO_IMEI("500002","Header no taking in Device-IMEI."),
    IMEI_NO_EXIST("500003","The DEVICE-IMEI does not exist"),
    DEVICE_IMEI_DUPLICATE("500004","The DEVICE-IMEI duplicate."),
    RECIPIENT_DUPLICATE("500005","The recipients with the same messageinfo and hotel room duplicate."),
    FAILED_TO_SEND_MESSAGE_EXCEPTION("500006","Failed to Send acknowledge message to kafka.");
    private String code;
    private String message;
    PushMessageCodeEnum(String code, String message){
        this.code = code;
        this.message = message;
    }
    public String getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
}
