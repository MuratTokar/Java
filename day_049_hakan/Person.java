package day_049_hakan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;
    private int age;
    private int id;
    static List<Person> persons = new ArrayList<>();

    Person(String firstName, String lastName, int age, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        persons.add(this);
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public static void printPersons(){
        Iterator iterator = persons.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

   /* // compareTo firstNames
    @Override
    public int compareTo(Person person) {
        *//**
         * positive -> buyuktur, degistirme
         * negative -> kucuktur, degistir
         * 0 -> esittir, degistirme
         *
         *//*
        *//*
        if(0 < this.firstName.compareTo(person.firstName)){
            return 1;
        } else if(0 > this.firstName.compareTo(person.firstName)){
            return -1;
        } else {
            return 0;
        }*//*

        return this.firstName.compareTo(person.firstName);
    }*/

    // compareTo age
    @Override
    public int compareTo(Person person) {
        /**
         * positive -> buyuktur, degistir
         * negative -> kucuktur, degistirme
         * 0 -> esittir, degistirme
         *
         */

        if(this.age < person.age){
            return -1;
        } else if(this.age > person.age){
            return 1;
        } else {
            return 0;
        }
    }
}
