package day_036_hakan;

public class Laptop extends Computer {
    private int batteryLife;

    Laptop(){
        super();
    }

    Laptop(int batteryLife, double price, int productYear){
        super(price, productYear);
        this.batteryLife = batteryLife;
    }



    int getBatteryLife(){
        return batteryLife;
    }

    void closeLid(){
        super.close();
    }

    @Override
    public String toString(){
        return "Price : " + super.getPrice() + "," +
                "Product Year : " + super.getProductYear() + "," +
                "Battery Life : " + batteryLife;
    }

}
