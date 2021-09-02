package CALCULATOR;

import com.sun.webkit.ColorChooser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class Main2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = new ControllerCal();
        stage.setTitle("Calculator");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.initStyle(StageStyle.UTILITY);
        stage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }

}
