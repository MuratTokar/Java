package day_064_mrt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static day_064_mrt.Person.checkAge;

public class C057 {
    public static void main(String[] args) {
        List<Person> iList= Arrays.asList(new Person("Hank",45),
                                           new Person("Charlie",40),
                                            new Person("Snith",38));

       checkAge(iList,person -> person.getAge()>40);
        checkAge(iList,person ->person.getAge()>40); // cevap



        // line n1

    }

}
 class Person{
    String name;
    int age;

     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }
     public static void checkAge(List<Person> list, Predicate<Person> predicate){
         for (Person p:list){
             if (predicate.test(p)){
                 System.out.println(p.name + " ");
             }
         }

     }
 }



