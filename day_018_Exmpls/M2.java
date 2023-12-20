package day_018_Exmpls;

import java.util.Scanner;

public class M2 {
    /*
    Kullanicinin girdigi bir sayiyinin karesini hesaplayan bir metod yaziniz.
Input : karesiniAl(5) Output : 5’in karesi = 25
Not : Math class i icerisinde benzer bir metod var mi control ediniz.
     */
    public static void main(String[] args) {

        int a=9, b=5;
       System.out.println(Math.multiplyExact(a,b));

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
       int sayi= input.nextInt();
        karesiniAl(10);

    }

    public static int karesiniAl(int sayi) {

      return sayi*sayi;
    }
}
