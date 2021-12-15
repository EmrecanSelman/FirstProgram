package StudyStream;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


abstract class sakinol {
        String alim;
        public void sleep() {
            System.out.println("Zzz");
        }

        abstract void Who();

        abstract void TIME();
    }
    class Emre extends sakinol {

        @Override
        void Who() {
            System.out.println("emre uyuyor");
        }

        @Override
        void TIME() {
            Date now = new Date();
            System.out.println(now.toString());
        }
    }
/*interface in1{
    final int a = 10;
    void display();
}
class gerigerigeri implements in1{

    @Override
    public void display() {
        System.out.println("gerigerigeri");
    }
}
*/
    public class TheCodeOfEverything {
        public static void main(String[] args) throws IOException {
            List<Skill> skill = new ArrayList<>();
            skill.add(new Skill("bengü",78,"altış"));
            skill.add(new Skill("barış",12,"hulk"));
            Emre emre = new Emre();
            BufferedWriterandReader();
            emre.sleep();
            emre.Who();
            emre.TIME();
            // gerigerigeri gerigerigeri = new gerigerigeri();
            // gerigerigeri.display();
            List<Skill> elma =skill.stream().filter(skill1 -> skill1.getIsim().equals("barış")).collect(Collectors.toList());
            System.out.println(elma.toString());


        }

        private static void BufferedWriterandReader() throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter("damr.txt"));
            bw.write("peri");
            bw.flush();
            BufferedReader br = new BufferedReader(new FileReader("damr.txt"));
            String aaa = br.readLine();
            System.out.println(aaa);
        }


    }
class Skill{
      private String isim;
      private int age;
        private String soyad;

    public Skill(String isim, int age, String soyad) {
        this.isim = isim;
        this.age = age;
        this.soyad = soyad;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }


}
