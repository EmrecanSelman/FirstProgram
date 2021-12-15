package sample;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class polyushka_polye extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = new polyushka_controller();
        primaryStage.setTitle("Başlık");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}