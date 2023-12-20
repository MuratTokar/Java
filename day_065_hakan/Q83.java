package day_065_hakan;

public class Q83 {

}

class Test83 {
    public static void main(String[] args) {
        Test83 ts = new Test83();
        System.out.println(isAvailable + " "); // true
        isAvailable = ts.doStuff(); // isAvailable = false
        System.out.println(isAvailable); // false
        // System.out.println(ts.isAvailable); // false
    }

    public static boolean doStuff(){
        return !isAvailable;
    }

    static boolean isAvailable = true;
}

class TestStatic {
    public static void main(String[] args) {
        Test83 ts = new Test83();
        System.out.println(ts.isAvailable + " "); // true
        ts.isAvailable = ts.doStuff(); // isAvailable = false
        System.out.println(ts.isAvailable); // false
        // System.out.println(ts.isAvailable); // false
    }
}

// true false