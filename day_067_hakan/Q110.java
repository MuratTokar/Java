package day_067_hakan;

public class Q110 {
    public static void main(String[] args) {
        new Base().test();
        new A().test();
        new B().test();

      // ((A) new Base()).test();
        //((B) new A()).test();
        ((A) new B()).test(); // B test()
        System.out.println(((A) new B()).x); // 10 (A)
        System.out.println(((A) new B()).y); // 10 (A)
        // System.out.println(((A) new B()).z); // 10 (A) -> z cagrilamaz, cunku A class ina casting yapildi

        new B().test(); // B test()
        System.out.println((new B()).x); // 20 (B)
        System.out.println((new B()).y); // 20 (B)
        System.out.println((new B()).z); // 20 (B)
    }
}

// b1 -> B
// b2 -> A
// b3 -> B
// b1 - b3 -> B
// b4 - b3 -> B

// b1.test() DerivedB
// b1.x -> Base
// b4.test() DerivedB
// b4.x -> A

class Base {
    void test(){
        System.out.println("Base");
    }
}

class A extends Base {
    int x = 10;
    int y = 10;
    void test (){
        System.out.println("A");
    }
}


class B extends A {
     int x = 20;
     int z = 20;
    void test(){
        System.out.println("B");
    }
}

// sub class tan super class a castig yapilabilir
// fakat super class tan sub class a casting yapilamaz,
// RunTimeException ClassCastException verir

// casting de, variables cast edilen class a gore kullanilirken,
// methodlar orjinal object classina gore kullanilir