package day_027_Exmpls;

import java.util.ArrayList;
import java.util.Arrays;

public class AL7 {
    /*
    7. Girilen bir cümlenin kelimelerini iceren bir string ArrayList olusturunuz, icerisinde, bir
kelimenin kac defa bulundugunu veren programi yaziniz.(Kücük, büyük harf önemsiz,
non-casesensitive)
Input : text : “Ya bu ödev yapilacak, ya da bu ödev yapilacak“ aranacakKelime : “ya”
Output : 2 adet
     */

    public static void main(String[] args) {

        String input="Ya bu ödev yapilacak, ya da bu ödev yapilacak";
        input=input.toLowerCase();

        String aranacakKelime="ya";

        int sayac=0;

        String []  kelimeArr=input.split(" ");
        ArrayList<String> kelimeList=new ArrayList<>();
        kelimeList.addAll(Arrays.asList(kelimeArr));

        for (String each: kelimeList
             ) {
            if (each.equals(aranacakKelime)){
                sayac++;
            }
        }
        System.out.println(aranacakKelime + " cumle icerisinde " +sayac+" defa gecmektedir");








    }
}
