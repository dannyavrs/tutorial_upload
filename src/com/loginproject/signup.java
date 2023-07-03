package com.loginproject;

import lombok.Data;

@Data
public class signup {
    private String username;
    private String password;

    public signup(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean validUsername(){
        if(this.username.length()<=9){
            System.out.println("The username is not long enough! at least 9 characters");
        }
        return true;
    }
}

