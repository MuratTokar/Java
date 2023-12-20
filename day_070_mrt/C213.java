package day_070_mrt;

public class C213 {
}

abstract class Toy {
    int price;
    // line n1 //  hangi 3 kod gecerlidir?

    public static void inserttoy(){ // A sikki dogru.Abstrackt icine gercek metot yazilabilir
        // insert code
    }

   /* final Toy getToy(){         // B sikki yanlis  cunku abstrackt class tan obje uretilemmez ve burda new keywordu var
        return new Toy();
    }*/

   // public void printToy();    // C sikki yanlis cunku abstrackt keywordu olmali

    public int calculatePrice(){ // D sikki dogru
        return price;
    }
    public abstract int computeDiscount();// E sikki dogru abstrackt metot olusturulmus
}
// cevap=A D E