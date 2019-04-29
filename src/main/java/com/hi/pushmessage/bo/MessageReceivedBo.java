package com.hi.pushmessage.bo;

import lombok.Data;
import java.util.Date;

/**
 * * @description:
 * @author: Landin
 * @date: 2019-04-12
 **/
@Data
public class MessageReceivedBo {
    Integer messageInfoId;
    String imei;
    Date acknowledgeDatetime;
}
