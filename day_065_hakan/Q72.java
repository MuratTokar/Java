package day_065_hakan;

public class Q72 {

}

class Test {
    public static void main(String[] args) {
        Test ts = new Test();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff(); // !false -> true
        System.out.println(isAvailable);
    }

    public static boolean doStuff(){
        return !isAvailable;
    }

    static boolean isAvailable = false;
}

// false true
