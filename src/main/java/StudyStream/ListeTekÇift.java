package StudyStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListeTekÇift {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Random rand = new Random();
        int toplam = 0,tekadet = 0,ciftadet = 0,tutucu;
        for (int i =0;i<10;i++){
            tutucu=rand.nextInt(1000);
            myList.add(tutucu);
            toplam += myList.get(i);
            if(myList.get(i)%2==0)
                ciftadet += 1;
            else
                tekadet += 1;
            System.out.print("["+myList.get(i)+"] ");

        }
        System.out.print("\n----------------------\n-> Dizi Elemanlarının Toplamı: "+toplam+"\n----------------------\n-> Dizideki Çift Sayı Adedi: "+ciftadet+"" +
                "\n----------------------\n-> Dizideki Tek Sayı Adedi: "+tekadet+"\n----------------------");


    }
}



