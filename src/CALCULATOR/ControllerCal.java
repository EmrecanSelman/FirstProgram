package CALCULATOR;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.IOException;

public class ControllerCal extends Pane {


    @FXML
    private Label label;

    @FXML
    private Button four;

    @FXML
    private Button nine;

    @FXML
    private Button five;

    @FXML
    private Button two;

    @FXML
    private Button one;

    @FXML
    private Button zero;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button delete;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button equal;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button divide;

    @FXML
    private Button multi;
    private int number1;
    private int number2;
    private String operation;

    ControllerCal() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Calculator.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
     one.setOnMouseClicked(e ->  {
        String değer = label.getText();
        String set = ("1");
        label.setText(değer+set);
         });

        two.setOnMouseClicked(e ->  {
            String değer = label.getText();
            String set = ("2");
            label.setText(değer+set);
        });
        three.setOnMouseClicked(e ->  {
            String değer = label.getText();
            String set = ("3");
            label.setText(değer+set);
        });
        four.setOnMouseClicked(e ->  {
            String değer = label.getText();
            String set = ("4");
            label.setText(değer+set);
        });
        five.setOnMouseClicked(e ->  {
            String değer = label.getText();
            String set = ("5");
            label.setText(değer+set);
        });
        six.setOnMouseClicked(e ->  {
            String değer = label.getText();
            String set = ("6");
            label.setText(değer+set);
        });
        seven.setOnMouseClicked(e ->  {
            String değer = label.getText();
            String set = ("7");
            label.setText(değer+set);
        });
        eight.setOnMouseClicked(e ->  {
            String değer = label.getText();
            String set = ("8");
            label.setText(değer+set);
        });
        nine.setOnMouseClicked(e ->  {
            String değer = label.getText();
            String set = ("9");
            label.setText(değer+set);
        });
        zero.setOnMouseClicked(e ->  {
            String değer = label.getText();
            String set = ("0");
            label.setText(değer+set);
        });
         delete.setOnMouseClicked(e ->  {
            label.setText("");
        });

        plus.setOnMouseClicked(e -> {
            label.setText(label.getText() + "+");
        });
        minus.setOnMouseClicked(e -> {
            label.setText(label.getText() + "-");
        });
        divide.setOnMouseClicked(e -> {

            label.setText(label.getText() + "/");

        });
        multi.setOnMouseClicked(e -> {
            label.setText(label.getText() + "*");
        });
        equal.setOnMouseClicked(e ->{
            /*switch(operation){
                case "+" :
                    String thirth  = label.getText();
                    int fourth = Integer.parseInt(thirth);
                    this.number2 = fourth;
                    label.setText(String.valueOf(this.number1+this.number2));

                    break;
                case "-" :
                    String thirth2  = label.getText();
                    int fourth2 = Integer.parseInt(thirth2);
                    this.number2 = fourth2;
                    label.setText(String.valueOf(this.number1-this.number2));

                    break;
                case "*" :
                    String thirth3  = label.getText();
                    int fourth3 = Integer.parseInt(thirth3);
                    this.number2 = fourth3;
                    label.setText(String.valueOf(this.number1*this.number2));

                    break;
                case "/" :
                    String thirth4  = label.getText();
                    int fourth4 = Integer.parseInt(thirth4);
                    this.number2 = fourth4;
                    label.setText(String.valueOf(this.number1/this.number2));

                    break;
            }*/
            try {
                //  Block of code to try
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("JavaScript");
                Object result = engine.eval(label.getText());
                label.setText(result.toString());
            }
            catch(Exception k) {


            }
        });
    }

}

