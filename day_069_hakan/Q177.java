package day_069_hakan;

public class Q177 {
    public static void main(String[] args) {
        Peacock p = new Peacock();
        // Data hiding : super class taki tekrarlanmis variables ve override edilmis methodlara erisemez
        System.out.println(p.age); // peacock
        p.fly(); // peacock

        // ClassCastException
        Peacock p2 = (Peacock) new Bird(); // RuntimeException

        // Polymorphism
        Bird b = new Peacock();
        // sadece override edilmis subclass methodlara ve super class taki nesnelere erisir
        // birdName, Bird age, peacock fly() erisebilir
        // peacockName, peacock age, dance() erisemeyecek
        System.out.println(b.age); // Bird
        b.fly(); // Peacock
        // method overriding varsa
        // methodlar cast edilmez, variables cast edilir
        // method cagrildiginda Peacock override edilmis methodlari doner

        // override edilmemis object methodlarini kullanamaz
        // variable cagrildiginda Bird variables doner
    }
}

class Bird {

    String birdName = "Bird";
    int age=10;
    public void fly(){
        System.out.println("fly bird");
    }
}

class Peacock extends Bird {
    String peacockName = "Peacock";
    int age = 5;
    public void dance(){
        System.out.println("dance");
    }

    public void fly(){
        System.out.println("fly peacock");
    }
}

/**
 * Polymorphismde, methodlari cagirirken,
 * subclass tan supere, variable lari call ederken super den sub class a
 */

/**
 * A. Bird p = new Peacock();
 * B. Bird b = new Bird();Peacock p = (Peacock) b;
 * C. Peacock b = new Peacock ();Bird p = (Bird) b;
 * D. Bird b = new Peacock ();Peacock p = (Peacock) b;
 *
 * A ile C ayni, p.dance() compile error verir
 * B ClassCastException
 * D  Peacock p = new Peacock();
 */
