package IneedAnotherWay;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



import java.io.IOException;
import java.util.Objects;

public class CONTROLLER extends AnchorPane  {


    @FXML
    private Button buttonas;
    CONTROLLER() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CONTROLLER.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        buttonas.setOnAction(event-> {
            try {
                Parent root = FXMLLoader.load((getClass().getClassLoader().getResource("CONTROLLER2.fxml")));
               Scene controller2 = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(controller2);
                window.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }


}