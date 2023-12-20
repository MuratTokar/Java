package day_015_hakan.homework;

import java.util.Scanner;

public class Q_02_a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplamTek=0, toplamCift=0, girilenSayi;


        int counter=1;
        while(counter <=10) {

            System.out.print("Lütfen bir sayi giriniz (Cikmak icin 0 a basiniz!) : ");
            girilenSayi = input.nextInt();

            if(girilenSayi==0) {
                break;
            }

            if (girilenSayi % 2 == 0) {
                toplamCift += girilenSayi;
            } else {
                toplamTek += girilenSayi;
            }
            counter++;
        }

        System.out.println("\nTek sayilarin toplami : " + toplamTek);
        System.out.println("Cift sayilarin toplami : " + toplamCift);


    }
}
