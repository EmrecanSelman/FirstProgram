package Java8_Work;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class HowToConsumer {
    public static void main(String[] args) {
        insanlar aslı = new insanlar("Aslı","Bulamadım",25);

        isimm.accept(aslı);
        isimmv2.accept(aslı,true);
        isimmv2.accept(aslı,false);
    }

    static Consumer<insanlar> isimm = insanlar ->
            System.out.println("Selam " + insanlar.isim+" "+insanlar.soyadı + " your age is: " + insanlar.age  );
    static BiConsumer<insanlar,Boolean> isimmv2 = ((insanlar, aBoolean) ->
            System.out.println("Selam " + insanlar.isim+" "+insanlar.soyadı + " your age is: " +(aBoolean ? insanlar.age : "**")  ));
    static class insanlar{
        private String isim;
        private String soyadı;
        private int age;

        public insanlar(String isim, String soyadı, int age) {
            this.isim = isim;
            this.soyadı = soyadı;
            this.age = age;
        }


    }
}
