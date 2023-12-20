package day_062_hakan;

public class Q24 {
    public static void main(String[] args) {
        C c = new C(); // A B C
    }
}

class A {
    A(){
        System.out.println("A ");
    }
}

class B extends A {
    B(){
        // super(); A();
        System.out.println("B ");
    }
}

class C extends B {
    C(){
        // super(); B();
        System.out.println("C ");
    }
}
