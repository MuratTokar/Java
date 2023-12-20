package day_015_hakan.homework;

public class Q_02_b {

    public static void main(String[] args) {

        //  2, 3, 4, 5, 6, ... x-1
        int girilenSayi=13;
        String sonuc = girilenSayi + " asaldir";

        for(int i=2; i < girilenSayi;i++){
            if(girilenSayi % i == 0){
                sonuc = girilenSayi + " asal degildir";
                break;
            }
        }

        System.out.println(sonuc);


        System.out.println("********************************");

        //  2, 3, 4, 5, 6, ... x-1
        girilenSayi=13;
        boolean sayiAsalMi = true;

        for(int i=2; i <= girilenSayi/2;i++){
            if(girilenSayi % i == 0){
                sayiAsalMi = false;
                break;
            }
        }
        sonuc = sayiAsalMi ? girilenSayi + " asaldir" :girilenSayi + " asal degildir";

        System.out.println(sonuc);
    }
}
