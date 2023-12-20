package day_038_hakan;

import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestAnimalP {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Object o = scan.nextDouble();
        if(o instanceof String){

        }

        AnimalP newAnimal;
        newAnimal = new Dog();
        newAnimal = new Cat();

        Dog newDog;
        // newDog = new Cat();

        List<String> list;

        list = new ArrayList<>();
        list = new LinkedList<>();

        Student student;
        student = new Grundschuler();
        student = new UniversityStudent();


        AnimalP a = new AnimalP();
        Dog d = new Dog();
        Cat c = new Cat();

        //a.eat();
        //d.eat();
        //c.eat();

        feedAnimal(a);
        feedAnimal(d);
        feedAnimal(c);

        System.out.println("********* Polymorphism **********");
        AnimalP aP = new AnimalP();
        AnimalP dP = new Dog();
        AnimalP cP = new Cat();

        aP.eat();
        dP.eat();
        cP.eat();

        System.out.println("********* Polymorphism 2 **********");

        feedAnimal(aP);
        feedAnimal(dP);
        feedAnimal(cP);

    }

    public static void feedAnimal(AnimalP a){
        a.eat();
    }



}
