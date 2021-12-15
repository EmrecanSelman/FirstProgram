package StudyStream;


import java.time.LocalDate;

abstract class bakak {
    private String brand;

    public abstract String olmazmı();

    public abstract int olur();

    public bakak(String brand) {
        this.brand = brand;
    }
}
abstract class hola{
    private String fgfdg;

    public abstract String fdgfg() ;


}
class ola extends hola{
    @Override
    public String fdgfg() {
        return "ola amigos";
    }
}

class cat extends bakak {
    private String Model;

    public cat(String brand, String Model) {
        super(brand);
        this.Model = Model;
        System.out.println(Model);
        System.out.println(brand);
        System.out.println(LocalDate.now());
    }

    @Override
    public String olmazmı() {
        return "tamam";
    }

    @Override
    public int olur() {
        return 0;
    }

}
class dog extends bakak{

    public dog(String brand) {
        super(brand);
        System.out.println(brand);
    }

    @Override
    public String olmazmı() {
        return null;
    }

    @Override
    public int olur() {
        return 0;
    }
}


public class abstracttutorial implements interfaces,fgfdgfdg {


    public static void main(String[] args) {
        cat cat = new cat("BMW", "320i");
        dog dog = new dog("AUDİ");
        ola ola = new ola();
        System.out.println(ola.fdgfg());

    }


    @Override
    public int yas() {
        return 0;
    }

    @Override
    public int sac() {
        return 0;
    }
}