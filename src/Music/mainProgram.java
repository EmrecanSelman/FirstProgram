package Music;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.stage.Stage;

public class mainProgram extends Application {



    @Override
    public void start(Stage primaryStage)  throws Exception {
        Parent root;
        if (ConfigModel.getInstance().getCurrentUser()==null) {
            root = new loginC();
        } else {
            root= new MusicPlayer();
        }
        primaryStage.getIcons().add(new Image("Music/images.png"));
        primaryStage.setTitle("MusicPlayer");
        primaryStage.setScene(new Scene(root));


        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }
}
