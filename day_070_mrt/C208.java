package day_070_mrt;

public class C208 {
    public static void main(String[] args) {
      Caller c = new Caller();
        // c.start();  // line n1
         //c.init();  // line n2  methodlar private oldugu icin compile error hatasi verecek
    }
}

class Caller {
    private void init() {
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }
}// cevap=A D
