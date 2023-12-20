package Homework9;

public class Homework09 {
    public static void main(String[] args) {
        //f
        int i=19, j=29, k;

        k= i-- - i++ + --j - ++j + --i - j-- + ++i - j++;

        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);

       //g
        int m=0, n=0;

        int p=--m * --n * n-- * m--;

        System.out.println(n);
        System.out.println(m);
        System.out.println(p);
        //h
        int a=1;
        a=a++ + ++a * --a - a--;


        System.out.println(a);

        //i
        int ch='A';   // A==> 65

        System.out.println(ch++);  // 65

        //j
        char ch1='0';

        System.out.println(ch1-- + --ch1);

        //k
        int a1=100, b=7, c=200;
        a1%=b;
        a1*=b;
        c/=b;
        c-=a1;
        c+=b;

        System.out.println(c);

        //l
        System.out.println(4==2 && (1274%6>40%7)); //false
    }
}
