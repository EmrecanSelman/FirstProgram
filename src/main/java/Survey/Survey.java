package Survey;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Survey extends Application {



    @Override
    public void start(Stage primaryStage)  throws Exception{
        Parent root = new ControllerS();
        primaryStage.setTitle("main/java/Survey");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
