package Music;


import java.util.ArrayList;
import java.util.List;

public class ConfigModel {
    private List<User> userList = new ArrayList<>();
    private User currentUser = null;
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

    public List<User> getUserList() {
        return userList;
    }

    public User getCurrentUser() {
        return currentUser;
    }
    public void setCurrentUser(User user) {
         currentUser=user;
    }
}
