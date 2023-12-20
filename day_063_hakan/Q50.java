package day_063_hakan;

public class Q50 {
    /**
     * Which two code fragments cause compilation errors? (Choose two.)
     * A. double y1 = 203.22; float fit = y1; //  float fit = (float) y1;

     * B. float fit = (float) 1_11.00; // true
     * C. Float fit = 100.00; / 100.00f
     * D. int y2 = 100; // true
     * float fit = (float) y2; // true
     * E. float fit = 100.00F; // true
     */

    public static void main(String[] args) {
        double a = 10e-2;
        System.out.println(a);
        Float f = 1.1f;
        System.out.println(f);
    }
}
