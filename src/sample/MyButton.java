package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MyButton extends BorderPane {

    MyButton() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MyButton.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}