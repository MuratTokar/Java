package day_015_murat;

import java.util.Scanner;

public class Taks_72 {
    public static void main(String[] args) {
        //girilen 3 sayinin toplamini veren program yazin
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen 3 sayi girin");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int sayi3=input.nextInt();
        System.out.println("Sayilarin toplami : " + (sayi1+sayi2+sayi3));


    }
}
