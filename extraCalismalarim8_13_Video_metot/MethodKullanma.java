package extraCalismalarim8_13_Video_metot;

import java.util.Scanner;

public class MethodKullanma {
    public static void main(String[] args) {
        // kullanicidan 10 dan kücük 2 tane pozitif tam sayi alin ve faktöryel degerlerini toplayin
        Scanner scan=new Scanner(System.in);
        System.out.println("10 dan kücük 2 adet pozitif tam sayi girin");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sonuc= Faktöryel.faktöryelHesapla(sayi1) + Faktöryel.faktöryelHesapla(sayi2);
        System.out.println(sonuc);


    }
}
