package com.learn.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception{
        //get fields
        Cat mycat=new Cat("Stella",6);
       Field[]fields= mycat.getClass().getDeclaredFields();
       for(Field field:fields){
           System.out.println(field.getName());
       }

       //setting private fields
        for(Field field:fields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(mycat,"Jimmy"); //without anything else we will get catch exception
            }
        }
        System.out.println(mycat.getName());

        //get methods
        Method[]methods=mycat.getClass().getDeclaredMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
        }
        /* we do not need reflection with public methods
        for (Method method:methods){
            if(method.getName().equals("meow")){
                method.invoke(mycat);
            }
        }
        */
        //private methods
        for (Method method:methods){
            if(method.getName().equals("heythisisPrivate")){
                method.setAccessible(true);
                method.invoke(mycat);
            }
        }
        //private and public static methods
        for (Method method:methods){
            if(method.getName().equals("thisispublicandstaticMethod")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }


    }


}
