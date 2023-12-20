package day_048_hakan;

import java.util.Comparator;

public class Product implements Comparable<Product>{
    private String name;
    private int amount;
    private double purchasePrice;
    private double profitPercentage;
    private double salePrice;

    Product(String name, int amount, double purchasePrice, double profitPercentage){
        this.name = name;
        this.amount = amount;
        this.purchasePrice = purchasePrice;
        this.profitPercentage = profitPercentage;
        salePrice = calculateSalePrice();
    }

    private double calculateSalePrice(){
        return purchasePrice * (1+ profitPercentage/100);
    }


    public double getPurchasePrice() {
        return purchasePrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    // purchase price a gore compare etmek icin
   /* @Override
    public int compareTo(Product product) {
        *//**
         * return negative : kucuktur
         * return positive : buyuktur
         * return 0        : esittir
         *//*
        if(this.purchasePrice > product.purchasePrice){
            return 1;
        } else if(this.purchasePrice < product.purchasePrice){
            return -1;
        } else {
            return 0;
        }
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", salePrice=" + salePrice +
                "}\n";
    }

    // isme gore siralamak icin
   @Override
    public int compareTo(Product product) {
        /**
         * return negative : kucuktur
         * return positive : buyuktur
         * return 0        : esittir
         */

        // negative isareti ile reverse order, ters sira yapilabilir
        return this.name.compareTo(product.name);
    }
}
