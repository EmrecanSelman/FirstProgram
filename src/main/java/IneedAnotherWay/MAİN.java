package IneedAnotherWay;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MAİN  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CONTROLLER.fxml"));
        Scene acene = new Scene(root);
        primaryStage.setScene(acene);
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }
}
