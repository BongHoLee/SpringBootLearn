package me.bongho.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        //고전정인 방법으로 스프링 빈 설정파일을 사용
        //ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        BookService bookService = (BookService)context.getBean("bookService");
        ApplicationConfig aconfig = new ApplicationConfig();
        aconfig.bookService();
        System.out.println(bookService.bookRepository.age);

    }

}
