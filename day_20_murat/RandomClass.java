package day_20_murat;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        // random class ta rastgele sayilar üretir ve bize o sayilarin dönmesi icin isim.nextInt() yada double ile aliriz
        // class i import etmek icin kisayol alt+enter
        // Random da diyelim 1 ile 10 arasinda sayi istedik .bize donen sayinin 10 a kadar olmasi icn +1 ekleriz.
        // yani =random.nextInt(10)+1; olmali
        Random rn=new Random();
        int randomNummer= rn.nextInt();
        System.out.println(randomNummer);

        randomNummer=rn.nextInt(100);
        System.out.println(randomNummer);

        boolean randomBooelan=rn.nextBoolean();
        System.out.println(randomBooelan);

        // 20 ile 45 arasi random int üreten program
        //rn.nextInt(26);// min=0,max=25r
        Random rn1=new Random();
        randomNummer=rn1.nextInt(26)+20;// min=20,max=45---> parantez ici 26 olunca 25 verecek.+20 eklersem 45 olur
        System.out.println(randomNummer);

        for (int i = 0; i < 10; i++) {


        randomNummer=  rn.nextInt(10);// 9 rakamli telefon numarasi uretecek.

        }
        System.out.println(randomNummer);
    }
}
