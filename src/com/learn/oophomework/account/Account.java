package com.learn.oophomework.account;

import lombok.Data;

import java.awt.font.TransformAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

@Data
public class Account {
    private int id;
    private ArrayList<Transacion>transacionList;

    public Account(int id, ArrayList<Transacion> transacionList) {
        this.id = id;
        this.transacionList = transacionList;
    }


    public void sendMoneyToAccount(Account accountTo, double moneyAmount){
        if(accountTo==null){
            return;
        }
        else if(moneyAmount<=0){
            return;
        }
        Transacion transacion=new Transacion(this,accountTo,moneyAmount,StandartAccountOperations.MONEY_TRANSFER_SEND);
        transacionList.add(transacion);
        System.out.println("Transaction added!");
    }
    public void withdrawMoney(double moneyAmount){
        Transacion transacion=new Transacion(this,null,moneyAmount,StandartAccountOperations.WITHDRAW);
        transacionList.add(transacion);
        System.out.println("Transaction added!");
    }

@Data
    private class Transacion {
        private Account accountFrom;
        private Account accountTo;
        private double moneyAmount;
        private StandartAccountOperations operation;

    public Transacion(Account accountFrom, Account accountTo, double moneyAmount, StandartAccountOperations operation) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.moneyAmount = moneyAmount;
        this.operation = operation;
    }



}
}
