package ChangingScreen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstController extends Pane  {

    @FXML
    private Button change;
    @FXML
    private Pane üzerime;
    private Stage stage;
    private Scene scene;
    private Parent root;
   FirstController() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("First.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
       change.setOnMouseClicked(e -> {
           try {
               load("/main/java/ChangingScreen/LetsSee.fxml",new LetsSee());
           } catch (Exception exception) {
               exception.printStackTrace();
           }

        /*   LetsSee s = new LetsSee();
           stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
           scene = new Scene(s);
           stage.setScene(scene);
           stage.show();
          */

       });

   }
    public static Stage load(String location, Object controller) throws Exception{
        FXMLLoader loader =new FXMLLoader(First.class.getResource(location));
        loader.setController(controller);

        return loader.load();

    }
}