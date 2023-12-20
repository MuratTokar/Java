package day_049_hakan;

/*import day_048_hakan.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Review {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,17,3,8,6));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Said","Idris","Turgut","Busra"));
        //Arrays.sort(arrayName);
        Collections.sort(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        System.out.println("************************************************");
        Collections.sort(names);
        System.out.println(names);

        System.out.println("*********************** Person *************************");
        Person p1 = new Person("Hakki", "Hakkatapan",40, 2600);
        Person p2 = new Person("Ahmet", "Ayanbeyan",50, 2500);
        Person p3 = new Person("Kadir", "Inanir",60, 3500);
        Person.printPersons();
        System.out.println("*********************** After sorting according to firstNames - age *************************");
        Collections.sort(Person.persons);
        Person.printPersons();
        System.out.println("*********************** After sorting with idComparator *************************");

        Comparator<Person> idComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.getId() < p2.getId()){
                    return -1;
                } else if(p1.getId() > p2.getId()){
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(Person.persons, idComparator);
        Person.printPersons();

        System.out.println("*********************** After sorting with lastNameComparator *************************");

        Comparator<Person> lastNameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return -p1.getLastName().compareTo(p2.getLastName());
            }
        };

        Collections.sort(Person.persons, lastNameComparator);
        Person.printPersons();

        System.out.println("cakan".compareTo("Cakay"));
    }
}*/
