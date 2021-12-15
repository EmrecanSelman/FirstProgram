package com.library.app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainController extends Pane {
    @FXML
    private Button registerbutton;

    @FXML
    private Button loginbutton;

    @FXML
    public TextField usertext;

    @FXML
    private TextField passtext;

    MainController() {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/library/MainController.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        registerbutton.setOnMouseClicked(e -> {
            Register es = new Register();
            Scene scene = new Scene(es);
            Main.MAIN_STAGE.setScene(scene);


        });
        loginbutton.setOnMouseClicked(event -> {
        CheckUser();

        });
    }

    public void CheckUser() {
        DBHelper database = new DBHelper();


        try {

            Connection con = database.getConnection();
            PreparedStatement ps =
                    con.prepareStatement
                            ("SELECT * FROM customerınfo  WHERE username = ? AND password = ?");
            ps.setString (1, usertext.getText());
            ps.setString (2, passtext.getText());
            ResultSet rs = ps.executeQuery();


         // String sql = "SELECT * FROM libraryapp.customerınfo (username,password,phone_number,mail) values (?,?,?,?)";
         //statement = connection.prepareStatement(sql);
            if(rs.next()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Başarılı");
                alert.setContentText("Hoşgeldin " + usertext.getText());
                alert.showAndWait();
                UserModel userModel = new UserModel(usertext.getText(),passtext.getText(),"","");
                ConfigModel.getInstance().setCurrentUser(userModel);
                ConfigModel.sync();
                BookAndOccupation si = new BookAndOccupation();
                Scene scene = new Scene(si);
                Main.MAIN_STAGE.setScene(scene);


            }
            else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);alert.setHeaderText("Başarısız");
                alert.setContentText("Lütfen tüm yerleri doldurduğunuzdan emin olun");
                alert.showAndWait();
            }
            rs.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }




    }


}