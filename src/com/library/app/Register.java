package com.library.app;

import Otomat.ControllerMain;
import Otomat.DBHelper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register extends Pane  {
    @FXML
    private Button registrybutton;

    @FXML
    private TextField usernameRegistryText;

    @FXML
    private TextField mailRegistryText;

    @FXML
    private TextField phoneNumberText;

    @FXML
    private TextField passwordRegistryText;

    Register() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Register.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        usernameRegistryText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > oldValue.length()) {
                // Check if the new character is greater than LIMIT
                if (usernameRegistryText.getText().length() >= 20) { // alacağımız değere sınır koyduk.

                    // if it's 11th character then just setText to previous
                    // one
                    usernameRegistryText.setText(usernameRegistryText.getText().substring(0, 20));
                }
            }

        });
        passwordRegistryText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > oldValue.length()) {
                // Check if the new character is greater than LIMIT
                if (passwordRegistryText.getText().length() >= 20) { // alacağımız değere sınır koyduk.

                    // if it's 11th character then just setText to previous
                    // one
                    passwordRegistryText.setText(passwordRegistryText.getText().substring(0, 20));
                }
            }

        });
        phoneNumberText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                phoneNumberText.setText(newValue.replaceAll("[^\\d]", ""));//sayı dışında bir değer girdiğimizde değeeri alıp yazmaz sadece sayı yazmamızı sağlar.
            }
            if (newValue.length() > oldValue.length()) {
                // Check if the new character is greater than LIMIT
                if (phoneNumberText.getText().length() >= 11) { // alacağımız değere sınır koyduk.

                    // if it's 11th character then just setText to previous
                    // one
                    phoneNumberText.setText(phoneNumberText.getText().substring(0, 11));
                }
            }
        });
    registrybutton.setOnMouseClicked(event -> {
        if (usernameRegistryText.getText().trim().isEmpty() || passwordRegistryText.getText().trim().isEmpty() || phoneNumberText.getText().trim().isEmpty() || mailRegistryText.getText().trim().isEmpty()) {
            Alert fail = new Alert(Alert.AlertType.INFORMATION);
            fail.setHeaderText("Başarısız");
            fail.setContentText("Boş bıraktığınız yerleri lütfen doldurun");
            fail.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Başarılı");
            alert.setContentText("Kayıt Başarıyla gerçekleşti!");
            alert.showAndWait();
            writeNewUser();
            System.out.println("KAYIT BAŞARILI");
        }
    });
    }





    public void writeNewUser() {
        Otomat.DBHelper database = new DBHelper();
        Connection connection;
        PreparedStatement statement;
        try {
            connection = database.getConnection();
            String sql = "insert into libraryapp.customerınfo (username,password,phone_number,mail) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,usernameRegistryText.getText());
            statement.setString(2,passwordRegistryText.getText());
            statement.setString(3,phoneNumberText.getText());
            statement.setString(4,mailRegistryText.getText());
            statement.executeUpdate();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        com.library.app.UserModel newUser = new UserModel(usernameRegistryText,passwordRegistryText,phoneNumberText,mailRegistryText);
    }
}
