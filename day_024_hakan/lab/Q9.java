package day_024_hakan.lab;

import java.util.Arrays;

public class Q9 {
    // verilen bir arrayin 2 kati uzunlugunda ve sadece son elemanlari ayni olan yeni bir array olusturan program

    public static void main(String[] args) {
        int[] nums = {14,5,10};
        doubleArray(nums);
    }

    public static void doubleArray(int[] nums){
        // 2 kati uzunlugunda bir array olustur
        int[] doubleNums = new int[2*nums.length];
        System.out.println("The length of new array : " + doubleNums.length);

        // son index e gelen array in son indexindeki degeri ata
        doubleNums[doubleNums.length-1] = nums[nums.length-1];

        System.out.println("New Array : " + Arrays.toString(doubleNums));
    }
}
