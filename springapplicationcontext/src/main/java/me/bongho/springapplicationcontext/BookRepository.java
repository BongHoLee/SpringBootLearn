package me.bongho.springapplicationcontext;


import org.springframework.stereotype.Repository;

import java.util.Random;


public class BookRepository {
    String name;
    int age;

    public BookRepository() {
        Random rand = new Random();
        int age = rand.nextInt(50);
        setAge(age);
        System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
