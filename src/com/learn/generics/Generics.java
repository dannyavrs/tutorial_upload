package com.learn.generics;

import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Printer<Integer>printer=new Printer<>(23);
        Printer<Double>doublePrinter=new Printer<>(23.1);
        printer.print();
        // do not use <Object>!
        PrinterAnimal<Cat>catPrinterAnimal=new PrinterAnimal<>(new Cat("Bitton","Meow","lol"));
        catPrinterAnimal.print();

        //generic can implement unlimited interfaces but extends one class

        shout(1,"yes");
        System.out.println(shout1(2,"hello"));


    }
    // VOID GENERIC METHOD
    private static <T,V> void shout(T thingToShout,V other){
        System.out.println(thingToShout+ "!!!"+" "+other);
    }
    //RETURN GENERIC METHOD
    private static <T,V> T shout1(T thingToShout,V other){

        return thingToShout;
    }

    //WILD CARD
    //we can create a list with different variables as we want .but they extend Animal
    private static void PrintList(List<? extends Animal>mylist){
        System.out.println(mylist);
    }

}
