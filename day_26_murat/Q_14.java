package day_26_murat;

import java.util.Arrays;

public class Q_14 {
    public static void main(String[] args) {
        // iki aarayi parametre kabul eden bir metot yazin
        // bu  2 arrayi birlestirp yeni bir array olarak yazdiran pogram

       // int[] x={1,2};
        //int[] y={3,4};

        //int[] x={4,4};
        //int[] y={2,2};

        int[] x={9,2};
        int[] y={3,4};

        combineTwoArrays(x,y);


    }
    public static void combineTwoArrays(int[] nums1,int[] nums2){
        // yeni bir array, 2 arrayin toplam uzunlugunda olmali
        // arr1 i yeni array a ata
        // arr2 i yeni arrayin sonuna ata
        // yeni arrayi ekrana yazdir
        int[] newnums=new int[nums1.length+nums2.length];
        for (int i = 0; i < newnums.length; i++) {
            if (i<nums1.length){
                newnums[i]=nums1[i];

            }else {
                newnums[i]=nums2[i-nums1.length];
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
/*
        // 3.yol
        int[] newNums2 = Arrays.copyOf(nums1,nums1.length + nums2.length);

        for (int i=0; i < nums2.length; i++){
            newNums2[nums1.length + i] = nums2[i];
        }

*/
    }
}
