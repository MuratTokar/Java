package day_068_mrt;


public class C153 {
}

class FieldInit {

    Character c;
    boolean b;
    float f;

    void printAll() {
        System.out.println("Ch = " + c); // object oldugu icin null
        System.out.println("b = " + b); // false
        System.out.println("f = " + f); // 0.0

    }

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.printAll();
    }
} // Cevap=D
  // Ch = null
  // b = false
  // f = 0.0

