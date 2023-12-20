package day_015_Exmpls;

import java.util.Scanner;

public class TLUI2d {

    /*
    d. Kullanici tarafindan girilen sayiya kadar olan Fibonacci sayilarini yazdiran program yaziniz.
Input : 30 Output : 0 , 1 , 1  , 2,  3, 5, 8, 13, 21

     */

    public static void main(String[] args) {

    Scanner elma=new Scanner(System.in);
        System.out.println("Lutfen bir asyi giriniz..");
        int num= elma.nextInt();

        int ilkFibonacciSayisi=0;
        int ikinciFifonacciSayisi=1;

        int takipEdenFibonacciSayisi;

        while (ilkFibonacciSayisi<=num){

            System.out.print(ilkFibonacciSayisi + " ");

            takipEdenFibonacciSayisi = ilkFibonacciSayisi+ikinciFifonacciSayisi;

            ilkFibonacciSayisi=ikinciFifonacciSayisi;

            ikinciFifonacciSayisi=takipEdenFibonacciSayisi;

        }




    }
}
