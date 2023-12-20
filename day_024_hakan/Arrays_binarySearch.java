package day_024_hakan;

import java.util.Arrays;

public class Arrays_binarySearch {
    public static void main(String[] args) {
        int arananDeger = 2;
        int[] nums = {3,5,7,2};
        Arrays.sort(nums); // [2,3,5,7]
        System.out.println(Arrays.binarySearch(nums, 7));
        System.out.println(Arrays.binarySearch(nums, 2)); // -(arrayde olsa hangi indexte olmasi gerekirdi) -1
        if(0 <= Arrays.binarySearch(nums, arananDeger) ){
            System.out.println(arananDeger + " array in icerisinde vardir");
        }
    }
}
