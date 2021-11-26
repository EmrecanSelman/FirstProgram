package com.library.app;

import Otomat.UserType;
import javafx.scene.control.TextField;

public class UserModel {
    TextField userName;
    TextField password;
    TextField phoneNumber;
    TextField mail;


    public UserModel(TextField userName, TextField password, TextField phoneNumber, TextField mail){
        this.userName=userName;
        this.password=password;
        this.phoneNumber=phoneNumber;
        this.mail=mail;

    }
}
