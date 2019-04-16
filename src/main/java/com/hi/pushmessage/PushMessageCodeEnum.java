package com.hi.pushmessage;

/**
 * @description:
 * @author: Landin
 * @date: 2019-04-12
 **/
public enum PushMessageCodeEnum {

    MESSASGE_INFO_ID_EMPTY("500001","The messageInfoId is empty, please take in."),
    FAILED_TO_SEND_MESSAGE_EXCEPTION("500002","Failed to Send acknowledge message to kafka.");
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
