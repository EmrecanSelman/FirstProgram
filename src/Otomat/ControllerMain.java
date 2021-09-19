package Otomat;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.CssMetaData;
import javafx.css.Styleable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.text.normalizer.UTF16;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

public class ControllerMain extends AnchorPane {


    private Stage stage;
    private Scene scene;
    private Parent root;


    ObservableList<String> listeici = FXCollections.observableArrayList("öğrenci", "akademisyen");
    @FXML
    private javafx.scene.control.ChoiceBox<String> ChoiceBox;

    @FXML
    private TextField UsernameText;

    @FXML
    private TextField PasswordText;

    @FXML
    private ImageView Image;

    @FXML
    private Button loginB;

    @FXML
    private Button registerB;


    ControllerMain() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ContollerMain.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ChoiceBox.setItems(listeici);

        registerB.setOnMouseClicked(e -> {
            String secenek = ChoiceBox.getValue().toString();
            if (secenek.equals("öğrenci")){
            new RegisterControllerStudent();
            getChildren().add(new RegisterControllerStudent());}
            else {
                new RegisterControllerTeacher();
                getChildren().add(new RegisterControllerTeacher());
                stage.close();
            }


        });
        loginB.setOnMouseClicked(e -> {
                    try {
                        reader();

                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }



                );

    }

public void reader() throws Exception{
  BufferedReader br = new BufferedReader(new FileReader("Students.txt"));

  List<String> liste = Collections.singletonList(br.readLine());
    br.close();

  if (PasswordText.equals(liste.stream().findAny().get().getBytes(StandardCharsets.UTF_8)) &&
          UsernameText.equals(liste.stream().findAny().get().getBytes(StandardCharsets.UTF_8))) {
      System.out.println("tanıdım seni");
  }
  else System.out.println("sen kimsin");
    System.out.println(liste);

}

}