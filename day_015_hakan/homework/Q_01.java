package day_015_hakan.homework;

import java.util.Scanner;

public class Q_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int girilenSayi;
        String sonuc="";

        //String str = condition ? true ise : false ise;
        // a

        while(true) {
            System.out.print("Lütfen 0 dan farkli bir sayi giriniz! : ");
            girilenSayi = input.nextInt();
            if (girilenSayi != 0) {
                sonuc = 0 < girilenSayi ? girilenSayi + " pozitif bir sayidir" : girilenSayi + " negatif bir sayidir";
            }

            if(girilenSayi == 0)
                break;

            System.out.println(sonuc +"\n");
        }

        System.out.println("Güle Güle !!!");
    }
}
