package day_068_hakan;

public class Q145 {
}

class SumTest{
    public static void doSum(Integer x, Integer y){
        System.out.println("Integer sum is " + (x+y));

    }

    public static void doSum(double x, double y){
        System.out.println("double sum is " + (x+y));
    }

    public static void doSum(float x, float y){
        System.out.println("float sum is " + (x+y));
    }


    public static void main(String[] args) {
        doSum(10,20); // int -> float
        doSum(10.0,20.0); // double -> double
    }

}

// byte - short - int - long - float - double - Wrapper(Integer)
