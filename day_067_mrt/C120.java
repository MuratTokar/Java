package day_067_mrt;

public class C120 {

    public static void main(String[] args) {
        Cart c=new Cart();
        System.out.println(c.p + ":" + c.totalAmount);

    }
}
class Cart{
    Product p; // objenin default degeri nulll olur
    double totalAmount; // double nin defult degeri 0.0

}
class Product{
    String name;
    Double price;
}
// Cevap=D(null:0.0)