package calisan;

public class main {
    public static void main(String[] args) {
        calısan_genel calısan = new calısan_genel("aslı","bilgisayar mühendsiliği",2500,10,"büyükçekmece");
        müdürler müdür = new müdürler("kerem","bilgisayar mühendsiliği ",5200,20,"avcılar",-9);
        calısan_genel evet = new calısan_genel();
        calısan.detaygöster();
        calısan.maasartır(520);
        System.out.println();

        müdür.detaygöster();

        müdür.mesai_hesaplama(12);
        System.out.println(
        );
        evet.detaygöster();
    }
}
