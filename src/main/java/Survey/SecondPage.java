package Survey;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class SecondPage extends Pane {
    @FXML
    private Button BackButton;
    @FXML
    private Button NextLogin;

    SecondPage() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SecondPage.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BackButton.setOnMouseClicked(e -> {
            new ControllerS();
            getChildren().add(new ControllerS());
        });

    }
}
