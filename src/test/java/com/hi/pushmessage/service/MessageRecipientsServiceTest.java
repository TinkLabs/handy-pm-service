package com.hi.pushmessage.service;

import com.hi.pushmessage.PmServiceApplication;
import com.hi.pushmessage.entity.MessageRecipients;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

/**
* description:
* @author Landin
* @date 2019-04-12
*/
@RunWith(SpringRunner.class )
@SpringBootTest(classes = PmServiceApplication.class ,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class MessageRecipientsServiceTest {

    @Autowired
    private MessageRecipientsService messageRecipientsService;

    @Test
    public void findNotReceivedMessageRecipientsTest() {
        Integer messageInfoId = 238;
        Integer deviceUserId = 51;
        List<MessageRecipients> messageRecipients = messageRecipientsService.findNotReceivedMessageRecipients(messageInfoId, "355655090315419");
        assertThat(1).isEqualTo(messageRecipients.size());

    }

}