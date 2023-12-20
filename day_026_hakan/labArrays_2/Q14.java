package day_026_hakan.labArrays_2;

import java.util.Arrays;

public class Q14 {
    /**
     * 2 arrayi parametre olarak kabul eden bir method yaziniz
     * bu 2 arrayi birlestirip yeni bir array olarak yazdiran program
     */
    public static void main(String[] args) {
        int[] x = {1,2};
        int[] y = {3,4}; // [1,2,3,4]

//        int[] x = {4,4,5};
//        int[] y = {2,2}; // [4,4,5,2,2]
//
//        int[] x = {9,2};
//        int[] y = {3,4};    //[9,2,3,4]

        combineTwoArrays(x,y);

    }

    public static void combineTwoArrays(int[] nums1, int[] nums2){
        // yeni bir array, 2 arrayin toplam uzunlugunda olmali
        // arr1 i yeni array a ata
        // arr2 i yeni arrayin sonuna ata
        // yeni arrayi ekrana yazdir
        int[] newNums = new int[nums1.length + nums2.length];
        // 1.yol
        for (int i=0; i < newNums.length; i++){
            if(i < nums1.length){
                newNums[i] = nums1[i];
            } else {
                newNums[i] = nums2[i-nums1.length]; // i = 2
            }
        }

        // 2.yol
        int[] newNums1 = new int[nums1.length + nums2.length];
        for (int i=0; i < nums1.length; i++){
                newNums1[i] = nums1[i];
        }

        for (int i=0; i < nums2.length; i++){
            newNums1[nums1.length + i] = nums2[i];
        }

        // 3.yol
        int[] newNums2 = Arrays.copyOf(nums1,nums1.length + nums2.length);

        for (int i=0; i < nums2.length; i++){
            newNums2[nums1.length + i] = nums2[i];
        }

        // 4.yol
        int[] newNums3 = Arrays.copyOf(nums1,nums1.length + nums2.length);
        System.arraycopy(nums2, 0, newNums3, nums1.length, nums2.length);

        System.out.println(Arrays.toString(newNums));
        System.out.println(Arrays.toString(newNums1));
        System.out.println(Arrays.toString(newNums2));
        System.out.println(Arrays.toString(newNums3));

    }

}
