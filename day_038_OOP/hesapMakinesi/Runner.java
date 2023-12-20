package day_038_OOP.hesapMakinesi;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        double toplam = HesapMakinesi.toplama(sayi1, sayi2);
        System.out.println("Toplam: " + toplam);

        double fark = HesapMakinesi.cikarma(sayi1, sayi2);
        System.out.println("Fark: " + fark);

        double carpim = HesapMakinesi.carpma(sayi1, sayi2);
        System.out.println("Çarpım: " + carpim);

        double bolum = HesapMakinesi.bolme(sayi1, sayi2);
        System.out.println("Bölüm: " + bolum);

        scanner.close();
    }
}
