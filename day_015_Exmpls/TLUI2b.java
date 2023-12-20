package day_015_Exmpls;

import java.util.Scanner;

public class TLUI2b {
    /*
    Kullanici tarafindan girilen bir pozitif sayinin, asal olup olmadigini veren program yaziniz.
Not : Kendisi ve 1 den baska böleni olmayan pozitif sayilara asal sayilar denir.
Input : 17 Output : 17 asal bir sayidir.
Input : 20 Output : 20 asal bir sayi degildir.


     */


    public static void main(String[] args) {

    Scanner obje=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz ");

        int input=obje.nextInt();


        boolean asalMi=true;

        if (input<=1){
            System.out.println(input+ " Asal bir sayi degildir ");
        }else {

            for (int i = 2; i <=input/2 ; i++) {
                if (input%i==0){
                    asalMi=false;
                }
            }

            if (asalMi){
                System.out.println(input + " Asal bir sayidir");
            } else {
                System.out.println(input + " Asal bir sayi degildir");
            }


        }



    }


}
