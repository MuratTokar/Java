package day_068_hakan;

public class Q137 {

    public static void main(String[] args) {
        int n[][] = {{1,3}, {2,4}};
        for(int i=n.length-1; i>=0; i--){ // i = 1,0
            for(int j = n[i].length-1; j>=0; j--){ // j = 1,0
                System.out.println(n[i][j]);
                // 4 2 3 1
            }
        }
    }
}
