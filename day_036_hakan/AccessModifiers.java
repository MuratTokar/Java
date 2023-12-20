package day_036_hakan;

import day_020_hakan.Cars;
import day_035_hakan.Animal;

public class AccessModifiers {
    /**
     * 4 Access Modifiers : public > protected > default > private
     * public : Paketlerin oldugu projenin icerisindeki heryerden ulasilabilir.
     * protected : default(package) + child classlar
     * default : ayni package icerisinden
     * private : class icerisinde sadece erisim hakki var
     */

    static private String privateName;
    static public String publicName;
    static String defaultName;
    static protected String protectedName;

    public static void main(String[] args) {
        Cars car = new Cars(); // package 20
        System.out.println(privateName);

    }

}

class Dog extends Animal{
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicName);
        System.out.println(AccessModifiers.defaultName);
        System.out.println(AccessModifiers.protectedName);

        // System.out.println(AccessModifiers.privateName); private oldugu icin class disindan erisilemez
        // System.out.println(privateName); private oldugu icin baska class tan erisilemez
        Dog dog = new Dog();
        System.out.println(dog.name);
        // System.out.println(dog.age); default oldugu icin, baska package'tan erisemiyoruz
    }
}
