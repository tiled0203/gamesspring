package be.smal.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GamesApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GamesApplication.class).profiles("dev").build().run();
    }

}
