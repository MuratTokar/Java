package day_059_hakan;

import java.util.Arrays;

public class ArraysReview {

    public static void main(String[] args) {
        int a = 5;
        addTwo(a); // 7
        System.out.println(a);  // 5

        int[] nums = {1,2,3,4,5};
        System.out.println(nums);
        //System.out.println(addOneToEachElementKeepOriginal(nums));
        System.out.println(Arrays.toString(nums)); // {1,2,3,4,5}
        System.out.println(Arrays.toString(addOneToEachElement(nums))); // {2,3,4,5,6}

        System.out.println(Arrays.toString(nums)); // {2,3,4,5,6}
    }

    public static int addTwo(int a){
        a =+ 2;
        System.out.println(a); // 7
        return a;
    }

    public static int[] addOneToEachElement(int[] nums){
        for(int i=0; i< nums.length ; i++){
            nums[i] += 1;
        }
        System.out.println(nums);
        return nums;
    }

    public static int[] addOneToEachElementKeepOriginal(int[] nums){
        int[] nums2 = new int[nums.length];
        for(int i=0; i< nums2.length ; i++){
            nums2[i] = nums[i] + 1;
        }

        return nums2;
    }
}
