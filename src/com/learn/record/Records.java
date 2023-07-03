package com.learn.record;

import com.learn.record.EmployeeRecord;

public class Records {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord=new EmployeeRecord("DANNY",12);
        // get the name of the employee
        System.out.println(employeeRecord.name());
        //get the number of the employee
        System.out.println(employeeRecord.employee_number());
        //use the functions
        System.out.println(employeeRecord.nameInupperCase());
        //print the employee
        System.out.println(employeeRecord);

    }
}
