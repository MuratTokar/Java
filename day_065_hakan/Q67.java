package day_065_hakan;

public class Q67 {
    public static void main(String[] args) {
        Caller c = new Caller();
      // c.start(); // compilation fails
      // c.init(); // compilation fails
    }
}

class Caller {
    private void init(){
        System.out.println("Initialized");
    }

    private void start(){
        init();
        System.out.println("Started");
    }
}
