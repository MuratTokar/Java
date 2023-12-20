package day_015_hakan;

import java.util.Scanner;

public class Task_72 {

    public static void main(String[] args) {
        // girilen 3 sayinin toplamini veren program
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 3 sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();

        System.out.println("Sayilarin toplami = " + (sayi1 + sayi2 + sayi3));
    }
}
