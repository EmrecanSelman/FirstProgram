package com.library.app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.sql.SQLException;

public class AddBook extends Pane {

    @FXML
    private TextField addBookName;

    @FXML
    private TextField addPageNumber;

    @FXML
    private TextField addWriterName;

    @FXML
    private Button AddBookButton;
    @FXML
    private Button addpagecomebackbutton;
    AddBook() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/library/AddBook.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        addPageNumber.textProperty().addListener((observable, oldValue, newValue) -> {
                    if (!newValue.matches("\\d*")) {
                        addPageNumber.setText(newValue.replaceAll("[^\\d]", ""));//sayı dışında bir değer girdiğimizde değeeri alıp yazmaz sadece sayı yazmamızı sağlar.
                    }
                    if (newValue.length() > oldValue.length()) {
                        // Check if the new character is greater than LIMIT
                        if (addPageNumber.getText().length() >= 6) { // alacağımız değere sınır koyduk.

                            // if it's 11th character then just setText to previous
                            // one
                            addPageNumber.setText(addPageNumber.getText().substring(0, 6));
                        }
                    }
                });

AddBookButton.setOnMouseClicked(event -> {
    if(addBookName.getText().trim().isEmpty() || addWriterName.getText().trim().isEmpty() || addPageNumber.getText().trim().isEmpty()){
        Alert fail = new Alert(Alert.AlertType.INFORMATION);
        fail.setHeaderText("Başarısız");
        fail.setContentText("Boş bıraktığınız yerleri lütfen doldurun");
        fail.showAndWait();    }
    else
        try {
        BookList.ekle(addPageNumber.getText(),addWriterName.getText(),addBookName.getText());
        addPageNumber.setText("");
        addBookName.setText("");
        addWriterName.setText("");
    } catch (SQLException exception) {
        exception.printStackTrace();
    }

});
        addpagecomebackbutton.setOnMouseClicked(event -> {
            BookAndOccupation es = new BookAndOccupation();
            Scene scene = new Scene(es);
            Main.MAIN_STAGE.setScene(scene);
        });

}}
