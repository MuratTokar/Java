package day_35_murat;

import day_36_murat.AccessModifiers;

public class Inheritance_2 {

}


class A {
    static String name = "Class A";

    public A() {
        System.out.println("A class default contructor");// default constructor

    }

    public A(String name) {
        System.out.println("A class default constructor");
    }

    public void printClassName() {
        System.out.println("Class A");
    }
}


class B extends A {
    String name = "Class B";

    public B() {
    }

    public B(String name) {
        // super();
        //super(name); super ilk satirda olmali
        System.out.println("B class parametreli constructor");
        // super(name); compile error verir burda
    }

    public void printClassName() {// metot
        System.out.println("Class B");

    }
}

class Test {

    public static void main(String[] args) {
        B obj_b = new B("java");// objeckt ile cagirdik
        System.out.println(obj_b.name); // b classe deki name yi getirir
        obj_b.printClassName();


    }
}

