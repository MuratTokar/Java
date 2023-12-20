package day_024_hakan.lab;

public class Q1 {
    public static void main(String[] args) {
        // int[] nums = {1,3,5}; // false
        // int[] nums = {1,3,6}; // true
         int[] nums = {6,3,8}; // true
        // int[] nums = {6,3,6}; // true
        // int[] nums = {2,3,16}; // false
        // int[] nums = {2,6,16}; // false
        System.out.println("Sonuc : " + checkSix(nums));
    }

    public static boolean checkSix(int[] nums){
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }
}
