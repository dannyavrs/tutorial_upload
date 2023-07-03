package com.learn.generics;

public class PrinterAnimal <T extends Animal>{
    T thingToPrint;

    public PrinterAnimal(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        //extends from animal class
        thingToPrint.eat();
        //from cat class
        String habitat=thingToPrint.habitat;
        System.out.println(habitat);
    }

}
