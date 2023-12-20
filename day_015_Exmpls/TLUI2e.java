package day_015_Exmpls;

import java.util.Scanner;

public class TLUI2e {

    /*
     /*
    e. Kullanicinin girdigi sayiya göre, asagidaki sekli olusturan program yaziniz.
Input : 5 Output :

                     1
                    212
                   32121
                  4321234
                 543212345

     */


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int input=scan.nextInt();


        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <= input-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);
            }


            System.out.println("");
        }



    }

}
