package com.learn.recursion;

public class Recursion1 {
    public static void main(String[] args) {
        //Recursion is when method calls itself
        sayHi(3);
    }

    private static void sayHi(int count) {
        System.out.println("Hi");
        //you have to add a condition to stop the recursion
        //if you do not, the method will call itself unlimited times ,and it will cause stack overflow
        if(count<=1){
            return;
        }
        sayHi(count-1);
    }
}
