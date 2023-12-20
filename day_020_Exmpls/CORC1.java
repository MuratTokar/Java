package day_020_Exmpls;

import java.util.Random;

public class CORC1 {
    /*
    Bir Fal class’i yaziniz. Bu class, main haricinde 3 farkli method icersin. Her method,
kullaniciya, kendisi ile ilgili ayri bir tahminde bulunsun. Fakat bu tahminler, random
olarak, rastgele, degissin.
$ isareti ile baslayan degerler, random olarak degisecek. Mesela ay ile ilgili, 1-12
arasinda rastgele 1 sayi olusturarak, cocuk sayisini 2 ile 11 arasinda bir sayi

olusturarak, maasi 50-70 arasinda sayi olusturup, 1000 ile carparak, eyaletleri switch-
case kullanarak, 1-16 degerlerinin her birine bir eyalet atayarak...

Örnek :
Ileride $2 cocugun olacak, $1’I kiz, $1’i erkek.
$7 ay sonra ise gireceksin ve maasin $60.000 € olacak.
$Bayern eyaletinde oturacaksin ve $3 yil icerisinde bi rev alacaksin.
     */
    public static void main(String[] args) {

    cocukTahmini();
    isMaasTahmini();
    ikametTahmini();


    }

    public static void ikametTahmini() {

        Random random=new Random();
        int yil=random.nextInt(4)+1;

        int eyaletSayisi=random.nextInt(16)+1;

        switch (eyaletSayisi){
            case 1:  System.out.print(" Berlin Eyaletinde oturacaksin ve ");break;
            case 2:  System.out.print(" Bayern Eyaletinde oturacaksin ve ");break;
            case 3:  System.out.print(" NRW Eyaletinde oturacaksin ve ");break;
            case 4:  System.out.print(" Hamburg Eyaletinde oturacaksin ve ");break;
            case 5:  System.out.print(" Hessen Eyaletinde oturacaksin ve ");break;
            case 6:  System.out.print(" Baden... Eyaletinde oturacaksin ve ");break;
            case 7:  System.out.print(" Maklenburg Eyaletinde oturacaksin ve ");break;
            case 8:  System.out.print(" Bremen Eyaletinde oturacaksin ve ");break;
            case 9:  System.out.print(" Saarland Eyaletinde oturacaksin ve ");break;
            case 10:  System.out.print(" Türingen Eyaletinde oturacaksin ve ");break;
            case 11:  System.out.print(" Brendenburg Eyaletinde oturacaksin ve ");break;
            case 12:  System.out.print(" Frankfur Eyaletinde oturacaksin ve ");break;
        }
        System.out.println(yil + " sonra ev sahibi olacaksin");



    }

    public static void isMaasTahmini() {
        Random random=new Random();

        int ay=random.nextInt(12)+1;

        int maas=random.nextInt(20)+50;

        System.out.println(" " + ay + " ay sonra ise gireceksiniz ve maasiniz " + maas*1000 + " Euro olacak..");


        //  50    70   ==> 20

    }

    public static void cocukTahmini() {

        Random random=new Random();

        int cocukSayisi=random.nextInt(11)+2;

        int kizCocukSayisi=cocukSayisi/2;

        System.out.println("ileride "+ cocukSayisi + " cocugun olacak, " + kizCocukSayisi + "'i kiz, "+ ( cocukSayisi-kizCocukSayisi) + "'i errkek");
    }
}
