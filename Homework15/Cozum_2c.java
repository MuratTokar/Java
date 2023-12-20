package Homework15;

import java.util.Scanner;

public class Cozum_2c {
    public static void main(String[] args) {
        /*
        c. Kullanici tarafindan girilen 2 sayi ve aritmetik islemi isaretine göre hesaplama yapan bir
hesap makinesi yaziniz.
Input : + , 10, 20 Output : Girilen sayilarin toplami = 20
Input : *, 3, 5 Output : Girilen sayilarin carpimi = 15
         */
char islemIsareti='+';
        Scanner armut=new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin");//kullanniciya mesaj
        int sayi=armut.nextInt();// ilk sayiyi aldik
        System.out.println("Lutfen 2.sayiyi girn");// kullaniciya ikinic mesaj
        int sayi2=armut.nextInt();// ikinci sayiyi aldik
        switch (islemIsareti){
            case '+':
                System.out.println("Girdiginiz sayilarin toplami:"+(sayi+sayi2));
        }
    }
}
