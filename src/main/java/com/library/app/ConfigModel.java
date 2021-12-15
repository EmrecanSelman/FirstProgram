package com.library.app;



import com.WriterReaderHelper;

public class ConfigModel {

    private UserModel currentUser = null;
    private static ConfigModel instance;

    static {
        instance =  WriterReaderHelper.readFromFile();
    }

    public static ConfigModel getInstance() {
        if (instance == null) instance = new ConfigModel();
        return instance;
    }

    public static void sync() {
        WriterReaderHelper.writeToFile(instance);
    }



    public UserModel getCurrentUser() {
        return currentUser;
    }
    public void setCurrentUser(UserModel user) {
        currentUser=user;
    }

}
