package day_45_murat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int divider=1;
        while (sayi >= 0) {

            try {
                System.out.println("Lütfen bolunecek sayiyi giriniz");
                sayi = input.nextInt();
                System.out.println("Lütfen bolecek  sayiyi giriniz");
                divider = input.nextInt();
                System.out.println("Sonuc : " +( sayi/divider));
            }catch (InputMismatchException e){// hatayi burdan yakalayip kodun calismasini devam ettiriyorum
                input.next();
                System.out.println("Invalid input");

            }catch (ArithmeticException e){// 20 yi 0 a bolunce aritmetik hata veririr ve burdan hatayi yakalayip kodu devam ettirdik
                System.out.println(e.getMessage());
            }


        }
    }
}
