package Java8_Work;

import java.util.function.Function;

public class Lambda {
interface yazdır {
    void anan(int sayi1,int sayi2);

}
    public static void main(String[] args) {

    yazdır yazdır = ((sayi1, sayi2) -> System.out.println("toplamları :" + (sayi1 + sayi2)));
        Function<String,String> UpperCase = (name) -> {
            return  name.toUpperCase(); };

    yazdır.anan(455,98);
        System.out.println(UpperCase.apply("djsbafkudsah"));
    }
}
