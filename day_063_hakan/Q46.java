package day_063_hakan;

public class Q46 {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        int c=1;
        int r1 = a * b / c + 1; // 3 * 2 / 1 + 1 = 7
        int r2 = a / b * c + 1; // 3 / 2 * 1 + 1 = 2
        int r3 = a * (b / (c + 1)); // 3 * (2 / (1 +1 )) ->  3 * (2 / 2) -> 3 * 1 = 3
        System.out.println(r1 + " : " + r2 + " : " + r3); // 7 : 2 : 3
    }
}
