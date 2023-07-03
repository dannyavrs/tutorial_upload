package com.learn.oophomework;

import lombok.Data;

@Data
public class Authors {
    private int id;
    private String firstname;
    private String lastname;

    public Authors(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
