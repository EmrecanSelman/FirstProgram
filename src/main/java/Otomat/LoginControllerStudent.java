package Otomat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginControllerStudent extends Pane implements Initializable {

    @FXML
    private Button exitButton;
    LoginControllerStudent() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginControllerStudent.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        exitButton.setOnMouseClicked(event -> {

            ConfigModel.getInstance().setCurrentUser(null);
            ConfigModel.sync();
            ControllerMain es = new ControllerMain();
            Scene scene = new Scene(es);
            Ogrenci_Ogretmen_Otomatı.MAIN_STAGE.setScene(scene);

        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}