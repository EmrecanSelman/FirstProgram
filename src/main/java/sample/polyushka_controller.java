package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


import java.io.IOException;
import java.util.Random;

public class polyushka_controller extends Pane {
    @FXML
    private Button esittir;
    @FXML
    private TextField text;
    @FXML
    private Button sekiz;
    @FXML
    private Button rastgele;
    @FXML
    private Button dokuz;
    @FXML
    private Button carpma;
    @FXML
    private Button delete;
    @FXML
    private Label label;
    private  int number1;
    private  int number2;

    @FXML
    public void rand_ure(ActionEvent e){
        Random rand = new Random();
        int rastgele = rand.nextInt(10);
        String isim ;
        System.out.println(rastgele);
    }
    public void tıklama_sayma(){
        String değer = text.getText();
        String set = "";
        text.setText(değer+set);
    }

    polyushka_controller()
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("polyushka.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        esittir.setOnMouseClicked(e -> { System.out.println("eşittire basıldı");
                            getChildren().add(new MyButton());

                            String üçüncüsü  = text.getText();
                            int dördüncüsü = Integer.parseInt(üçüncüsü);
                            this.number2 = dördüncüsü;
                            System.out.println(this.number1*this.number2);
                            label.setText(String.valueOf(this.number1*this.number2));
        });
        sekiz.setOnMouseClicked(event -> { System.out.println("sekize basıldı");
            String değer = text.getText();
            String set = ("8");
            text.setText(değer+set);
            label.setText(değer+set);



        });
        dokuz.setOnMouseClicked(event -> { System.out.println("dokuza basıldı");
            String değer = text.getText();
            String set = ("9");
            text.setText(değer+set);
            label.setText(değer+set);
        });
        carpma.setOnMouseClicked(mouseEvent -> { System.out.println(" carpmaya basıldı");
            String ilki = text.getText();
            int ikincisi = Integer.parseInt(ilki);
            this.number1 =ikincisi;
            text.setText(ilki + " *");
            text.clear();
            label.setText(ilki + " *");


        });
        delete.setOnMouseClicked(mouseEvent -> { System.out.println("text temizlendi ");
            text.clear();

        });

    }




}
