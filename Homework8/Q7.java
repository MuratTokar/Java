package Homework8;

public class Q7 {
    public static void main(String[] args) {
         /*
    Verilen 4 basamakli bir sayinin rakamlari toplamini hesaplayan program yaziniz.
input = 1592 output = 17
     */


            int sayi=1592;
            int rakam=0;
            int rakamlarToplami=0;

            rakam=sayi%10; // 2
            rakamlarToplami+=rakam;

            sayi=sayi/10; // 159
            rakam=sayi%10; // 9
            rakamlarToplami+=rakam;

            sayi=sayi/10;  // 15
            rakam=sayi%10;  // 5
            rakamlarToplami+=rakam;

            sayi=sayi/10;   //   1
            rakam= sayi%10;   //  1
            rakamlarToplami+=rakam;  // 17


            System.out.println("Rakamlar toplami;  " + rakamlarToplami);

        }
    }

