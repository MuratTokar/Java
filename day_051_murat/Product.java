package day_051_murat;


import java.util.HashMap;
import java.util.Map;

public class Product {
    private int amount;
    private String name;
    private Size size;
    private double prince;
    private int  id;

   static Map<Integer ,Product> products=new HashMap<>();

    Product(int id,String name,Size size,int amount,double prince){
        this.name=name;
        this.size=size;
        this.amount=amount;
        this.prince=prince;
        this.id=id;
        products.put(this.id,this);

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

    public double getPrince() {
        return prince;
    }
    public int getId(){
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
                ", prince=" + prince +
                '}';
    }
}
