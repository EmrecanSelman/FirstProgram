package sample;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;


public class Controller {

    public void evet(ActionEvent event) {
        System.out.println("evet");
    }
    public void hayır(ActionEvent e) {
        System.out.println("hayır");
    }
    public void kısmen(ActionEvent e) {
        System.out.println("kısmen");

    }
    public void evetde(MouseEvent e){
        System.out.println("evettttt");
    }

}
