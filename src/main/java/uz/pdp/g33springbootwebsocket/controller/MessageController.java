package uz.pdp.g33springbootwebsocket.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.g33springbootwebsocket.domain.ChatMessage;

@RestController
@Slf4j
public class MessageController {

    private final SimpMessagingTemplate messagingTemplate;

    public MessageController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/messages}")
    @SendTo("/chat/messages")
    public ChatMessage receiveAndForwardMessage(@Payload ChatMessage message) {
        log.info(message.getSender());
        return message;
    }


    //    @Scheduled(fixedRate = 5, timeUnit = TimeUnit.SECONDS)
    public void sendMessage() {
        System.out.println("Sending message" + System.currentTimeMillis());
        messagingTemplate.convertAndSend(
                "/chat/messages",
                new ChatMessage("Bot", "Analyzing the process of subscription ["
                        + System.currentTimeMillis() + "]")
        );
    }


}
