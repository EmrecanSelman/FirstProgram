package Otomat;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.sql.*;

public class RegisterController extends AnchorPane {


    private final UserType type;
    @FXML

    private TextField NameStudent;


    @FXML
    private TextField NumberStudent;

    @FXML
    private TextField TCStudent;

    @FXML
    private TextField MailStudent;

    @FXML
    private Button SaveButton;
    private Stage stage;
    private Scene scene;

    RegisterController(UserType type) {
        this.type = type;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("RegisterController.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        TCStudent.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                TCStudent.setText(newValue.replaceAll("[^\\d]", ""));//sayı dışında bir değer girdiğimizde değeeri alıp yazmaz sadece sayı yazmamızı sağlar.
            }
            if (newValue.length() > oldValue.length()) {
                // Check if the new character is greater than LIMIT
                if (TCStudent.getText().length() >= 11) { // alacağımız değere sınır koyduk.

                    // if it's 11th character then just setText to previous
                    // one
                    TCStudent.setText(TCStudent.getText().substring(0, 11));
                }
            }
        });
        SaveButton.setOnMouseClicked(e -> {
            try {
                if (NameStudent.getText().trim().isEmpty() || NumberStudent.getText().trim().isEmpty() || TCStudent.getText().trim().isEmpty() || MailStudent.getText().trim().isEmpty()) {
                    Alert fail = new Alert(Alert.AlertType.INFORMATION);
                    fail.setHeaderText("Başarısız");
                    fail.setContentText("Boş bıraktığınız yerleri lütfen doldurun");
                    fail.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Başarılı");
                    alert.setContentText("Kayıt Başarıyla gerçekleşti!");
                    alert.showAndWait();
                    writeNewUser(type);
                    System.out.println("KAYIT BAŞARILI");
                    ControllerMain s = new ControllerMain();
                    stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                    scene = new Scene(s);
                    stage.setScene(scene);
                    stage.show();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

    }

    public void writeNewUser(UserType type) throws IOException {
        DBHelper database = new DBHelper();
        Connection connection;
        PreparedStatement statement;
        try {
            connection = database.getConnection();
            String sql = "insert into otomat_teacher_student (id,name,no_bölüm,mail,tc,type) values (?,?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"1");
            statement.setString(2,NameStudent.getText());
            statement.setString(3,NumberStudent.getText());
            statement.setString(4,MailStudent.getText());
            statement.setString(5,TCStudent.getText());
            statement.setString(6, String.valueOf(type));
            statement.executeUpdate();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        UserModel newUser = new UserModel(NameStudent.getText(), NumberStudent.getText(), TCStudent.getText(), MailStudent.getText(), type);
        ConfigModel.getInstance().getUserList().add(newUser);
        ConfigModel.sync();
    }

}


