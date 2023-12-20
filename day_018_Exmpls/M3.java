package day_018_Exmpls;

import java.util.Scanner;

public class M3 {
    /*
    Kullanicinin girdigi isme, hosgeldiniz diyen bir method yaziniz.
Input : „Semsettin“ Output : Hosgeldin Semsettin!
     */
    public static void main(String[] args) {


        semsettin();



    }

    public static void semsettin() {
        Scanner s=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim=s.nextLine();

        System.out.println("Hosgeldin " +isim);

    }
}
