package bh.bongho.demospring16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;



@Component
public class AppRunner implements ApplicationRunner {

    //Converter, Formatter를 ConversionService에 등록
    @Autowired
    ConversionService conversionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(conversionService.getClass().toString());
    }
}
