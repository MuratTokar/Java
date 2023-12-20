package day_025_hakan;

import java.util.Arrays;

public class Arrays_Diziler_2 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(nums);
        System.out.println("nums :" + Arrays.toString(nums));

        int[] numsCopy = Arrays.copyOf(nums,4);
        System.out.println(numsCopy);
        System.out.println("numsCopy :" + Arrays.toString(numsCopy));

        int[] nums2 = nums;
        System.out.println(nums2);
        System.out.println("nums2 :" + Arrays.toString(nums2));

        nums[0] = 40;
        System.out.println("Deger degisikliginden sonra");
        System.out.println("nums :" + Arrays.toString(nums));

        System.out.println("numsCopy :" + Arrays.toString(numsCopy));

        System.out.println("nums2 :" + Arrays.toString(nums2));

        nums2[1] = 30;
        System.out.println("Deger degisikliginden sonra");
        System.out.println("nums :" + Arrays.toString(nums));

        System.out.println("numsCopy :" + Arrays.toString(numsCopy));

        System.out.println("nums2 :" + Arrays.toString(nums2));


        System.out.println("******************************");
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        System.out.println("******************************");
        int[] numsSort = {4,3,2,7};
        System.out.println(Arrays.toString(numsSort));
        sortArray(numsSort);
        System.out.println(Arrays.toString(numsSort));
    }

    public static void sortArray(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


    }
}
