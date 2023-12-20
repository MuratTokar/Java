package day_023_Exmpls;

import java.util.Random;

public class SLAB8_DogruCozum {

    public static void main(String[] args) {

        String input = "Java";
        input=input.toLowerCase();      // Tum harfleri kucuk hale getirdim

        String output = harfYerleriniDegistir(input);  //


        System.out.println(output);
    }

    public static String harfYerleriniDegistir(String input) {
        Random random = new Random();

        StringBuilder sb = new StringBuilder(input);    // String Builder ile daha rahat calisabilirim


        for (int i = 0; i < sb.length() - 1; i++) {
            int randomKarakterIndexi = random.nextInt(sb.length() - i - 1) + i + 1;
            char cuval = sb.charAt(i);   //  sb icin appent degil charAt() kullandim, bir karakter olusturup cuvala esitledim.
            sb.setCharAt(i, sb.charAt(randomKarakterIndexi));
            sb.setCharAt(randomKarakterIndexi, cuval);
        }

        return sb.toString().toUpperCase().substring(0,1) + sb.toString().substring(1);
        /*
        Kodun en onemli kismi: output'un ilk harfini substring(0,1) ile aldim ve buyuk hale getirdim.
        sonra kelimenin kalan kismini substring(1) ile aldim ve ilk harfe ekledim.
         */
    }
    }



