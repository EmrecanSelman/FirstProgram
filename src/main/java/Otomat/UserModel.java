package Otomat;

public class UserModel {
    String password;
    String userName;
    String tcNo;
    String mail;
    UserType type;

    public UserModel(String userName,String password,String  tcNo,String mail,UserType type){
        this.userName=userName;
        this.password=password;
        this.tcNo=tcNo;
        this.mail=mail;
        this.type=type;
    }
}
