package day_020_Exmpls;

import java.util.Random;
import java.util.Scanner;

public class CORC5 {

    /*
    Kullanicidan alinan iki yil arasindan rastgele bir tarih olusturunuz.
Tarih : DD.MM.YYYY
Input : 1990-2025 Output : 03.05.2022 // Dogru
Input : 1990-2025 Output : 31.04.2022 // YANLIS Nisan ayi en fazla 30 ceker.
Input : 1990-2025 Output : 31.02.2022 // YANLIS Subat ayi en fazla 29 ceker.
Input : 1990-2025 Output : 29.02.2023 // YANLIS Subat ayi 4’ün kati yillarda en
fazla 29 ceker.
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir yil seciverin");
        int yil1=scanner.nextInt();
        System.out.println("Lutfen bir daha yil giriniz");
        int yil2=scanner.nextInt();

        Random random=new Random();
        int yilRandom;
        if (yil1<yil2){
            yilRandom=random.nextInt(yil2-yil1)+yil1;
        } else {
            yilRandom=random.nextInt(yil1-yil2) + yil2;
        }

        int ayRandom=random.nextInt(12) +1;

        int gunRandom;

        switch (ayRandom){
            case 2:
            {
                if (yilRandom%4==0){                          // 4 yilda bir subat ayi 29 gun
                    gunRandom=random.nextInt(29)+1;
                }else {
                    gunRandom=random.nextInt(28)+1;
                }
            }break;
            case 4:
            case 6:
            case 9:
            case 11:
            {
                gunRandom=random.nextInt(30)+1;
            }break;
            default:{
                gunRandom=random.nextInt(31)+1;
            }

        }

        System.out.println(gunRandom+"."+ayRandom+"."+yilRandom);

    }
}
