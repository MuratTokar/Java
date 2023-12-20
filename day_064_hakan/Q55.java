package day_064_hakan;

public class Q55 {
    public static void main(String[] args) {
        int x =5;
        while(isAvailable(x)){ // x = 5
            // sol 1
            System.out.println(x--);


            // sol 2
            System.out.println(x);
            x--;
        }
    }

    public static boolean isAvailable(int x){
        // 5, 4, 3, 2, 1
        return x-- > 0 ? true : false; // x = 4
    }
}

/**
 * ayni sonuclari verir
 * int x = 6;
 * --x;
 * sout(x); // 5
 *
 * sout(--x); // 5
 *
 * farkli sonuclar verir
 * x--;
 * sout(x); // 5
 *
 * sout(x--); // print 6 sonra x=5;
 */