package day_009_hakan;

public class IncrementDecrementOperators {

    public static void main(String[] args) {
        int a=5, b= 10;

        // post increment/decrement var++/--
        System.out.println(a++); // print 5
        System.out.println(a); // print 6

        System.out.println(b--); // 10 b, b = b - 1
        System.out.println(b); // 9

        // pre increment/decrement --/++var
        int x = 5, y = 10;
        System.out.println(++x); // print 6
        System.out.println(x); // 6

        System.out.println(--y); // 9 y - 1 , y = y -1
        System.out.println(y); // 9

    }
}
