package Otomat;


import java.util.ArrayList;
import java.util.List;

public class ConfigModel {
    private List<UserModel> userList = new ArrayList<>();
    private UserModel currentUser = null;
    private static ConfigModel instance;

    static {
        instance = WriterReaderHelper.readFromFile();
    }

    public static ConfigModel getInstance() {
        if (instance == null) instance = new ConfigModel();
        return instance;
    }

    public static void sync() {
        WriterReaderHelper.writeToFile(instance);
    }

    public List<UserModel> getUserList() {
        return userList;
    }

    public UserModel getCurrentUser() {
        return currentUser;
    }
    public void setCurrentUser(UserModel user) {
         currentUser=user;
    }
}
