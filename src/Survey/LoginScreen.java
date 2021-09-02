package Survey;

import javafx.fxml.FXMLLoader;

import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginScreen extends AnchorPane {
    LoginScreen() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginScreen.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}