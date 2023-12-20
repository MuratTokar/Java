package day_066_mrt;

import java.util.ArrayList;
import java.util.List;

public class C095 {

}
class Producct{
    int id;
    String name;
    Producct (int id, String name) {
        this.id = id;
        this.name = name;
    }
}
  class Shop {
    public static void main(String[] args) {
        List<Producct> lst = new ArrayList<>();
        lst.add(new Producct(10, "IceCream"));
        lst.add(new Producct(11, "Chocolate"));
        Producct p1 = new Producct(10, "Icecream");// bu yeni bir obje ve bu objeyi bulamayacak .
        // Ve -1  verecek.Bulunmayan objeleer icin -1 veririr
        System.out.println(lst.indexOf(p1));
    }
}

       // What  is the result?
// C=-1


