package IneedAnotherWay;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CONTROLLER2  extends AnchorPane  {
    helper helper = new helper();
    CONTROLLER2() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CONTROLLER.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}