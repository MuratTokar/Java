package day_070_hakan;

import java.util.function.Predicate;

public class Q_210 {
    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> n % 2 == 0 ;
        System.out.println(p.test(100));

        // insert code here

    }
}
