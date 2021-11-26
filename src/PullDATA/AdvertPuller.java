package PullDATA;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AdvertPuller extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = new AdvertPullerController();
        primaryStage.setTitle("İlandan bilgi çekme");
        primaryStage.setScene(new Scene(root));

        primaryStage.setResizable(false);
        primaryStage.show();


    }
}
