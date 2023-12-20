package day_024_hakan;

import java.util.Arrays;

public class Arrays_sort {

    public static void main(String[] args) {
        int[] nums = {10, 5, -3, 40, 12}; // [-3, 5, 10, 12, 40]

        int[] numsCopy;
        numsCopy = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        System.out.println("nums(sort edilmis nums) : " + Arrays.toString(nums));
        System.out.println("numsCopy(orjinal nums) : " + Arrays.toString(numsCopy));
        System.out.println("En büyük sayi : " + nums[nums.length-1] );
        System.out.println("En kücük sayi : " + nums[0] );
    }
}
