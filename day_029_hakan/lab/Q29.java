package day_029_hakan.lab;

import java.util.Arrays;

public class Q29 {

    /**
     * Bir arrayin icerisinde 10 un kati olan sayi varsa,
     * 10 un kati olan diger sayiyi kadar
     * kendisinden sonra gelece sayilari 10 un kati olarak yazan program
     * Ex :
     * int[] x = {2, 10, 14, 6, 70, 45, 60, 34}
     * output : [2, 10, 10, 10, 70, 70, 60, 60]
     */

    public static void main(String[] args) {
        int[] x = {2,10,3,4,20,5};
        int[] y = {2, 10, 14, 6, 70, 45, 60, 34};
        int[] z = {10,1,20,2};

        checkMultipleTen(x);
        checkMultipleTen(y);
        checkMultipleTen(z);
    }

    public static void checkMultipleTen(int[] nums){
        int newValue = -1;
        for(int i = 0; i < nums.length ; i ++){
            if(nums[i]%10 == 0){
                newValue = nums[i];
                continue; // 10 un kati olan index e kendi degerini tekrar atamasin diye
            }

            if(0 < newValue){
                nums[i] = newValue;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
