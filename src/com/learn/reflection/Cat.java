package com.learn.reflection;

import lombok.Data;

@Data
public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }
    private void heythisisPrivate(){
        System.out.println("how did you call this");
    }
    public static void thisispublicandstaticMethod(){
        System.out.println("I'm public and static!");
    }
    private static void thisisaprivatestaticMethod(){
        System.out.println("I'm private and static!");
    }
    public void meow(){
        System.out.println("meow");
    }
}
