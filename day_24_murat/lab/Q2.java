package day_24_murat.lab;

public class Q2 {
    public static void main(String[] args) {
        /**
         * Arrayin uzunlugu 1 den büyükse, ilk ve son elemanlar esit mi diye kontrol et, return true
         * Arrayin uzunlugu 1'den büyük degilse, print "not valid array"
         */
        // array.length>1
           // ilkElement==sonElement
            // return True
        // array.length<1
       // else
           // not a valid an array


        // int[] nums = {1,3,5}; // false
       //int[] nums = {1,3,1}; // true
        int[] nums = {8}; // not valid array
        if (nums.length>1){
            System.out.println(nums[0]==nums[nums.length-1]);
        }else {
            System.out.println(" not a valid an array");
        }

    }
}
