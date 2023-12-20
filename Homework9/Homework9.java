package Homework9;

public class Homework9 {
    public static void main(String[] args) {
        //a
        int i = 11;

        i=i++ + ++i;


        System.out.println(i);

       //b
        int a=11, b=22, c;

        c= a + b + a++ + b++ + ++a + ++b;

        System.out.println("a=" + a);    // 13
        System.out.println("b=" + b);    // 24
        System.out.println("c=" + c);    // 103

        //c
        int z=0;

        i=i++ - --i + ++i - z--;

        System.out.println(i);

        //d
        int y=1, j=2, k=3;

        int m= y-- - j-- - k--;

        System.out.println("i=" + y);  // 0
        System.out.println("j=" + j);   // 1
        System.out.println("k=" + k);   //2
        System.out.println("m=" + m);  // -4

        //e
        int a1=1, b1=2;

        System.out.println(--b1 - ++a1 + ++b1 - --a1);



    }
}
