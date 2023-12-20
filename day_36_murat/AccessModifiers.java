package day_36_murat;

import day_020_hakan.Cars;
import day_035_hakan.Animal;

public class AccessModifiers {
     static private  String  privateName;
     static public String  publicName;
     static String  defaultName;
    static protected String  protectedName;


    public static void main(String[] args) {
        // Acces Modifiers;public> protected>default>private
        // public;paketlerin oldugu projenin icerisndeki heryerden ulasilir
        // protected;paket icinde ve paket disindaki child leri ulasir
        // private;class icerisinden sadcee erisilebilir


        Cars car=new Cars();// paket 20 de cars classsindan bir obje olusturdum----->public
        System.out.println(privateName);// class icinde private olani cagirdik

    }


}
class Dog extends Animal{
    public static void main(String[] args) { // burasi protected
        AccessModifiers accessModifiers=new AccessModifiers();
        System.out.println(AccessModifiers.publicName);// class ismi ile ile ulastik
        System.out.println(AccessModifiers.defaultName);
        System.out.println(AccessModifiers.protectedName);
        // System.out.println(accessModifiers.privateName); private oldugu icin class disinda ulasamadik
        //System.out.println(privateName); private oldugu icin baska class tan ulasilmaz




        Dog dog=new Dog();
        System.out.println(dog.name);
       // System.out.println(dog.age); degeri default oldugu icin baska paketten ulasamadik

    }

}



