package day_024_hakan.lab;

import java.util.Arrays;

public class Q4 {
    /**
     * Bir array i parametre olarak alan ve elemanlarini toplayip sonucunu bastiran bir program
     *
     */

    public static void main(String[] args) {
        // TC1
        int[] nums = {1,5,8,-2};

        sumElementsOfArray(nums);
    }

    public static void sumElementsOfArray(int[] nums){
        int total=0;
        for(int i=0; i < nums.length ; i++ ){
            total += nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Toplam = " + total);
    }
}
