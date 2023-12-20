package day_49_murat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person implements Comparable<Person>{
private String firstName;
private String lastName;
private int age;
private int id;
 static List<Person> persons=new ArrayList<>();// asagida olusan her yeni personel buraya eklenecek
Person(String firstName,String lastName,int age,int id){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.id=id;
    persons.add(this);// her yeni kisi eklenecek burdan

}
public static void printPersons(){             // alltta tostring i override ederiz
    Iterator iterator=persons.iterator();       //list collection person  elemanlarininin arasinda gezinecek
    while (iterator.hasNext()){                // yazdirmak icin while icine attik ve hasNet ile ileride eleman var mi onlara bakacak
        iterator.next().toString();            // bu toString metodu bilgileri  asagidaki override toStringe gonderecek
                                               // asagidan tekara buraya gellecek ve burda bastirabiliriz
        System.out.println(iterator.next().toString());

    }

}

    @Override
    public String toString() {// burdan bilgiler yukariya gonderilecek
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

// isme gore compare edecegiz
    @Override
    public int compareTo(Person person) {// compare karsilastirmak demektir
      /*
      *positive--> buyuktur,degistirme 1
      * negative -->kucuktur,degistir -1
      * 0-> esittir,degistirme 0
      * yani bizden 3 deger bekler
       */



        /*
        if (0<this.firstName.compareTo(person.firstName)){
            return 1;
        } else if (0>this.firstName.compareTo(person.firstName)) {
            return -1;

        }else {
            return 0;
        }*/ // bu islemler uzun halidir daha cok sayisal islemlerde kullaniiriz

        return this.firstName.compareTo(person.firstName); // burasi kisa halidir.yani bize bir deger donecektir

        }

    }

