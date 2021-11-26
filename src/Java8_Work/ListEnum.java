package Java8_Work;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static Java8_Work.ListEnum.Gender.FEMALE;
import static Java8_Work.ListEnum.Gender.MALE;

public class ListEnum {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Aslı",FEMALE));
        people.add(new Person("Mete",MALE));
        people.add(new Person("Ayşe",FEMALE));
        people.add(new Person("Aysun",FEMALE));
        people.add(new Person("Ahmet",MALE));
        List<Person> females = people.stream().filter(pe -> FEMALE.equals(pe.gender)).collect(Collectors.toList());
        Predicate<Person> females2 = i -> FEMALE.equals(i.gender);

        System.out.println(females);
       List<Person> males = people.stream().filter(person -> MALE.equals(person.gender)).collect(Collectors.toList());
       males.forEach(System.out::println);

    }
 static class Person {
        private  final String name;
        private final Gender gender;
     public Person(String name, Gender gender) {
         this.name = name;
         this.gender = gender;
     }

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", gender=" + gender +
                 '}';
     }
 }
    enum Gender{
        MALE,FEMALE
    }
}
