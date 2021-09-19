package Otomat;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class RegisterControllerStudent extends AnchorPane {


    @FXML

    private TextField NameStudent;


    @FXML
    private TextField NumberStudent;

    @FXML
    private TextField TCStudent;

    @FXML
    private TextField MailStudent;

    @FXML
    private Button SaveButton;

    RegisterControllerStudent() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("RegisterControllerStudent.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SaveButton.setOnMouseClicked(e -> {
            try {
                writeNewUser();
                System.out.println("hjvhb");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

    }

    public void writeNewUser() throws IOException {

        File myFile = new File("Students.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("Students.txt"));


        bw.write(NameStudent.getText());
        bw.newLine();
        bw.write(NumberStudent.getText());
        bw.newLine();
        bw.write(TCStudent.getText());
        bw.newLine();
        bw.write(MailStudent.getText());
        bw.newLine();
        bw.close();


    }
}