package com.library.app;

import Otomat.UserType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public  class BookAndOccupation extends Pane {
    private Pane view;



    @FXML
    private Button kitapekle;
    @FXML
    private Button seeAllBook;
        BookAndOccupation() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("BookAndOccupation.fxml"));
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

            ShowBook es = null;
            try {
                es = new ShowBook();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            Scene scene = new Scene(es);
            Main.MAIN_STAGE.setScene(scene);
        });

}


}
