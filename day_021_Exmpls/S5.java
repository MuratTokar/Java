package day_021_Exmpls;

import java.util.Arrays;

public class S5 {
      /*

    5. Girilen bir string icerisinde, bir kelimenin kac defa bulundugunu veren programi
yaziniz.(Kücük, büyük harf önemsiz, non-casesensitive)
Input : text : “Ya bu ödev yapilacak, ya da bu ödev yapilacak“ aranacakKelime : “ya”
Output : 2 adet

     */

    public static void main(String[] args) {

    String input="Ya bu odev yapilacak, ya da bu odev yapilacak";
    String aranacakKelime="Ya";

    input=input.toLowerCase();
    aranacakKelime=aranacakKelime.toLowerCase();

    String[] arrayS=input.split(" ");

       // System.out.println(Arrays.toString(arrayS));
   int sayac=0;

        for (String kelimeYa: arrayS
             ) {
           if (kelimeYa.equals(aranacakKelime)){
               sayac++;
           }
        }

        System.out.println(aranacakKelime + " cumlede " + sayac + " defa gecmektedir");




    }
}
