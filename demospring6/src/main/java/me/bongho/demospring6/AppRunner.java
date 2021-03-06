package me.bongho.demospring6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

   // @Autowired
    //BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment envir = context.getEnvironment();
        System.out.println(envir.getProperty("app.about"));
    }
}
