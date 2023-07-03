package com.learn.generics;

public class Animal {
    protected String species;
    protected String habitat;

    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }

    public void move() {
        System.out.println("The " + species + " is moving.");
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }

    public void sleep() {
        System.out.println("The " + species + " is sleeping.");
    }
}
