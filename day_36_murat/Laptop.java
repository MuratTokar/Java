package day_36_murat;

public class Laptop extends Computer {
    private int batteryLife;

    Laptop(int batteryLife,double price,int productYear){
        super(price,productYear);// super() ile constructor cagiririz ama en ustte olamli bu
        this.batteryLife=batteryLife;
                       // superclass variable private oldugu icin super ile ulasamayz
                       // ama ulasmak icin superclassta constructor
                      // olusturmaliyiz.  super.variableName ile variable aliriz

    }

     int getBatteryLife() {
        return batteryLife;
    }
    void closeLid(){
        super.close();// bilgisayar kapagi kapandiginda bilgisayari kapatmasini istiyorum
                     // supr yazmamin sebebi ;1.bu class tada close metodu olabilirdi

    }

    @Override
    public String toString() {
        return "Price : " + super.getPrice() + " " + "Battery Life :" + batteryLife;
    }
}
