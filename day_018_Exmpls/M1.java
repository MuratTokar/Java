package day_018_Exmpls;

import java.util.Scanner;

public class M1 {
    /*

    Kullanicidan alinan 2 sayiyi toplayan ve ciktisini alan “sum()” isminde bir metod
yaziniz.
Input : sum(3,5) Output : “Sonuc : 8”

     */

    public static void main(String[] args) {


        System.out.println(sum());

    }


    public static int sum() {
        Scanner s=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi sayi girin");
        int sayi1=s.nextInt();
        System.out.println("Lutfen bir sayi girin");
        int sayi2=s.nextInt();

        return sayi1+sayi2;

    }


}
