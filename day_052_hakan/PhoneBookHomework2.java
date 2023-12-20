package day_052_hakan;

import java.util.ArrayList;

public class PhoneBookHomework2 {
    /*
    1. telefon numarasinda 7 sayisi olan kisileri yazdiran program
    2. Rehberdeki en tecrubeli kisiyi ve en genc/dinamik kisiyi getiren program
    3. Isimleri siralayarak kisileri yazdiriniz.
    4. Telefon numaralarini buyukten kucuge siralayacak sekilde compareTo methodunu guncelleyiniz
    5. yaslari ayni olan kisileri yazdiran programi yaziniz
    6. "130000000" numarasina sahip kisiyi yazdiran program
    7. Isimleri bir arraylist e ekleyip yazdiriniz
    8. Yaslari tekrar etmeyecek sekilde, bir set e ekleyip yazdiriniz
    9. Sehirlerde a harfi bulunan sehirleri bir list e ekleyiniz
    10. Sehirlerden M harfi ile baslayan kisileri yas sirasina gore bastiriniz
    11. Sehirleri 6 harf ve daha kisa olan kisileri isim sirasina gore bastiriniz
    12. Yasi 35 ve alti olan kisileri bastiriniz

     */
    public static void main(String[] args) {
        //System.out.println(TelefonRehberi.getPhoneBook());
        ArrayList<TelefonRehberi> persons = new ArrayList<>();
        TelefonRehberi kisi = new TelefonRehberi();
        for(Object o : TelefonRehberi.getPhoneBook().values()){
            persons.add((TelefonRehberi) o);
        }

        System.out.println(persons.get(12).getName());

        System.out.println(((TelefonRehberi) TelefonRehberi.getPhoneBook().get("180000000")).getName());

        Object number = 5;
        Object numberString = 15;

        System.out.println((Integer) numberString + (Integer) number);
    }
}
