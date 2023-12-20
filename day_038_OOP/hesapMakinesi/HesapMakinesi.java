package day_038_OOP.hesapMakinesi;

public class HesapMakinesi {

    private HesapMakinesi() {

        // Private yapiyorum. cunku disaridan obje olusturulmasina izin vermemeliyim

    }

    public static double toplama(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    public static double cikarma(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }

    public static double carpma(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }


    // Bu method icinde Exception yazmak zorundayim. cunku bolme isleminin bir bug'i olabilir (0 a bolum hata verecektir)


    public static double bolme(double sayi1, double sayi2) {

        if (sayi2 != 0) {
            return sayi1 / sayi2;
        } else {
            throw new ArithmeticException("Bölme işleminde sifira bölme mumkun degildir");
        }
    }
}
