package day_068_mrt;

public class C145 {

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
// Cevap=B (float sum is 30.0  double sum is 30.0)
    }

// byte - short - int - long  = once int grubuna // sonra floating grubuna = float - double - sonra  Wrapper(Integer) grubuna

}
