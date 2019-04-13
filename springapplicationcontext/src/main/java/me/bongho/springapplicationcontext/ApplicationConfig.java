package me.bongho.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Random;


//application.xml과 같은 bean 설정 파일이다. 단지 java 파일!
@Configuration
@ComponentScan(basePackageClasses = DemoApplication.class)  //DemoApplication.class 위치부터 스캔하여 bean으로 등록하기
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository() {
        BookRepository bookRepository = new BookRepository();
        return bookRepository;

    }

    @Bean
    public BookService bookService() {
        BookService bookService = new BookService();
        System.out.println("bookService!!!!!!");
        bookService.setBookRepository(bookRepository());
        return bookService;
    }

}
