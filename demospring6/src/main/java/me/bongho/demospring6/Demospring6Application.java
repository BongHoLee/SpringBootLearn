package me.bongho.demospring6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class Demospring6Application {

    public static void main(String[] args) {

        SpringApplication.run(Demospring6Application.class, args);
    }

}
