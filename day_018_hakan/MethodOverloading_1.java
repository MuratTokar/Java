package day_018_hakan;

public class MethodOverloading_1 {

    // Method Overloading
    // ayni isimde method yazmak istedigimizde,
    // return Data type i farkli olsa bile hata verir
    // Sadece ama Sadece parameter type veya parameter sayisi farkli oldugunda müsade edilir


    public static void main(String[] args) {
        sum(5,10);
        sum(4,6,8);
        sum(5,7,8,9);
        sum(1,4,7,9,3);

    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static int sum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }

    public static int sum(int num1, int num2, int num3, int num4, int num5){
        return num1 + num2 + num3 + num4 + num5;
    }

    public static int sum2Integers(int num1, int num2){
        return num1 + num2;
    }

    public static int sum3Integers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static int sum4Integers(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }

    public static int sum5Integers(int num1, int num2, int num3, int num4, int num5){
        return num1 + num2 + num3 + num4 + num5;
    }
}
