package day_26_murat;

import java.util.Arrays;

public class Q_17 {
    public static void main(String[] args) {
        /**
         * Bir arrayin icerisindeki en kücük ve en büyük sayilarin farkini veren program
         */

        int[] x = {10,3,5,6}; // 7
      //  int[] x = {7,2,10,9}; // 8
        getDifferenceBetweenMaxMin(x);


    }
    public static void getDifferenceBetweenMaxMin(int[] nums){
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        System.out.println(max-min);



        // 2. yol
        int min1 = nums[0];
        int max1 = nums[0];
        for(int num : nums){
            if(num < min1){
                min1 = num;
            }

            if(max1 < num){
                max1 = num;
            }
        }

        System.out.println(max1 - min1);

    }
}
