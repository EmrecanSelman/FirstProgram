package Music;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;



public class loginC extends AnchorPane {


    @FXML
    private ImageView image;
    @FXML
    private TextArea usernametext;


    @FXML
    private TextArea passwordtext;
    @FXML
    private Button yeah, signup;
    @FXML
    private TextArea mailtext;

    private Stage stage;
    private Scene scene;
    private Parent root;


    loginC() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("loginC.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        yeah.setOnMouseClicked(e -> {

            Second s = new Second(this);
            stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            scene = new Scene(s);
            stage.setScene(scene);
            stage.show();

        });
        signup.setOnMouseClicked(e -> {
            String mail = mailtext.getText();
            String username = usernametext.getText();
            String pass = passwordtext.getText();
            boolean checkResult = checkParameters(mail, pass, username);
            User newUser = null;
            try {
                newUser = new User(username, pass, mail);
            } catch (Exception exception) {
                checkResult = false;
            }
            if (checkResult) {
                ConfigModel.getInstance().getUserList().add(newUser);
                ConfigModel.sync();
            } else {
                //Burada hata verdir. kullanıcı eklenemedi. hata mesajını göster alert diyalog ile.
            }
        });

    }

    private boolean checkParameters(String mail, String pass, String username) {
        return true;
    }

    public int getValue() {
        return 45;
    }
}
