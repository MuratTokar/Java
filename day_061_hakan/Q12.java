package day_061_hakan;

public class Q12 {

    public static void main(String[] args) {
        doSum(10,20);
        //doSum(10.0,20.0);
    }

    public static void doSum(Integer x, Integer y){
        System.out.println("Integer sum is " + (x+y));
    }

    public static void doSum(double x, double y){
        System.out.println("double sum is " + (x+y));
    }

    public static void doSum(float x, float y){
        System.out.println("float sum is " + (x+y));
    }

    public static void doSum(long x, long y){
        System.out.println("long sum is " + (x+y));
    }

    /*public static void doSum(int x, int y){
        System.out.println("int sum is " + (x+y));
    }*/
}
// CASE 1:
// int sum is 30
// double sum is 30.0

// CASE 2:
// float sum is 30
// double sum is 30.0

/**
 * 1 byte : 8 bit
 * 2^(8-1) = 128 1 biti sign(isaret biti)
 * byte - 1 byte
 * short - 2 byte
 * int - 4 byte
 * long - 8 byte
 *
 * Floating data type
 * float - 4 byte
 * double - 8 byte
 *
 * float - f isareti koyulur veya explicit bir sekilde (float) yazarak cast edilir
 * double - ondalikli sayilar default olarak double i secer
 *
 * char - 4 byte
 * 0 - 64.000 araliginda bir degeri vardir
 *
 * boolean - 1 bit
 * true - false
 *
 * object - 16 byte
 *
 */
