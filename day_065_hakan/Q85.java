package day_065_hakan;

public class Q85 {
}

class MyException85 extends RuntimeException {}

class Test85{
    public static void main(String[] args) {
        try{
            method1();
          //  int a =0;
          //  int b = 5/a;
        } catch (MyException85 me) {
       // } catch (RuntimeException me) {
            System.out.print("A");
        }
    }

    public static void method1(){
        try{
            double a = Math.random();
            System.out.println("random = " + a);
            throw a > 0.5 ? new MyException85() : new RuntimeException();
        } catch (RuntimeException re) {
       // } catch (MyException85 re) { // %50 RunTimeException ya da B print eder
            System.out.print("B");
            //throw new MyException85();
        }
    }
}
