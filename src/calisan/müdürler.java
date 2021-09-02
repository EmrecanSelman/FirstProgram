package calisan;

public class müdürler extends calısan_genel{
private  int kac_kisiden_sorumlu;

    public int getKac_kisiden_sorumlu() {
        return kac_kisiden_sorumlu;
    }

    public void setKac_kisiden_sorumlu(int kac_kisiden_sorumlu) {
        if (kac_kisiden_sorumlu>0){
            this.kac_kisiden_sorumlu=kac_kisiden_sorumlu;

        }
        else System.out.println("hatalı girdin");
    }

    public müdürler(String isim, String mesleği, int maas, int kac_senelik_eleman, String kaldıgı_yer, int kac_kisiden_sorumlu) {
        super(isim, mesleği, maas, kac_senelik_eleman, kaldıgı_yer);
        this.kac_kisiden_sorumlu=kac_kisiden_sorumlu;

    }

    @Override
    void detaygöster() {
        super.detaygöster();
        System.out.println("sorumluyu olduğum kişi sayısı "+ this.kac_kisiden_sorumlu);

    }
}

