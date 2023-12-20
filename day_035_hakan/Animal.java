package day_035_hakan;

import day_036_hakan.AccessModifiers;

public class Animal {
    protected String name;
    int age;
    public void eat(){
        System.out.println("Yemek yeniyor...");
    }
}

class Cat extends Animal{

    public void eat(String mama){
        System.out.println("Kedi " + mama + "sini yiyor");
    }

}

class Bird extends Animal {

}

class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();

        cat.eat("mama");
        bird.eat();

        // parameters method overriding, farkli olmak zorunda degil
        // parameters method overloading, farkli olmak zorunda


    }
}
