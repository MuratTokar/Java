package day_015_murat;

import java.util.Scanner;

public class Task_73 {
    public static void main(String[] args) {
        // Kullanicidan 1-20 arasindaki bir gizli sayiyi tahmin ederek bulmaya calistigi ,girdigi sayini buyuk yada kucuk oldugunu soyleyen
        // ve dogru sayiyi buldugunda "tebrikler" yazdiran programi yazin

        int gizliSayi = (int) (Math.random() * 20);//gizli sayiyi kendi atmasi icin
        ;
        int tahmin;
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {// sonradan döngü icine aldik
            System.out.println("1 ile 20 arasinda bir sayi girin");
            tahmin = input.nextInt();
            if (tahmin < gizliSayi) {
                System.out.println("OOO cok kücükk");

            } else if (tahmin > gizliSayi) {
                System.out.println("ooo cok büyük");

            } else {
                System.out.println("Tebrikler");
                flag = false;
            }

            if (!flag) {
                System.out.println("Tekrar oynamak ister misiniz?");// oyun bitince tekrar etmek icin
                flag = input.nextBoolean();
            }
        }
    }
}
