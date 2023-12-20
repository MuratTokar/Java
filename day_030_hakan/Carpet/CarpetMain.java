package day_030_hakan.Carpet;

public class CarpetMain {
    public static void main(String[] args) {
        Floor floor = new Floor(10,20);
       // CarpetPriceCalculator price =
         //       new CarpetPriceCalculator(floor, 13);

        CarpetPriceCalculator price =
                new CarpetPriceCalculator(floor, "dfdsf");
        int total = price.calculatePrice();

        System.out.println(total);
    }
}
