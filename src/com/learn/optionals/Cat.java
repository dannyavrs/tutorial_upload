package com.learn.optionals;

import lombok.Data;

@Data
public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void meow(){
        System.out.println("meow");
    }
}
