package Music;

public class User {
    private String username;
    private String password;
    private String mail;

    public User(String username, String password, String mail) throws Exception {
        if (username.equals("") || password.equals("") || mail.equals(""))
            throw new Exception("Bazı değerler boş olamaz");
        this.username = username;
        this.password = password;
        this.mail = mail;
    }

    public boolean canLogin(String userEntry, String password) {
        return (userEntry.equals(this.username) && password.equals(this.password)) ||
                (userEntry.equals(this.mail)&&password.equals(this.password));
    }

}
