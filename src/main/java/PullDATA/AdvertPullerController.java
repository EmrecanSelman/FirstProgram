package PullDATA;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class AdvertPullerController extends Pane {

    @FXML
    private Label ilannolabel;
    private Label fiyatlabel;

    @FXML
    private TextField ilannotext;

    @FXML
    private Button ilannobutton;

    @FXML
    private TextArea ilannobilgilertext;

    @FXML
    private ImageView ilannoimage;
    AdvertPullerController() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AdvertPuller.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

       ilannobutton.setOnMouseClicked(e -> {

           Document document = null;
           try {
               document = Jsoup.connect("https://www.sahibinden.com/"+ilannotext.getText()).get();
           } catch (IOException ioException) {
               ioException.printStackTrace();
           }
           Element captionElement = document.select("div.classifiedDetailTitle > h1").first();
           String caption = captionElement.text();
           String fiyat = document.select("div.classifiedInfo > h3").first().text();
           fiyatlabel.setText(fiyat);


       });

    }

    void bilgicek(String ilanno){
        try {
           String a = String.valueOf(ilanno);
            Document document = Jsoup.connect("https://www.sahibinden.com/"+ilanno).get();
            Element captionElement = document.select("div.classifiedDetailTitle > h1").first();
            String caption = captionElement.text();
            String fiyat = document.select("div.classifiedInfo > h3").first().text();
            fiyatlabel.setText(fiyat);



         } catch (IOException e) {
            e.printStackTrace();
        }
    }
}