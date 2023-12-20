package day_024_hakan.lab;

import java.util.Arrays;

public class Q7 {
    /**
     * Verilen bir arrayin ilk ve son elementlerininden olusan yeni bir arraye ceviriniz.
     */

    public static void main(String[] args) {
        int[] nums = {1,5,7,9,0}; // [1,0]
        getFirstLastElementsOfArray(nums);
    }

    public static void getFirstLastElementsOfArray(int[] nums){
        int[] newNums = new int[2];
        newNums[0] = nums[0];
        newNums[1] = nums[nums.length-1];

        System.out.println(Arrays.toString(newNums));
    }
}
