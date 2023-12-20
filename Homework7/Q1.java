package Homework7;

import homework10.Homework7;

public class Q1 {
    public static void main(String[] args) {
          /*
    1. String isim, int yas, String sehir, char kanGrubu, char kanGrubuIsareti adinda degiskenler
olusturup(declare), deger(value) olarak da kendi bilgilerinizi atayiniz(assign). Bu degiskenleri
cagirarak asagidaki ciktiyi console a yazdiriniz.
“Merhaba benim ismim {isim}, {yas} yasindayim. {sehir} sehrinde ikamet ediyorum ve kan
grubum {kanGrubu} Rh ({kanGrubuIsareti}).“
“Merhaba benim ismim Hakan, 40 yasindayim. Augsburg sehrinde ikamet ediyorum ve kan
grubum B Rh (+).“
     */


        String isim = "Murat";
        int yas = 37;
        String sehir = "Kamp Lintfort";
        char kanGrubu = 'B';
        char kanGrubuIsareti = '+';

        System.out.println("Merhaba benim ismim " + isim + ", " + yas + " yasindayim. " + sehir + " sehrinde ikamet ediyorum ve" +
                " kan grubum " + kanGrubu + "(Rh" + kanGrubuIsareti + ")");


    }
}