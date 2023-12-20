package day_17_murat;

import java.util.Scanner;

public class Task_62 {
    public static void main(String[] args) {
// Girilen 3 sayinin en büyügünü veren sayiyi ekrana bsan programi yaziniz (method ile)
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 1. sayiyi  girin");
        int num1=input.nextInt();
        System.out.println("Lütfen 2.sayiyi girin");
        int num2=input.nextInt();
        System.out.println("Lütfen 3.sayiyi girin");
        int num3=input.nextInt();
        ebBüyükSayi(num1,num2,num3);//1.yol sonra deger atiyoruz ve cagiriyoruz





    }
    public static void ebBüyükSayi(int num1,int num2,int num3){//1.yol önce metod tanimliyoruz
        System.out.println(" en büyük sayi: " + Math.max(Math.max(num1,num2),num3));// 1.yol sonra bastiryoruz mat metodu ile
    }
}
