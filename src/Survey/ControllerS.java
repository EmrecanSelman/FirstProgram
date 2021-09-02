package Survey;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import sample.MyButton;

import java.io.IOException;

public class ControllerS extends Pane {
    @FXML
    private Button NextPage;
    @FXML
    private Button login;

    ControllerS() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SurveyF.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        NextPage.setOnMouseClicked(e -> {
            new SecondPage();
            getChildren().add(new SecondPage());


        });
        login.setOnMouseClicked(e -> {
            new LoginScreen();
            getChildren().add(new LoginScreen());
        });
    }







}