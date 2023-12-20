package day_49_murat;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Review {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,5,17,3,8,6));
        ArrayList<String> names=new ArrayList<>(Arrays.asList("Said","Idris","Turgut","Busra"));
       // Arrays.sort(arrayname);
        Collections.sort(numbers);// listeyi kucukten buyuge dogru siraladi
        System.out.println(numbers);
        Collections.sort(numbers,Collections.reverseOrder());// buyukten kucuge dogru siraladi
        System.out.println(numbers);

        System.out.println("****************************************************");
        Collections.sort(names);// stringleri siraladi
        System.out.println(names);
        // bunlari siralarken arka tarafta compareto methodu calisir.Peki ne zaman bu metodu overreid yapariz
        // baska class ta person class acalim
        System.out.println("*********************person*********************************");

        Person p1=new Person("Hakki","Hakkatapan",40,1500);
        Person p2=new Person("Ahmet","Ayanbeyan",50,2500);
        Person p3=new Person("Kadir","Inanir",60,3500);

       Person.printPersons();

       Collections.sort(Person.persons);// isim sirasina gore siraladi
       Person.printPersons();
       // compareTo // karsilastirma yapar.ornek;System.out.println("Hakan".compareTo(Hakal")); yani harf harf bakip
        // aschi degerlerine bakar.ilk buldugu farki basip cikar.farkli harflaer arasindaki sayisal deger farkini basar

    }
}
