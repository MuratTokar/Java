package day_060_hakan;

public class Q1 {

    public static void main(String[] args) {
        int x =1;
        int y =1;
        // if(1 < 2)
        // x = 2, y = 2
        if(x++ < ++y){ // true => Hello
            System.out.print("Hello ");
        } else { // false => Welcome
            System.out.print("Welcome ");
        }
        // x = ?,  y = ?
        // x = 2, y = 2
        System.out.print("Log " + x + ":" + y); // Log x:y
    }
}

// true => Hello Log x:y
// true => Hello Log 2:2
// false => Welcome Log x:y
// false => Welcome Log 2:2

// true => Hello Log 2:2


