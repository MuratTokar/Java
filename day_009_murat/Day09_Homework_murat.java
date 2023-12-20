package day_009_murat;

public class Day09_Homework_murat {
    public static void main(String[] args) {
        /* 1-A Asagidaki islemlerin sonuclarini hesaplayiniz.
         int i=11;   i=i++ + ++i;
        System.out.println(i);*/
        int i=11;
        i=i++ + ++i;// i:11 (12)+i:13(I:13)=i24
        System.out.println(i);

       /* 1-B
       int a = 11, b=22, c;
       c=a + b + a++ + b++ + ++a + ++b;
       C=11+22+11(a=12)+22(b=23)+13+24
       System.out.println("a="+a);
       System.out.println("b="+b);
       System.out.println("c="+c);
        */
        int a = 11, b=22, c;
        c=a + b + a++ + b++ + ++a + ++b;
        System.out.println("a="+a); // a:13
        System.out.println("b="+b); // b:24
        System.out.println("c="+c); // c:103


       /* 1 C
       i=0;
       i=i++ - --i + ++i - i--;
       i=0(i=1)-0(i=0)+1(i=1)-1
       System.out.println(i);
        */
        i=0;
        i=i++ - --i + ++i - i--;
        System.out.println("i:"+i);

        /* 1 D
        int i=1, j=2,k3 ;
        int m= i-- - j-- - k--;
        System.out.println("i= " + i);
        System.out.println("j= " + j);
        System.out.println("k= " + k);
        System.out.println("m= " + m);
         */
        i=1;
        int j=2, k =3 ;
        int m= i-- - j-- - k--;
        //  m=1(i=0) - 2(j=1) - 3(k=2)// m:-4
        System.out.println("i= " + i);
        System.out.println("j= " + j);
        System.out.println("k= " + k);
        System.out.println("m= " + m);

        /*1 E
        a=1; b=2;
        System.out.println(--b - ++a + ++b - --a);
        1(b=1) - 2(a=2) + 2(b=2) - 1(a=1)= 0
         */

        a=1; b=2;
        System.out.println(--b - ++a + ++b - --a);


        /*1F
        i=19;
        j=29;
        k= i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        //19(i=18) - 18(i=19) +28(j=28) - 29(j=29) + 18(i=18) - 29(j=28) + 19(i=19) - 28(j=29) = -20
        System.out.println("i= "+ i); //  19
        System.out.println("j= "+ j); // 29
        System.out.println("k= "+ k); //  -20
        */

        i=19;
        j=29;
        k= i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        System.out.println("i= "+ i);
        System.out.println("j= "+ j);
        System.out.println("k= "+ k);

        /* 1 G
         m=0;
        int n=0;
        int p= --m *  --n * n-- * m--;
        p= -1(m=-1) * -1(n=-1) * -1(n=-2) * -1(m=-2) =1
        System.out.println(p);
        */

        m=0;
        int n=0;
        int p= --m *  --n * n-- * m--;
        System.out.println(p);

        /*1 H
         a=1;
         a= a++ + ++a * --a - a--;
         a= 1(a=2) + 3(a=3) * 2(a=2) - 2(a=1)= 5
         System.out.println(a);
        */

        a=1;
        a= a++ + ++a * --a - a--;
        System.out.println(a);

    }
}
