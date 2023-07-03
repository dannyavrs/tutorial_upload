package com.learn.record;

//by this one line we get a full class with constructor and getters
//you can not add setters to record
//you cannot extend to record just implement
public record EmployeeRecord(String name, int employee_number) {


    //custom constructor
    //name and employee generated automatic
    public EmployeeRecord {
        if (employee_number<0){
            throw new IllegalArgumentException("THE NUMBER CANNOT BE NEGATIVE!");
        }
    }

    //you can also add some functions to the record
    public String nameInupperCase(){
        return  name.toUpperCase();
    }
    public static void printWhatever(){
        System.out.println("whatever");
    }
}
