package com.learn.generics;

public class Cat extends Animal{
    private String name;
    private String breed;

    public Cat(String name, String breed, String habitat) {
        super("cat", habitat);
        this.name = name;
        this.breed = breed;
    }

    public void meow() {
        System.out.println(name + " the " + breed + " meows.");
    }

    public void purr() {
        System.out.println(name + " the " + breed + " purrs.");
    }

    public void scratch() {
        System.out.println(name + " the " + breed + " scratches.");
    }
}
