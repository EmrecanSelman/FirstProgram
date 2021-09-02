package calisan;

public class calısan_genel {
    private  String isim;
    private String mesleği;
    private int maas;
    private  int kac_senelik_eleman;
    private String kaldıgı_yer;

    public calısan_genel(String isim, String mesleği, int maas, int kac_senelik_eleman, String kaldıgı_yer) {
        this.isim = isim;
        this.mesleği = mesleği;
        this.maas = maas;
        this.kac_senelik_eleman = kac_senelik_eleman;
        this.kaldıgı_yer = kaldıgı_yer;
    }
    public calısan_genel(){
        this("bilgi yok","bilgi yok",0,0,"bilgi yok");
    }



    void detaygöster(){
        System.out.println("ismi " + this.isim);
        System.out.println("maaşı " + this.maas);
        System.out.println("mesleği " + this.mesleği);
        System.out.println("kaç senelik eleman " + this.kac_senelik_eleman);
        System.out.println("kaldığı yer " + this.kaldıgı_yer);

    }
    void maasartır(int zam){
        System.out.println("maasınıza "+ zam + "tl zam yaptık hayırlı olsun");
        System.out.println("yeni maasınız "+ (maas + zam));
    }
    void mesai_hesaplama(int mesai_saati){
        System.out.println("bu ay " + mesai_saati + " saat mesai yaptınız helal");
        int avans = ( mesai_saati * 10);
        System.out.println("mesai ile birlikte " + avans + " tl avans kazandın helal artık maaşın " + (maas + avans));

    }
}
