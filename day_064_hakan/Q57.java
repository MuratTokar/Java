package day_064_hakan;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q57 {

    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank",45),
                new Person("Charlie", 40),
                new Person("Smith", 38));

        // line n1
        checkAge(iList, person -> person.getAge() > 40);
        // alternatif kod checkAge()
        iList.forEach( k -> {
            if(k.getAge() > 40){
                System.out.println(k.getName());
            }
        });

    }

    public static void checkAge(List<Person> list, Predicate<Person> predicate){
        for(Person p : list){
            if(predicate.test(p)){
                System.out.println(p.name + " ");
            }
        }
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
}


