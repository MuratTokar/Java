package day_065_mrt;

public class C085 {
}
class MyException85 extends RuntimeException {}

class Test85 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException85 me) {
            // } catch (RuntimeException me) {
            System.out.print("A");
        }
    }

    public static void method1() {
        try {
            double a = Math.random();
            System.out.println("random = " + a);
            throw a > 0.5 ? new MyException85() : new RuntimeException();
        } catch (RuntimeException re) {
            System.out.print("B");
            //throw new MyException85();


            // cevap B
        }
    }
}