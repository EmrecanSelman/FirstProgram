package PullDATA;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class FirstExample {
    public static void main(String[] args) {

        try {
            Document document = Jsoup.connect("").get();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    }
