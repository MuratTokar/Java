package day_024_hakan.lab;

import java.util.Arrays;

public class Q3 {
    /**
     * 2 arrayi parametre olarak kabul eden bir method yaziniz
     *      // length 1 den büyükse
     *          // ilkElementArr1 == ilkElementArr2 veya sonElementArr1 == sonElementArr2 => true
     *      // uzunluk 1 den büyük degilse, o array icin print array1 veya array2 not valid
     */

    public static void main(String[] args) {
        // TC 1 true
        //int[] arr1 = {1,2,3};
        //int[] arr2 = {1,2,5};

        // TC 2 arr1 not valid
        //int[] arr1 = {1};
        //int[] arr2 = {1,2,5};

        // TC 3 arr2 not valid
        //int[] arr1 = {1,2,3};
        //int[] arr2 = {1};

        // TC 4 true
        //int[] arr1 = {1,2,5};
        //int[] arr2 = {4,2,5};

        // TC 5 false
        int[] arr1 = {7,2,5};
        int[] arr2 = {1,2,3};

        // TC 6 true
        //int[] arr1 = {1,2,5};
        //int[] arr2 = {1,2,5};

        // TC 7 arr1 ve arr2 not valid
        //int[] arr1 = {1};
        //int[] arr2 = {5};


        checkArraysFirstLastElements(arr1, arr2);
    }

    public static void checkArraysFirstLastElements(int[] arr1, int[] arr2) {
        String message="";
        if(1 < arr1.length && 1 < arr2.length){
            System.out.println(arr1[0] == arr2[0] || arr1[arr1.length - 1 ] == arr2[arr2.length - 1]);
        } else if(arr1.length <= 1){
            message = "Not valid arrays : arr1";
            if(arr2.length <= 1){
                message += ", arr2";
            }
        } else {
            message = "Not valid arrays : arr2";
        }
        System.out.println(message);
    }
}
