package ChangingScreen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class First extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Parent root = new FirstController();
        primaryStage.setTitle("Öğren");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();

    }
   /* public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));

        Scene scene = new Scene( pane );
        primaryStage.setScene(scene);
}*/
   public static Stage load(String location, Object controller) throws Exception{
        FXMLLoader loader =new FXMLLoader(First.class.getResource(location));
        loader.setController(controller);

        return loader.load();

    }
}
