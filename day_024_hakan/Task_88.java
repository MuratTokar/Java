package day_024_hakan;

import java.util.Random;
import java.util.Scanner;

public class Task_88 {

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


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cars[] = {"Honda", "Toyota", "Nissan", "BMW",
                "Mercedes", "Porsche","Ferrari"};

        System.out.println("Lütfen hayalinizdeki araba icin bir sayi giriniz(0-6)");
        int index = input.nextInt();
        getPrice(cars[index]);
    }

    public static void getPrice(String brandOfCar){
        Random rn = new Random();
        int price = 0;
        switch(brandOfCar){
            case "Honda":
            case "Toyota":
            case "Nissan":
                price = rn.nextInt(20000, 40001);
                // 20.000 - 40.000
                break;
            case "Mercedes":
            case "BMW":
                // 50.000 - 80.000
                price = rn.nextInt(50000, 80001);
                break;
            case "Porsche":
            case "Ferrari":
                // 100.000 - 150.000
                price = rn.nextInt(100000, 150001);
                break;
            default:
                // Bu soru icin, default a girme ihtimali yok
                System.out.println("Lütfen gecerli bir araba markasi giriniz!");
                break;
        }
        System.out.println("Secilen araba markasi : '" + brandOfCar + "'");
        System.out.println("Secilen araba fiyati : '" + price/1000 + "." + price%1000 +" €'");
    }
     */
}
