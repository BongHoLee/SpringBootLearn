package bh.bongho.demospring18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demospring18Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demospring18Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
