package day_065_hakan;

public class Q84 {
    /**
     * 84. Which two array initialization statements are valid? (Choose two.)
     * A. int array[] = new int[3] {1, 2, 3}; compile error
     * A. int array[] = new int[] {1, 2, 3}; true
     * B. int array[] = new int[3]; array[0] = 1; array[1] = 2;
     * array[2] = 3; true
     * C. int array[3] = new int[] {1, 2, 3}; false
     * C. int array[] = new int[] {1, 2, 3}; true
     * D. int array[] = new int[3]; array = {1, 2, 3}; false
     * E. int array[] = new int[] {1,2,3}; true
     */

    public static void main(String[] args) {
        //int array[] = new int[3] {1, 2, 3};
        //int array[] = new int[] {1, 2, 3};
        int array[] = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        //int array[3] = new int[] {1, 2, 3};
        //int array[] = new int[] {1, 2, 3};
       // int array[] = new int[3];
       // array = {1, 2, 3};
       // int array[] = new int[] {1,2,3};
    }
}
