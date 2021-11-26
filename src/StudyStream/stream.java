package StudyStream;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class stream {
  static List<Integer> sayılar = new ArrayList<>();

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(45,"aslı"));
        users.add(new User(8,"mehmet"));
        users.add(new User(1,"emre"));
        users.add(new User(72,"ayşe"));
        users.add(new User(7,"onur"));
        sayılar.add(0,45);

        users.stream().forEach(e -> System.out.println(e.toString()));

        int id1 =users.stream().findFirst().get().id;
        System.out.println(id1);
        long sayi = users.stream().count();
        System.out.println(sayi);
        List<User> ASLI = users.stream().filter(e -> e.id>5).collect(Collectors.toList());
        System.out.println(ASLI);
        List<User> alphabetic = users.stream().sorted(Comparator.comparing(e -> e.name)).collect(Collectors.toList());
        System.out.println(alphabetic);
        System.out.println(sayılar);
    }
static class User{
        int id ;
        String name ;
    User(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User id = " + id + " name " + name;
    }
    public void talk(){
        System.out.println("hi ı am " +name);
    }
}




}
