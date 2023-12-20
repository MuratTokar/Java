package day_060_hakan;

public class Q4 {
    public static void main(String[] args) {
        int[] stack = {10,20,30};
        int size = 3;
        int idx = 0;
        // code block
        do {
            idx++;
        } while (idx < size-1);
        // idx = 2
        System.out.println("The Top element : " + stack[idx]);
        // The Top element: 30
    }
}
