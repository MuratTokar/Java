package day_36_murat;

public class Computer {
    private double price;
    private String brand;
    private int productYear;
    private int ramSize;
    private int voiceLevel;

    Computer(double price,int productYear){
        this.price=price;
        this.productYear=productYear; // superclass ta this kullanilmazz cunku this ile bir
        // ust class aulasmak icin kullanilir.yanu subclass ta kullaniriz

    }

    public int getProductYear() {
        return productYear;
    }

    double getPrice() {
        return price;
    }

    void open(){ // bunlar default
        System.out.println("bilgsayar aciliyor");

    }
    void close(){
        System.out.println("bilgisayar kapatiliyor");

    }
    void increaseVoice(){

    }
    void decraaseVoice(){

    }
}
