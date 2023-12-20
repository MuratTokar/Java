package day_051_hakan;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private int id;
    private int amount;
    private String name;
    private Size size;
    private double price;

    static Map<Integer, Product> products = new HashMap<>();

    Product(int id, String name, Size size, int amount, double price){
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.size = size;
        if(!products.containsKey(id)){
            products.put(id,this);
        }
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public enum Size{
        LARGE,MEDIUM,SMALL;
    }

    @Override
    public String toString() {
        return "Product{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}


