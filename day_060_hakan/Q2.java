package day_060_hakan;

public class Q2 {
    public static void main(String[] args) {
        int i=10;
        int j=20;
        int k = (j += i) / 5;
        System.out.print(i + " : " + j + " : " + k);
        // 10 : 30 : 6
    }
}

// j += i => j = j + i;
