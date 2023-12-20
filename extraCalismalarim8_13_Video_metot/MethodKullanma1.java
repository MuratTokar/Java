package extraCalismalarim8_13_Video_metot;

import java.util.Scanner;

public class MethodKullanma1 {
    public static void main(String[] args) {
        // verilen bir sitringin Palindrome olup ol,adigini yazdirin
        // Palindrome:düzden ve tersten ayni sekilde yazilan
        // madam,12321,kabak
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir metin girin");
        String kelime=scan.nextLine();
        String ters=StringiTerseCevir.stringiTerseCevir(kelime);
       if (kelime.equals(ters)){
           System.out.println("Metin palindromedir");

        }else {
           System.out.println("Metin palindrome degildir");

       }

    }
}
