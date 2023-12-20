package day_009_hakan;

public class Operators2 {

    public static void main(String[] args) {
        int a=5, b= 8;
        //int x = a++; a++ => a = a + 1;
        //int x = a = a + 1;
        int x = a; // x = 5, a = 5
        a = a + 1 ; // a = 6
        //System.out.println("a++ : " + (a++));
        System.out.println("a++ : " + (a = a + 1)); // print a=6 => a = a + 1 => a = 7
        System.out.println("a : " + a);

        System.out.println("x : " + x);

        System.out.println(b); // 8
        System.out.println(b++); // print 8, new b = 9
        System.out.println(b); // 9

        // increment ++ islemi verilen sayiyi 1 arttirir
        // a++ isleminde, öncelikle a isleme alinir, daha sonra a 1 arttirilir.
    }
}
