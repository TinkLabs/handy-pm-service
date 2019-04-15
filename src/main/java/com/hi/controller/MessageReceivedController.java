package com.hi.controller;
import cn.hutool.core.util.ObjectUtil;
import com.hi.bo.MessageReceivedBo;
import com.hi.PushMessageCodeEnum;
import com.hi.service.MessageReceivedService;
import com.tinklabs.corecommonbase.exception.BusinessException;
import com.tinklabs.corecommonbase.response.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/v1/messageReceived")
public class MessageReceivedController extends BaseController{
    @Autowired
    private MessageReceivedService messageReceivedService;
    @Autowired
    protected HttpServletRequest request;
    @ResponseBody
    @RequestMapping("/hello")
    public RestResponse<String> hello() throws BusinessException {
        RestResponse<String> result = new RestResponse<>();
        log.info("test trace id {}");
        result.setData("success.");
        return result;
    }
    /**
     * @description  for device acknowledge the receipt of the message
     * @author Landin
     * @date 2019-04-12 16:40
     * @param messageReceivedBo
     * @return com.tinklabs.corecommonbase.response.RestResponse<CountryDto>
     */
    @ResponseBody
    @PostMapping("/acknowledge")
    public RestResponse<Boolean> acknowledge(@RequestBody MessageReceivedBo messageReceivedBo){
        if(ObjectUtil.isNull(messageReceivedBo) || (ObjectUtil.isNotNull(messageReceivedBo) && ObjectUtil.isNull(messageReceivedBo.getMessageInfoId()))){
            throw new BusinessException(PushMessageCodeEnum.MESSASGE_INFO_ID_EMPTY.getCode(),PushMessageCodeEnum.MESSASGE_INFO_ID_EMPTY.getMessage());
        }
        RestResponse<Boolean> response = new RestResponse<>();
        messageReceivedBo.setAcknowledgeDatetime(new Date());
        messageReceivedService.sendAcknowledgeMessage(messageReceivedBo);
        response.setData(true);
        return response;
    }

}
