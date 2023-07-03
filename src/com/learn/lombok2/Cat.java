package com.learn.lombok2;

import lombok.*;

@Data
//HAS GETTER SETTER TO STRING HASHCODE
public class Cat {
    private String name;
    private int serial_number;

    public Cat(String name, int serialNumber) {
        this.name = name;
        serial_number = serialNumber;
    }
}
