package com.library.app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.io.IOException;

public  class BookAndOccupation extends Pane {
    private Pane view;

    @FXML
    private Label setUserLabel;

    @FXML
    private Button setCurrentUser;


    @FXML
    private Button kitapekle;
    @FXML
    private Button seeAllBook;
    MainController mainController = new MainController();
        BookAndOccupation() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/library/BookAndOccupation.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
kitapekle.setOnMouseClicked(event -> {

     AddBook es = new AddBook();
    Scene scene = new Scene(es);
    Main.MAIN_STAGE.setScene(scene);

});
        seeAllBook.setOnMouseClicked(event -> {

            ShowBook es = new ShowBook();
            Scene scene = new Scene(es);
            Main.MAIN_STAGE.setScene(scene);
        });

        setCurrentUser.setOnMouseClicked(event -> {
            ConfigModel.getInstance().setCurrentUser(null);
            ConfigModel.sync();
            MainController es = new MainController();
            Scene scene = new Scene(es);
            Main.MAIN_STAGE.setScene(scene);
        });
        setUserLabel.setText("HOŞGELDİNİZ " + ConfigModel.getInstance().getCurrentUser().userName.toUpperCase());

        }


}
