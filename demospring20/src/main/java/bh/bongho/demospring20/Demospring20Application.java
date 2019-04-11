package bh.bongho.demospring20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demospring20Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demospring20Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
