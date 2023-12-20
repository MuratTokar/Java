package day_018_hakan;

public class Methods_2 {

    public static void main(String[] args) {
        degerDonme();
        String str = degerDonme2();

        int sonuc = carp(96,96);

        System.out.println(karesiniHesapla(93)); // 93, argument tir

        //System.out.println(sonuc);

        // 95, 5  - 9025
        //97 3, 9409
        // 98 2 9604

        // 82 18  6724

        // 87 13  7569

    }

    public static void degerDonme(){

        System.out.println("Deger Donme metodu calisti");
    }


    // void yerine return data type
    // "return" keyword u kullanilir

    // En sik karsilasilan hata, return edilen data ile return data type eslesmemesi
    public static String degerDonme2(){
        System.out.println("Deger Donme metodu calisti");
        int toplam=0;
        return toplam + "";
    }

    public static int carp(int a, int b){ // parameter a ve b yi local degisken olarak kabul etti
        int sonuc;
        sonuc = a*b;

        return sonuc;
    }

    public static int karesiniHesapla(int num){ // num, parameter dir.
        return num*num;
    }


}
