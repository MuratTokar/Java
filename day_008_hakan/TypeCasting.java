package day_008_hakan;

public class TypeCasting {

    public static void main(String[] args) {
        int dilimSayisi = 10, kisiSayisi = 4;
        double kisiBasiDüsenDilimSayisi;

        // 1. ve 4. islemler ayni sonucu verecektir, "otomatik genisletme" oldugu icin
        kisiBasiDüsenDilimSayisi = dilimSayisi / kisiSayisi;
        System.out.println("Kisi basi düsen dilim sayisi : " + kisiBasiDüsenDilimSayisi);

        kisiBasiDüsenDilimSayisi = (double) dilimSayisi / kisiSayisi;
        System.out.println("Kisi basi düsen dilim sayisi : " + kisiBasiDüsenDilimSayisi);

        kisiBasiDüsenDilimSayisi = dilimSayisi / (double) kisiSayisi;
        System.out.println("Kisi basi düsen dilim sayisi : " + kisiBasiDüsenDilimSayisi);

        // 1. ve 4. islemler ayni sonucu verecektir, "otomatik genisletme" (automatically widening) oldugu icin
        kisiBasiDüsenDilimSayisi = (double) (dilimSayisi / kisiSayisi);
        System.out.println("Kisi basi düsen dilim sayisi : " + kisiBasiDüsenDilimSayisi);


        int a=10, b=4;
        double x = 10.0, y = 4.0;

        double sonuc = a/b; // 10/4
        System.out.println("10/4 : " + sonuc); // 2.0
        sonuc = a/y; // 10/4.0
        System.out.println("10/4.0 : " + sonuc); // 2.5
        sonuc = x/y; // 10.0/4.0
        System.out.println("10.0/4.0 : " + sonuc); // 2.5
        sonuc = x/b; // 10.0/4
        System.out.println("10.0/4 : " + sonuc); // 2.5

    }

}
