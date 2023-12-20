package day_030_hakan.Carpet;

public class CarpetPriceCalculator {
    int priceQuadratMeter;
    Floor floor;
    String carpetType = "";

    public CarpetPriceCalculator(Floor floor,int priceQuadratMeter){
        System.out.println("CarpetPriceCalculator objecti olusturuluyor");
        this.floor = floor;
        this.priceQuadratMeter = priceQuadratMeter;
    }

    public CarpetPriceCalculator(Floor floor,String carpetType){
        System.out.println("CarpetPriceCalculator objecti olusturuluyor");
        this.floor = floor;
        this.carpetType = carpetType;
    }

    public int calculatePrice(){
        System.out.println("Son fiyat hesaplaniyor");
        if(priceQuadratMeter < 10){
            priceQuadratMeter = getCarpetQuadratMeterPrice(carpetType);
        }
       return floor.getArea() * priceQuadratMeter;
    }

    public int getCarpetQuadratMeterPrice(String carpetType){
        switch(carpetType){
            case "iran":
                return 50;
            case "Denizli":
                return 80;
            default:
                return 10;
        }
    }
}
