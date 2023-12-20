package day_017_hakan;

public class Methods {

    public static void main(String[] args) {
        // EBOB ve EKOK u veren programi yaziniz

        // EBOB
        // EBOB Kod Blogu

       String variableName = "value";

        // EKOK
        // EKOK Kod Blogu

        // Sonucu bas
        // sout
        /*
        ebobHesapla();
        ekokHesapla();
        ekranaBas();
         */

        String str="HAKAN";
       // System.out.println(str.toLowerCase());
        // System.out.println("*********************************");



        ismimiYazdir(); // methodu call etmek, cagirmak
        dunyayiSelamla(); // methodu call etmek, cagirmak



        // !!! ÖNEMLI !!!
        // 1. Methodlar birbiri icinde yazilamazlar (main methodun icine method yazilamaz, sadece call edilebilir.)

    }

    public static void ismimiYazdir(){
        System.out.println("Hakan");
    }

    public static void dunyayiSelamla(){
        System.out.println("Hello World");
    }

}
