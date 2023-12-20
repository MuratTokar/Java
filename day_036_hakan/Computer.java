package day_036_hakan;

public class Computer {
    private double price;
    private String brand;
    private int productYear;
    private int ramSize;
    private int voiceLevel;

    Computer(){

    }

    Computer(double price, int productYear){
        this.price = price;
        this.productYear = productYear;
    }

    public int getProductYear() {
        return productYear;
    }

    public double getPrice(){
        return price;
    }

    void open(){
        System.out.println("Computer is starting....");
    }

    void close(){
        System.out.println("Computer is shutting down....");
    }

    void increaseVoice(){

    }

    void decreaseVoice(){

    }
}
