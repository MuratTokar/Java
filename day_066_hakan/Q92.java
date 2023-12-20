package day_066_hakan;

public class Q92 {
    public static void main(String[] args) {
        Integer x = new Integer("1");
        System.out.println(x + 5);
        switch(x){
            case 1:
                System.out.println(x);
        }
    }

}
// ACCEPTED
// A switch works with the
// - byte, short, char, and int primitive data types.
// - String
// - enum
// - Wrapper classes : Character, Byte, Short, and Integer

// NOT ACCEPTED
// long, double, float, except the above wrapper classes
