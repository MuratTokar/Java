package day_070_hakan;

class E1 extends Exception { } // checked & unchecked exception
class E2 extends RuntimeException { } // unchecked exception
public class Q_190 {
    public void m1(){
        System.out.println("m1.Accessed.");
       // throw new E1();
    }
    public void m2 () {
        System.out.println("m2.Accessed.");
        throw new E2();
    }

    public static void main(String[] args){
        int level = 1;
        Q_190 obj = new Q_190();
        if (level <=5 && level >=3 ) {
            obj.m1();
        }else {
            obj.m2();
        }
    }
}
