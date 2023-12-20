package day_070_mrt;


import java.util.function.Predicate;

public class C210 {
    public static  void main(String[] args) {
        Predicate<Integer> p = (n) -> n % 2 == 0 ; // yani gelen sayi cift ise alacak

        // insert code here   // line 9 u hangi kod True basar ?

        Boolean s=p.test(100); // cevap=B (Boolean s=p.test(100);
        System.out.println(s);
    }
}
