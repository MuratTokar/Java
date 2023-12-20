package day_016_hakan;

public class HW_Q2g {

    public static void main(String[] args) {
        int a = 1234421;    // 1 2 3 4 4 3 2 1
        String str = a + "";
        int sayininUzunlugu = str.length();
        String sonuc = str + ", simetrik bir sayidir :)";

        for(int i=0; i< sayininUzunlugu/2; i++){
            //if(str.charAt(0) != str.charAt(6)){
            //if(str.charAt(1) != str.charAt(5)){
            //if(str.charAt(2) != str.charAt(4)){
            if(str.charAt(i) != str.charAt(sayininUzunlugu-1-i)){
                sonuc = str + ", simetrik bir sayi degildir!";
                break;
            }
        }

        System.out.println(sonuc);

        System.out.println("**********************************************");


        a = 1234421;    // 1 2 3 4 4 3 2 1 index value 0' dan baslar
        str = a + "";
        sayininUzunlugu = str.length();
        boolean simetrikMi= true;

        for(int i=0; i< sayininUzunlugu/2; i++){
            //if(str.charAt(0) != str.charAt(6)){
            //if(str.charAt(1) != str.charAt(5)){
            //if(str.charAt(2) != str.charAt(4)){
            if(str.charAt(i) != str.charAt(sayininUzunlugu-1-i)){
                simetrikMi = false;
                break;
            }
        }

        sonuc = simetrikMi ? str + ", simetrik bir sayidir :)" : str + ", simetrik bir sayi degildir!";

        System.out.println(sonuc);

        System.out.println("**************************************");

        String[] names = {"Haldun", "Idris", "Firat", "Said", "Birsen", "Turgut"};
        // String[] digits = {"0", "1", "2", "3", "4", "5"};
        System.out.println(names[4]);

        for(int i = 0; i < names.length; i++){
            System.out.println(i +". indexteki deger : " + names[i]);
        }

    }
}
