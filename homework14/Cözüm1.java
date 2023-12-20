package homework14;

import java.util.Scanner;

public class Cözüm1 {
    public static void main(String[] args) {
        //Asagidaki durumlari ternary operator kullanarak yaziniz.
        //a. Girilen sayinin negatif mi pozitif mi oldugunu veren program
        //b. Girilen sayinin cift mi tek mi oldugunu veren program
        //c. Birbirinden farkli 2 sayidan büyük olan sayiyi veren program

        //a
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        // int a=scan.nextInt();



        // System.out.println( a<0         ?         a+ " sayisi negatiftir"       :          a+ " sayisi pozitiftir");

        // System.out.println(  a==0   ? a+ " sifirdir"   : a<0   ? a+ " sayisi negatiftir"    :   a  + " sayisi pozitiftir") ;


        // b
        // int b=scan.nextInt();

        //  System.out.println( b%2==0 ? b + " cift bir sayidir" : b + " tek bir sayidir" );



        // c

        int c=scan.nextInt();

        int d= scan.nextInt();

        System.out.println(c>d  ? c + " buyuktur" + d + "den "  :  d + " buyuktur" + c + "den "  );

    }
}
