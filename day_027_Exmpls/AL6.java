package day_027_Exmpls;

import java.util.ArrayList;
import java.util.Arrays;

public class AL6 {
    /*
    6. Girilen bir stringin harflarini iceren bir arraylist olusturunuz, icerisinde, ‘a‘ harfini
arayiniz. Yoksa ‘a’ harfi yok, varsa ‘a’ harfindan X tane var, yazdiriniz.

Input : “Hakan” Output : ‘a’ harfindan 2 tane var.
Input : “Heken” Output : ‘a’ harfi yok.
     */
    public static void main(String[] args) {

        String input="Heken";

        String aranacakHarf="a";

        String [] harfArr=input.split("");

        ArrayList<String> harfList=new ArrayList<>();

        harfList.addAll(Arrays.asList(harfArr));

        int sayac=0;
        for (String each: harfList
             ) {
            if (each.equals("a")){
                sayac++;
            }
        }

        System.out.println(aranacakHarf + " kelime icerisinde " +sayac+" defa gecmektedir");



    }
}
