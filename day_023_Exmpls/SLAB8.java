package day_023_Exmpls;

import java.util.Arrays;
import java.util.Random;

public class SLAB8 {
     /*
    Bas harfi büyük olarak girilen bir kelimenin harflerini rastgele yer degistirerek,

harflerin yerini degistirerek büyük harfle baslayan yeni bir kelime olusturan programi
yaziniz.


Input :“Java”  ==>
Output : “Aavj“


NOT== UZERINDE BIRAZ DAHA CALISILACAK
     */

    public static void main(String[] args) {

        String input="Java";
        Random random =new Random();
        String cuval="";   // bir konteyner olusturulur

        cuval+=input.toUpperCase().charAt(random.nextInt(input.length()));  // ilk karakter icin. random bir karakter alir ve onu buyuk hale getirir

        for (int i = 0; i < input.length()-1; i++) {  // ilk katakter for disinda oldugundan kalan uc karaktere gore ayarlanir. yani dongu uc kere olsun diye

            cuval+=input.toLowerCase().charAt(random.nextInt(input.length())); // kalan uc karakter kucuk harf ve randomdur
        }
        System.out.println(cuval);




    }

}
