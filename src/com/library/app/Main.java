package com.library.app;

import ChangingScreen.FirstController;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage MAIN_STAGE;
    @Override
    public void start(Stage primaryStage) {
        MAIN_STAGE = primaryStage;
        Parent root = new MainController();
        primaryStage.setTitle("KÜTÜPHANE UYGULAMASI");
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image("com/library/app/resources/Apps-Library-icon.png"));
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
