package extraCalismalarim;

import java.util.Scanner;

public class GeenelVeDataTürleriIleMemoryler {
    public static void main(String[] args) {
        /*PRIMITIVE DATEN
        1=Boolean-boolean
        2=Charecter-char
        Floting Point-3=float 4=double
        Integers-5=byte  6=short  7=int  8=long

        NON-PRIMITIVE/REFERANCE
        1=Arrays
        2=Strings
        3=Classes
        4=Interfaces
        5=Enums
        6=Objects
1=BOOLEAN:Mantiksal data sonuclarini store etmek icin kullanilir.Sonucu Evet yada Hayir/True ode Falls/ 0 ve 1
          Hafizada 1 bit yer kaplar
2=CHAR: Tek bir karakter barindirir. tek tirnak icine yazilir 'c' .16 bit/2 byte yer kaplar

3=BYTE: Tam sayi sayi datasidir.8 bit/1 byte yer kaplar. -128 ile 127 arsinda ddeger alir-
        -2^7 ile 2^7-1
4=SHORT:Tam sayi degiskenidir.16 bit/ 2 byte yer kaplar.-2^15: -32768 ile 2^15-1:32767  .

5=INT: 32 bit/4 byte yer kaplar.-2^31 ile 2^31-1 araisndadir.En cok kullanilan degiskendir

6=LONG:64 bit/ 8 byte yer kaplar.-2^63 ile 2^63-1 arsindadir.Tanimlanan degerin sonuna l harfi yazilir

*********************** ONDALIKLI SAYI DEGISKENLERI
1=DOUBLE=64 bit/8 byte yer kaplar.Virgülden sonra 16 basamak gider.

2=FLOAT:Double den farkli oldugunu belirtmek icn degerin sonuna f harfi konur. Float y=45.123456f.
       32 bit/4 byte yer kaplar


       ############################ NON PRIMITIVE #######################################################
       Java tarafindan olustururulmustur ve sinirlama yoktur.Geneli icin object tabiri kullanilir cunku bu data türlerinin
       kendilerine ait bir class tarafindan olusturulan objelerdir.NOT: Primitive data türündeki variable ler sadece
       DEGER alirlar.Ama non primitive data türündeki variable ler hem degeri hem de metotlari olur
         */
        String ilkHarf="K";
        char iklHarf2='m';
        System.out.println(ilkHarf.toLowerCase());// Strin degiskeninin degerinin ilk harfini kücük yapti.
        //ama char i degistirmez
        //##########################################################################################################//
       /* STACK MEMORY DE PRIMITIVE DATA TÜRÜNDEKI VARIABLE LER VE DEGRELERI ILE NON PRIMITIVE DATA TÜRÜNDEKI VARIABLE
       LERIN REFERANSLARI OLUEKEN ,HEAP MEMMORY DE ISE NON PRIMITIVE VARIABLE LERIN DEGERLERI STORE EDILIR

                                           SATCK MEMORY                            HEAP MEMORY
       Int a;         char c='#'     ----->a,b=20,char=# burda saklanir       --non primitive degerleri burda saklanir
       int b=20;      String str1;-------->str1 ile str2 nin
        String str2="Java güzeldir";       referanslari burda olur ----->             str2=java güzeldir

        */
        //##################### SCANNER CLASSE  #####################################################################

       /* Scanner scan=new Scanner(System.in); // önce scanner objesi olusturduk
        System.out.println("Lütfen kullanici adini girin");// kullaniciya mesaj verdik
        String kullaniciIsmi=scan.next();// girilen bilgiyi icine koyabilecegimiz bir variable olusturun ve olusturdugumuz
        System.out.println("Girilen isim: "+kullaniciIsmi);   // scanner objesi ile uygun metodu kullanarak bilgiyi aliriz*/


        Scanner sayi=new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin");
        int girilrnsayi=sayi.nextInt();
        System.out.println("Girilen sayinin karesi: " + girilrnsayi*girilrnsayi);


    }
}
