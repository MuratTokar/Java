package day_066_mrt;

public class C104 {
}

class Base {

    public void test() {

        System.out.println("Base ");
    }
}

class DerivedA extends Base {
    public void test() {

        System.out.println("DerivedA ");
    }
}
class DerivedB extends DerivedA {
    public void test() {
        System.out.println("Derivedẞ ");
    }

    public static void main(String[] args) {

        Base b1 = new DerivedB();  // b1  B ye bagli
        Base b2 = new DerivedA();  // b2  A ya bagli
        Base b3 = new DerivedB();  // b3  B ye bagli
        Base b4 = b3;              // b4 b3 e ve b3 te B ye bagli
        b1 = (Base) b2;            // b1 b2 ye ve b2 de A ya bagli


        b1.test();// A
        b4.test();// B

    }
}