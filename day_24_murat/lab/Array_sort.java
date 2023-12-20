package day_24_murat.lab;

import java.util.Arrays;

public class Array_sort {
    public static void main(String[] args) {
        // sort :kücükten buyuge dogru siralar.siralar  ama array in uzerine yazar
        int[] nums={10,5,-3,40,12};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("En büyük: " + nums[nums.length-1]);
        System.out.println("En büyük: " + nums[0]);
    }
}
