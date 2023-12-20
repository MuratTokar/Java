package day_063_hakan;

public class Q49 {
    public static void main(String[] args) {
        int[][] n = {{1,3}, {2,4}};
        for(int i = n.length-1; i >= 0; i--){ // i=1, i=0
            for(int y : n[i]){ // i=1 -> {2,4}   i=0 -> {1,3}
                System.out.print(y); // 2413
            }
        }
    }
}
