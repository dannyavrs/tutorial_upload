package com.learn.comparble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Demo {
    public static void main(String[] args) {
        BankPriority b1=new BankPriority("Moshe",1, BankPriority.Priority.HIGH);
        BankPriority b2=new BankPriority("Avishai",2, BankPriority.Priority.MEDIUM);
        BankPriority b3=new BankPriority("Danny",3, BankPriority.Priority.LOW);

        ArrayList<BankPriority>bankPriorities=new ArrayList<>(Arrays.asList(b1,b2,b3));
        Collections.sort(bankPriorities, (o1, o2) -> Integer.compare(o2.getPriorityValue(),o1.getPriorityValue()));
        for (BankPriority user : bankPriorities) {
            System.out.println("Username: " + user.getUsername() + ", User ID: " + user.getUserId() + ", Priority: " + user.getPriority() + " (" + user.getPriorityValue() + ")");
        }
    }




}
