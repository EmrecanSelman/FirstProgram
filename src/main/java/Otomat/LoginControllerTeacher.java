package Otomat;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginControllerTeacher  extends AnchorPane {




    LoginControllerTeacher() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginControllerTeacher.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
      }
  /*  webwatch.getEngine().load("file:///C:/Users/EMRECAN/Desktop/HTML-CSS/index.html");
        Dimension size = Toolkit. getDefaultToolkit(). getScreenSize();
        webwatch.setPrefHeight(size.height);                                            // web sayfasını ekrana gösterme
        webwatch.setPrefWidth(size.width);
*/

    }


}
