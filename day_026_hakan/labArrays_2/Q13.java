package day_026_hakan.labArrays_2;

import java.util.Arrays;

public class Q13 {

    /**
     * 2 arrayi parametre olarak kabul eden bir method yaziniz
     * arraylerin elemanlarinin toplamlarini kiyaslayan ve
     * toplami daha büyük olan arrayi ekrana basan
     * Esitse, esittir yazdiran program
     *
     */

    public static void main(String[] args) {
//        int[] x = {1,2};        // [3,4]
//        int[] y = {3,4};

//        int[] x = {5,6};      // esittir
//        int[] y = {3,8};

        int[] x = {1,1};      // [1,1]
        int[] y = {1,0};

        checkSumsArray(x,y);
    }

    public static void checkSumsArray(int[] nums1, int[] nums2){
        // arraylerin elemanlarini topla
        // toplamlari kiyasla
                // büyük olani yazdir
                // esitse, esittir yazdir

        int total_1 = sumElementsOfArray(nums1);
        int total_2 = sumElementsOfArray(nums2);

        if(total_1 < total_2){
            System.out.println(Arrays.toString(nums2));
        } else if(total_2 < total_1){
            System.out.println(Arrays.toString(nums1));
        } else {
            System.out.println("Esittir");
        }

    }

    public static int sumElementsOfArray(int[] nums){
        int total = 0;
        for(int num : nums){
            total += num;
        }
        return total;
    }
}
