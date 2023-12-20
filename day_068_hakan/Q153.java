package day_068_hakan;

public class Q153 {
}

class FieldInit {
    Person p;
    Character c;
    boolean b;
    float f;
    void printAll() {
        System.out.println("Ch = " + c); // object oldugu icin null
        System.out.println("b = " + b); // false
        System.out.println("f = " + f); // 0.0
        System.out.println("Person = " + p); // 0.0
    }

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.printAll();
    }
}

class Person {

}
