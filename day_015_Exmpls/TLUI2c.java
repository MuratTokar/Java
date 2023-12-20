package day_015_Exmpls;

import java.util.Scanner;

public class TLUI2c {
    /*

    c. Kullanici tarafindan girilen 2 sayi ve aritmetik islemi isaretine göre hesaplama yapan bir
hesap makinesi yaziniz.
Input : + , 10, 20 Output : Girilen sayilarin toplami = 20
Input : *, 3, 5 Output : Girilen sayilarin carpimi = 15

     */

    public static void main(String[] args) {

        char islemIsareti='+';

        Scanner armut=new Scanner(System.in);

        System.out.println(" Lutfen bir sayi giriniz");

        int sayi1=armut.nextInt();

        System.out.println("Islem yapmak istediginiz ikinci sayiyi da giriniz");

        int sayi2=armut.nextInt();


        switch (islemIsareti){
            case '+':
                System.out.println("Girdiginiz sayilarin toplami : " +  (sayi1+sayi2));

            case '*':
                System.out.println("Girdiginiz sayilarin carpimi : " +  (sayi1*sayi2));
                break;
        }

    }

}
