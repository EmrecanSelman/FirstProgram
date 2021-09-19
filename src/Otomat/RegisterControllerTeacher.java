package Otomat;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class RegisterControllerTeacher extends Pane {
    RegisterControllerTeacher() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("RegisterControllerTeacher.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}