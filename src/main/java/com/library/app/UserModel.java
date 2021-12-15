package com.library.app;

public class UserModel {
    String userName;
    String password;
    String phoneNumber;
    String mail;

    public UserModel(String userName, String password, String phoneNumber, String mail) {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }
}
