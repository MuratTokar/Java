package day_018_Exmpls;

import java.util.Scanner;

public class M12 {

    /*
12. Kullanicin girdigi 5 sayidan en kücük sayiyi bulan programi yaziniz.
Input : 5, 10, 15, 20,  25 Output : 5

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

        System.out.println("Math sinifi ile en kucuk sayi:  "+enKucukSayiyiBul(num1, num2, num3, num4, num5));


    }

    private static int enKucukSayiyiBul(int num1, int num2, int num3, int num4, int num5) {

        int enKucukSayi= Math.min(Math.min(Math.min(num1,num2), Math.min(num3, num4)),num5);
        return enKucukSayi;
    }
}
