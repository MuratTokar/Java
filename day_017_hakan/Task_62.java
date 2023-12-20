package day_017_hakan;

import java.util.Scanner;

public class Task_62 {
    // Girilen 3 sayinin en büyügünü veren sayiyi ekrana bsan programi yaziniz (method ile)

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. sayiyi giriniz : ");
        int num1 = input.nextInt();
        System.out.print("Lütfen 2. sayiyi giriniz : ");
        int num2 = input.nextInt();
        System.out.print("Lütfen 3. sayiyi giriniz : ");
        int num3 = input.nextInt();*/
        findGreatesNumber(10,20,30);// sonra deger atariz

    }

    public static void findGreatesNumber(int num1, int num2, int num3){// 1.yol.Önce metod tanimlariz
        System.out.println("En büyük sayi : " + Math.max(Math.max(num1, num2), num3));// sonrada mat.metodunu kullaniriz
    }
}
