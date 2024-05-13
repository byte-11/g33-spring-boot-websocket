package uz.pdp.g33springbootwebsocket.domain;

import java.util.Random;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private Long id = new Random().nextLong();
    private String sender;
    private String content;

    public ChatMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }
}
