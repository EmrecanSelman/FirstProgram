package Java8_Work;

import java.util.function.Predicate;

public class HowToPredicate {
    public static void main(String[] args) {
        System.out.println(dogrumu.test("07258"));
        System.out.println(dogrumu.test("0745"));
        System.out.println(dogrumu.and(yanlismi).test("5465465"));
        System.out.println(dogrumu.and(yanlismi).test("07855"));
    }
    static Predicate<String> dogrumu = sayi -> sayi.startsWith("07") && sayi.length() ==5;
    static Predicate<String> yanlismi = sayi -> sayi.contains("8");

}