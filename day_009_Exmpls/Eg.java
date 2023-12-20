package day_009_Exmpls;

public class Eg {

    public static void main(String[] args) {

        int m=0, n=0;

        int p=--m * --n * n-- * m--;

        System.out.println(n);  // -2
        System.out.println(m);  //-2
        System.out.println(p);  // -2
    }
}
