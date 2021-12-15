package Otomat;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.List;

public class ControllerMain extends AnchorPane {
    private Scene scene;
    private Parent root;
    ObservableList<UserType> listeici = FXCollections.observableArrayList(UserType.STUDENT, UserType.TEACHER);
    @FXML
    private javafx.scene.control.ChoiceBox<UserType> ChoiceBox;
    @FXML
    private TextField UsernameText;
    @FXML
    private TextField PasswordText;
    @FXML
    private ImageView Image;
    @FXML
    private Button loginB;
    @FXML
    private Button registerB;

    ControllerMain() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ContollerMain.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ChoiceBox.setItems(listeici);
        ChoiceBox.getSelectionModel().select(0); // choice box da otamatik 0 indeks seçili gelir
        registerB.setOnMouseClicked(e -> {
            UserType userType = ChoiceBox.getValue();
            RegisterController s = new RegisterController(userType);
            scene = new Scene(s);
            Ogrenci_Ogretmen_Otomatı.MAIN_STAGE.setScene(scene);
        });
        loginB.setOnMouseClicked(e -> {
            UserType secenek = ChoiceBox.getValue();
            try {
                boolean control = checkUserPassword(PasswordText.getText(), UsernameText.getText(), ChoiceBox.getValue());
                if (control && secenek == UserType.STUDENT) {
                    Alert a = new Alert(Alert.AlertType.INFORMATION, "Tanıdım Seni");
                    a.show();
                    LoginControllerStudent si = new LoginControllerStudent();
                    scene = new Scene(si);
                    Ogrenci_Ogretmen_Otomatı.MAIN_STAGE.setScene(scene);

                } else if (control && secenek == UserType.TEACHER) {
                    Alert a = new Alert(Alert.AlertType.INFORMATION, "Tanıdım Seni");
                    a.show();
                    LoginControllerTeacher es = new LoginControllerTeacher();
                    scene = new Scene(es);
                    Ogrenci_Ogretmen_Otomatı.MAIN_STAGE.setScene(scene);
                } else {
                    Alert a = new Alert(Alert.AlertType.ERROR, "Sen Kimsin");
                    a.show();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

    }

    public boolean checkUserPassword(String password, String userName, UserType type) throws Exception {
        boolean control = false;
        List<UserModel> users = ConfigModel.getInstance().getUserList();
        for (UserModel user : users) {
            if (password.equals(user.password) && userName.equals(user.userName) && type.equals(user.type)) {
                control = true;
                ConfigModel.getInstance().setCurrentUser(user);
                ConfigModel.sync();
                break;
            }
        }

        return control;
    }

}