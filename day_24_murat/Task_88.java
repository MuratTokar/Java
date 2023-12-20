package day_24_murat;

import java.util.Random;
import java.util.Scanner;

public class Task_88 {
    public static void main(String[] args) {
        /**
         * Araba isimlerini tutan bir array ; Honda, Toyota, Nissan, BMW, Mercedes, Porsche,
         * Ferrari
         *
         * bir index numarasi giriniz, secilen index e göre araba fiyatini ekrana basiniz
         *
         * Honda – Toyota – Nissan (Random price between 20000 and 40000)
         * BMW-Mercedes(Random price between 50000 and 80000)
         * Porsche - Ferrari(Random price between 100000 and 150000)
         *
         * Scanner, Random
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen hayalinizdeki araba icin bier sayi girin (0-6 arasi)");
       int arabaSec= input.nextInt();

      String[] cars={"Honda", "Toyota", "Nissan", "BMW","Mercedes", "Porsche","Ferrari"};
      getPeice(cars[arabaSec]);
    }
    public static void getPeice(String brandOfcar){
        Random rn=new Random();
        int preis=0;
        switch (brandOfcar){
            case "Honda":
            case "Toyota":
            case "Nissan":
               preis= rn.nextInt(20000,40001);
                // 20.000 ile 40.000
                break;
            case "BMW":
            case "Mercedes":
                preis= rn.nextInt(50000,80001);
                break;

                // 50.000 ile 80.000
            case "Porche":
            case "Ferrari":
                // 100.000 ile 150.000
                preis= rn.nextInt(100000,150001);
                break;

            default:
                System.out.println("Lütfen gecerli bir araba markasi girin");
        }
        System.out.println("Secilen araba markasi " + brandOfcar + ",");
        System.out.println("Secilen araba fiyati : '" + preis/1000 + "." + preis%1000 +" €'");
// Array da lenght stringdeki gibi degil-burda bir metot degil bir degisken gibidir
        String[] months= {"january","february","märz","April","mai","jun","juli","August","september","oktober","Nowember","Desember"};
        int lengtUzunlugu=months.length;
        System.out.println(lengtUzunlugu);

        for (int i = 0; i <months.length; i++) {
            System.out.println(months[i]);


        }
    }
}
