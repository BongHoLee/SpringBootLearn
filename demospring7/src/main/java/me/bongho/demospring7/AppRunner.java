package me.bongho.demospring7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        messageSource.getMessage("greeting", new String[]{"bongho"}, Locale.KOREA);
        messageSource.getMessage("greeting", new String[]{"bongho"}, Locale.US);
    }
}
