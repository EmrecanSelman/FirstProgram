package Java8_Work;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
       int artikin = birekleyici.apply(8);
        System.out.println(artikin);
        int besinci = beslecarp.apply(5);
        System.out.println(besinci);
        int halhal =birekleyici.andThen(beslecarp).apply(8);
        System.out.println(halhal);
        System.out.println(hepsii.apply(9));
        System.out.println(akilalmaz.apply(7,6));
        int alemsin = benim.apply(9,6);
        System.out.println(alemsin);

    }
    static Function<Integer,Integer > birekleyici =
            number -> number+=1;
    static Function<Integer,Integer> beslecarp =
            number -> number*5;
    static Function<Integer,Integer> hepsii =
            birekleyici.andThen(beslecarp);
     static BiFunction<Integer,Integer,Integer> akilalmaz =
             (a,b) -> a*b;
     static BiFunction<Integer,Integer,Integer> benim =
             (number1,number2) -> (number1*5) + number2;

}
