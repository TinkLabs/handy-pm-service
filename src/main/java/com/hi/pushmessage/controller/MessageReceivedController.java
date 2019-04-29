package com.hi.pushmessage.controller;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.hi.pushmessage.bo.MessageReceivedBo;
import com.hi.pushmessage.common.Consts;
import com.hi.pushmessage.common.PushMessageCodeEnum;
import com.hi.pushmessage.service.DevicesService;
import com.hi.pushmessage.service.MessageReceivedService;
import com.tinklabs.corecommonbase.exception.BusinessException;
import com.tinklabs.corecommonbase.response.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @description: provide message received related endpoint
 * @author: Landin
 * @date: 2019-04-12
 **/
@RestController
@Slf4j
@RequestMapping("/v1")
public class MessageReceivedController extends BaseController{
    @Autowired
    private MessageReceivedService messageReceivedService;
    @Autowired
    private DevicesService devicesService;
    @Autowired
    protected HttpServletRequest request;
    @ResponseBody
    @RequestMapping("/hello")
    public RestResponse<String> hello() throws BusinessException {
        RestResponse<String> result = new RestResponse<>();
        log.debug("test trace id {}");
        result.setData("success.");
        return result;
    }

    /**
     * @description  for device acknowledge the receipt of the message
     * @author Landin
     * @date 2019-04-29 14:22
     * @param message_info_id, barcode
     * @return com.tinklabs.corecommonbase.response.RestResponse<java.lang.Boolean>
     */
    @ResponseBody
    @PostMapping("/acknowledge/{message_info_id}")
    public RestResponse<Boolean> acknowledge(@PathVariable Integer message_info_id, @CookieValue("barcode") String barcode){
        if(ObjectUtil.isNull(message_info_id)){
            throw new BusinessException(PushMessageCodeEnum.MESSASGE_INFO_ID_EMPTY.getCode(),PushMessageCodeEnum.MESSASGE_INFO_ID_EMPTY.getMessage());
        }
        Wrapper wrapper = new EntityWrapper();
        wrapper.eq(Consts.BARCODE, barcode);
        int count = devicesService.selectCount(wrapper);
        if(count == 0){
            throw new BusinessException(PushMessageCodeEnum.IMEI_NO_EXIST.getCode(),PushMessageCodeEnum.IMEI_NO_EXIST.getMessage());
        }
        RestResponse<Boolean> response = new RestResponse<>();
        MessageReceivedBo messageReceivedBo = new MessageReceivedBo();
        messageReceivedBo.setAcknowledgeDatetime(new Date());
        messageReceivedBo.setImei(barcode);
        messageReceivedBo.setMessageInfoId(message_info_id);
        messageReceivedService.sendAcknowledgeMessage(messageReceivedBo);
        response.setData(true);
        return response;
    }

}
