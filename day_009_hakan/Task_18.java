package day_009_hakan;

public class Task_18 {

    public static void main(String[] args) {
        // 1
        int x = 2,y ;
        y = x++; // y = x, x = x + 1
        System.out.println(y); // OUTPUT : 2, y=2, x=3

        // 2
        x = 2;
        System.out.println(x++); // OUTPUT : 2, x=3

        // 3
        x = 2;
        System.out.println(--x); // OUTPUT : 1, x=1

        // 4
        x = 8;
        y = x--; // y = x, x = x - 1;
        System.out.println(y); // OUTPUT : 8, y=8, x=7
    }
}
