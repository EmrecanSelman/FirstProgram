package Music;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Optional;

public class Second extends AnchorPane {


    private final loginC loginC;
    private ImageView imge;


    Second(loginC loginC) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Second.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.loginC = loginC;
        loginC.getValue();
        Optional<User> optional = ConfigModel.getInstance().getUserList().stream().filter(user -> user.canLogin("userEntry.getText()", "userPassword.getText()")).findFirst();
        if (optional.isPresent()) {
            User userr = optional.get();
            System.out.println(" giriş");

        } else System.out.println("Hatalı giriş");

    }

    public int getValue() {

        return 5;
    }


}