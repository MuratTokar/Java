package day_069_hakan;

public class Q167 {
    public static void main(String[] args) {
        int x = 100; // x = 100
        int a = x++; // a = 100 x = 101
        int b = ++x; // b = 102 x = 102
        int c = x++; // c = 102 x = 103
        int d = (a<b) ? (a<c) ? a: (b<c) ? b : c : x;
        // (100 < 102) ? (100 < 102) ? 100
        System.out.println(d);
    }
}

// x++ => x = x + 1
// ++x => (x = x + 1)