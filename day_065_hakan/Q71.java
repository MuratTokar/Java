package day_065_hakan;

public class Q71 {
    public static void main(String[] args) {
        C2a obj1 = new C1a();
        I2a obj2 = new C1a();

        C2a s = (C2a) obj2;
     //I2a t = obj1;// C2 class i ile I2 interfaci baglantisiz oldugu icin hata verir

      //  t.displayI();
        s.displayC2();

    }
}

class C2a {
    public void displayC2() {
        System.out.println("C2");
    }

}

interface I2a {
    public void displayI();
}

class C1a extends C2a implements I2a {  // line n1
    public void displayI(){     // line n2
        System.out.println("C1");
    }

}
