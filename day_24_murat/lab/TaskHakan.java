package day_24_murat.lab;

import java.util.Arrays;

public class TaskHakan {
    public static void main(String[] args) {
        int[] nums={0,1,2,3};
        int[] numsCopy={0,1,2,3,0,0,0,0,0,0};
       int[] numsCopy2=new int[10];
       numsCopy2[0]=nums[0];
       numsCopy2[1]=nums[1];
       numsCopy2[2]=nums[2];
       numsCopy2[3]=nums[3];
        System.out.println(Arrays.toString(numsCopy2));


        int[] numsCopy3=new int[10];
        for (int i = 0; i < nums.length; i++) {
            numsCopy3[i]=nums[i];


        }
        System.out.println(Arrays.toString(numsCopy3));
        // Arrays.copyOf(kopyalanmasini istedigimiz Array, yenizunlugu)=yeniUzunlugaSahipArray

        int[] numscopy4=new int[10];
        numscopy4=Arrays.copyOf(nums,10);
        System.out.println(Arrays.toString(numscopy4));

    }


}
