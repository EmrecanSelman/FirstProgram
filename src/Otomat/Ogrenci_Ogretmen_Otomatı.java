package Otomat;

import CALCULATOR.ControllerCal;
import Music.ConfigModel;
import Music.MusicPlayer;
import Music.loginC;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Ogrenci_Ogretmen_Otomatı extends Application {



    @Override
    public void start(Stage primaryStage) {
        Parent root = new ControllerMain();
        primaryStage.setTitle("Öğrenci bilgi sistemi");
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image("Otomat/girne-american-university.png"));
        primaryStage.setResizable(false);
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }
}
