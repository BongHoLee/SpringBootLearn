package me.bongho.demospring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class BookServiceRunner implements ApplicationRunner {

//    @Autowired
//    BookService bookService;

    @Autowired
    ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        AutowiredAnnotationBeanPostProcessor bean = context.getBean(AutowiredAnnotationBeanPostProcessor.class);
        System.out.println(bean);
    }
}
