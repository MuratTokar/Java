package day_070_mrt;


class Product {

    double price; // default degeri =0.0
}
public class C216 {
    public void updatePrice (Product product, double price) {
        price = price * 2; // yukaridakini cagiramaz ama price yi altta kullanmis ve gereksiz kod olmaktan cikms
        product.price = product.price + price; // class ismi ile yukaridakini cagirmis
    }

    public static void main(String[] args) {
      Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        C216 t = new C216 ();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price + " : " + newPrice);

    }
} // cevap=C (400.0 : 100.0)

