package com.learn.lambda;

public class Lambda1 {
    public static void main(String[] args) {

       // lambda void method
        Printable printable=()-> System.out.println("hello");
        printThing(printable);

        //lambda with type
        Printable1 printable1=(s)-> {
            System.out.println("Meow"+ s);
        };
        printThing1(printable1);

        //lambda with return
        Printable2 printable2=(s)-> "Meow"+s;





    }



    private static void printThing1(Printable1 printable) {
        printable.print1("!");
    }

    static void printThing(Printable thing){
        thing.print();
    }
}
