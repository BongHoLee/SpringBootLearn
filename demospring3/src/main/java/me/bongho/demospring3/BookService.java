package me.bongho.demospring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {

    //@Autowired @Qualifier("myBookRepository")
    //BookRepository bookRepository;

    //@Autowired
    //List<BookRepository> bookRepositories;      //모든 BookRepository를 주입받음.

    @Autowired
    BookRepository myBookRepository;            //bean이름으로 주입 가능

    public void printBookRepo(){
        System.out.println(myBookRepository.getClass());
    }

    @PostConstruct      //bean이 만들어진 뒤에 할 일 정의 가능한 라이프사이클 콜백
    public void setUp(){

    }



}
