package day_015_Exmpls;

import java.util.Scanner;

public class TLUI2a {

     /*
    a. Kullanici tarafindan girilen 10 sayidan, ciftleri ve tekleri kendi aralarinda olacak sekilde
toplayan ve toplam sonucu veren programi yaziniz.
Input : 5, 10, 30, 4, 6, 3, 7, 13, 15, 20
Output : Tek sayilarin toplami 43, cift sayilarin toplami 70.
     */

    public static void main(String[] args) {

        int tekSayiSum = 0;

        int ciftSayiSum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 10 adet sayi giriniz");


        for (int i = 0; i < 10; i++) {
            int input = scan.nextInt();
            if (input % 2 == 0) {
                ciftSayiSum += input;
            } else {
                tekSayiSum += input;
            }

        }
        System.out.println("Cift sayilarin toplami: " + ciftSayiSum);
        System.out.println("Tek sayilarin toplami : " + tekSayiSum);
    }
}