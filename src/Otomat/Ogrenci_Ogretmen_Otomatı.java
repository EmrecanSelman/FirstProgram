package Otomat;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Ogrenci_Ogretmen_Otomatı extends Application {


    public static Stage MAIN_STAGE;

    @Override
    public void start(Stage primaryStage) {
        MAIN_STAGE = primaryStage;

        Parent root;
        if (ConfigModel.getInstance().getCurrentUser() != null) {
            root = new LoginControllerStudent();
        } else {
            root = new ControllerMain();

        }
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
