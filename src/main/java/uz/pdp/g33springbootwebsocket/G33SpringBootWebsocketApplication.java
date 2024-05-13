package uz.pdp.g33springbootwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class G33SpringBootWebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(G33SpringBootWebsocketApplication.class, args);
    }

}
