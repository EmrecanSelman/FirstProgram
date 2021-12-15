package CALCULATOR;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = new ControllerCal();
        stage.setTitle("Calculator");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.initStyle(StageStyle.UTILITY);
        stage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }

}
