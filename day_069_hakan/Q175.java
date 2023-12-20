package day_069_hakan;

public class Q175 {
    int foo;
    static int bar;

    static void process(){
     //   foo += 10;
        bar += 10;
    }

    public static void main(String[] args) {
        Q175 firstObj = new Q175();
        Q175.process(); // bar = 10
        System.out.println(firstObj.bar); // 10

        Q175 secondObj = new Q175();
        Q175.process(); // bar = 20
        System.out.println(secondObj.bar); // 20
        System.out.println(firstObj.bar); // 20
    }
}

// instance variables, static methodlarda kullanilamaz
// instance methods, static methodlarda cagrilamaz