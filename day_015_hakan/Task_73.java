package day_015_hakan;

import java.util.Scanner;

public class Task_73 {

    public static void main(String[] args) {
        // Kullanicinin 1-20 arasindaki bir gizli sayiyi tahmin ederek bulmaya calistigi,
        // girdigi sayinin büyük ya da kücük oldugunu soyleyen ve dogru sayiyi buldugunda,
        // "Tebrikler !!!" yazdiran programi yaziniz.

        Scanner input = new Scanner(System.in);

        int gizliSayi = (int) (Math.random()*20);;
        int tahmin;


        boolean flag=true;
        while(flag) {

            System.out.print("1-20 arasinda bir sayi giriniz! : ");

            tahmin = input.nextInt();

            if (tahmin < gizliSayi) {
                System.out.println("Ooo cok kücük");
            } else if (gizliSayi < tahmin) {
                System.out.println("Ooo cok büyük");
            } else {
                System.out.println("Tebrikler !!!");
                gizliSayi = (int) (Math.random()*20);
                flag=false;
            }

            if(!flag){
                System.out.println("Tekrar oynamak ister misiniz?");
                flag = input.nextBoolean();
            }
        }


/*
        while(true) {
            System.out.print("1-20 arasinda bir sayi giriniz! : ");

            tahmin = input.nextInt();

            if (tahmin < gizliSayi) {
                System.out.println("Ooo cok kücük");
            } else if (gizliSayi < tahmin) {
                System.out.println("Ooo cok büyük");
            } else {
                System.out.println("Tebrikler !!!");
                break;
            }
        }

 */


    }
}
