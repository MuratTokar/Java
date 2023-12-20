package day_009_hakan;

public class Task_19 {

    public static void main(String[] args) {
        int a = 50;
        a = --a + a++ + a-- + a++; // 49 (a=49) + 49 (a=50) + 50 (a = 49) + 49 (a = 50)
        System.out.println(a); // OUTPUT : 197
    }
}
