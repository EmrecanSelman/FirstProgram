package Otomat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterControllerTeacher extends Pane {
    @FXML

    private TextField NameTeacher;


    @FXML
    private TextField DepartmanTeacher;

    @FXML
    private TextField MailTeacher;

    @FXML
    private TextField TCTeacher;
    @FXML
    private Button SaveButtonTeacher;

    @FXML
    private Button SaveButton;
    RegisterControllerTeacher() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("RegisterControllerTeacher.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SaveButtonTeacher.setOnMouseClicked(e -> {
            try {
                writeNewUser();
                System.out.println("hjvhb");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });


    }
    public void writeNewUser() throws IOException {

        File myFile = new File("Students.json");
        BufferedWriter bw = new BufferedWriter(new FileWriter("Students.json"));


        bw.write(NameTeacher.getText());
        bw.newLine();
        bw.write(DepartmanTeacher.getText());
        bw.newLine();
        bw.write(MailTeacher.getText());
        bw.newLine();
        bw.write(TCTeacher.getText());
        bw.newLine();
        bw.close();


    }
}