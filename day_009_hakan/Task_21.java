package day_009_hakan;

public class Task_21 {
    public static void main(String[] args) {
        int x = 4;
        int y = x * 4 - x++; // 4 * 4 - 4 (x=5)
        System.out.println(y); // 12
    }
}
