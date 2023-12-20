package day_012_hakan;

public class Task_37 {
    public static void main(String[] args) {
        String laptopModel="acer";

        switch (laptopModel){
            case "apple":
                System.out.println("Apple isletim sistemi IOS");
                // yapmasi gereken code
                //---
                //...
                break;
            case "dell": // Dell veya acer degerlerinden biri geldiginde calisir
            case "acer":
                System.out.println("Dell-Acer isletim sistemi Windows veya Linux");
                break;
            default:
                System.out.println("Lütfen gecerli bir laptop modeli giriniz.");
                break; // default sonda kullaniliyorsa, break kullanamaya gerek yok.
        }

    }
}
