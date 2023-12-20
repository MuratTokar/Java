package day_037_hakan;

public interface Animal {
    String welcomeMessage = "Java Dersimize hosgeldiniz!";
    void eat();
    // default ve static gercek method yazilabilir
    default void sleep(){

    }

    static void wakeUp(){

    }
}

interface Pet {
    void walk();
}

class Dog implements Animal, Pet {

    public static void main(String[] args) {
        System.out.println(Dog.welcomeMessage);

    }

    public void eat() {

    }

    public void walk() {

    }


}
