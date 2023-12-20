package day_018_Exmpls;

import java.util.Scanner;

public class M14 {

     /*
 5, 10,15, 20, 25

Kullanicinin girdigi 5 sayidan en kücük 2 sayiyi veren programi yaziniz.

     */


    public static void main(String[] args) {
        enKucukIkiSayiyiBul(5, 10, 15, 20, 25);
    }

    private static void enKucukIkiSayiyiBul(int i, int i1, int i2, int i3, int i4) {

        int enkucuk = Math.min((Math.min(Math.min(i, i1), Math.min(i2, i3))), i4);
        System.out.println("En kucuk sayi  "+enkucuk);


        int ikinciEnkucuk=i;

        if (enkucuk == i ) {
            ikinciEnkucuk=Math.min(Math.min(i1,i2), Math.min(i3,i4));
        }
        if (enkucuk == i1 ) {
            ikinciEnkucuk=Math.min(Math.min(i,i2), Math.min(i3,i4));
        }
        if (enkucuk == i2 ) {
            ikinciEnkucuk=Math.min(Math.min(i1,i), Math.min(i3,i4));
        }
        if (enkucuk == i3 ) {
            ikinciEnkucuk=Math.min(Math.min(i1,i2), Math.min(i,i4));
        }
        if (enkucuk == i4 ) {
            ikinciEnkucuk=Math.min(Math.min(i1,i2), Math.min(i3,i));
        }
        System.out.println("ikinci en kucuk sayi   "+ikinciEnkucuk);
    }



}
