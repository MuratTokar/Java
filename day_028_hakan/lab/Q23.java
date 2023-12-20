package day_028_hakan.lab;

import java.util.Arrays;

public class Q23 {
    /**
     * Uzunlugu verilen ve index numaralari deger
     * olarak atanan bir array olusturan program
     */

    public static void main(String[] args) {
        createArray(4); // [0, 1, 2, 3]
        createArray(1); // [0]
        createArray(10); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    public static void createArray(int num){
        int[] arr = new int[num];
        for(int i = 0; i < num; i ++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
