package extraCalismalarim2;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        //kullanicidan cinsiyetini ve  yasini isteyin  .Erkek 65 yas uzeri ise Kadin 60 yas ve uzeri ise "Emekli olabilirsiniz" yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yili söyleyin
        /*
        önce ana yapiyi kurcacagiz.
        1.if:cinsiyet kadin icin
        2.else if;cinsiyet erkek icin
        3.else;gecerli cinsyet girin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi girin");
        int yas = scan.nextInt();
        System.out.println("Lütfen cinsiyetinizi;Kadin icin K erkek icin E girin");
        char cinsiyet = scan.next().charAt(0);

        if (Character.toUpperCase(cinsiyet) == 'K') {
            if (yas < 18 || yas > 80) {
                System.out.println("Gecersiz yas girdiniz.Lütfen tekrar deneyin");
            } else if (yas >= 60) {
                System.out.println("Emekli olabilirsiniz");

            } else {
                System.out.println("Emekli olabilmeniz icin " + (60 - yas) + " yil daha calismalisiniz");
            }

        } else if (Character.toUpperCase(cinsiyet) == 'E') {
            if (yas < 15 || yas > 80) {
                System.out.println("Gecersiz yas girdiniz.Lütfen tekrar deneyin");

            } else if (yas >= 65) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olabilmeniz icin " + (65 - yas) + " yil daha calismalisiniz");
            }

        } else {
            System.out.println("Gecerli bir cinsiyet girin");
        }

    }
}
