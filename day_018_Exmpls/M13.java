package day_018_Exmpls;

import java.util.Scanner;

public class M13 {
    /*
    13. Kullanicin girdigi 5 sayidan en büyük sayiyi bulan programi yaziniz.
Input : 5, 10, 15, 20, 25 Output : 25
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int num1= sc.nextInt();
        System.out.println("Lutfen bir sayi giriniz..");
        int num2= sc.nextInt();
        System.out.println("Lutfen bir sayi giriniz..");
        int num3= sc.nextInt();
        System.out.println("Lutfen bir sayi giriniz..");
        int num4= sc.nextInt();
        System.out.println("Lutfen bir sayi giriniz..");
        int num5= sc.nextInt();

        System.out.println("Math sinifi ile en buyuk sayi:  "+enBuyukSayiyiBul(num1, num2, num3, num4, num5));



    }

    public static int enBuyukSayiyiBul(int num1, int num2, int num3, int num4, int num5) {

       int enBuyukSayi= Math.max(Math.max(Math.max(num1,num2), Math.max(num3, num4)),num5);
       return enBuyukSayi;
    }
}
