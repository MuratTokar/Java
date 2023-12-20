package day_24_murat.lab;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] sayi={1,5,7,8,4,-1,0};
        solaKaydir(sayi);

/* Parametre olarak array kabul eden bir metod yaziniz
bu metot girilen arrayin elemanlarini sola bir kaydirarak tekrar yazdirsin
[a,b,c]=[b,c,a]

 */
// 0.elemani yani bastakini sondakine atayip öne dogru kaydirip doldurmak
    }
    // 0.elemanin degerini tut
    // 1.elementin degerini 0.elelnte ata
    // 2.elementin degerini 1.elelnte ata
    // atamaya devam
    // 0.elementin degerini son elemente ata

    public static void solaKaydir(int[] sayi){
        System.out.println("Orijinal Array " + Arrays.toString(sayi));
        int firstElement=sayi[0];
        for (int i = 0; i < sayi.length; i++) {
         sayi[i]=sayi[i+1];
        }
        sayi[sayi.length-1]=firstElement;
        System.out.println("Son  Array " + Arrays.toString(sayi));






    }



    }
