package day_070_mrt;

public class C212 {
    public static void main(String[] args) {
       P1 obj = new P1();
        P2 obj2 = new P2();
        I1 obj3 = new P2(); // obj3 p2 den uretilmis

        boolean r1= obj instanceof P2;  // instanceof burda obj p2 nin bir objesi midir.
                                        // obj p1 super class in objesi oldugu icin subclass p2 nin olamaz=False
        boolean r2= obj2 instanceof P1; // subclass objesi super class in olabilir cunku super den türenmis=True
        boolean r3= obj3 instanceof I1;// true--siklarda compile error yazilmadigi icin bu da true
        System.out.println(r1+ " : "+r2+ " : "+r3);
    }
}

class P1 { }

class P2 extends P1 implements I1 { }

interface  I1 { }
// cevap=B( false true true)