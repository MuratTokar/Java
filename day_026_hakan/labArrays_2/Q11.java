package day_026_hakan.labArrays_2;

import java.util.Arrays;

public class Q11 {
    /**
     *  Bir array in icerisinde 2 sayisi varsa ve hemen arkasindan 3 sayisi geliyorsa
     *  3 sayisinin yerine 0 degerini yazan ve sonucu array olarak bastiran program
     */

    public static void main(String[] args) {
        //int[] nums = {1,2,3}; // [1,2,0]
        //int[] nums = {2,3,5}; // [2,0,5]
        //int[] nums = {1,2,1}; // [1,2,1]
        int[] nums = {11,2,13,3,2,3}; // [11,2,13,3,2,0]
        System.out.println(Arrays.toString(nums)); // orjinal array
        setThreeToZeroWhenTwoFollowedByThree(nums);
        System.out.println(Arrays.toString(nums)); // array in son hali
    }

    public static void setThreeToZeroWhenTwoFollowedByThree(int[] numbers){
        // 2 yi ara
            // bulduysan, hemen arkasinda 3 ara
                    // bulduysan degerini, 0 yap

        for(int i = 0; i < numbers.length-1 ; i ++){
            if(numbers[i]==2 && numbers[i+1]==3){
                    numbers[i+1] = 0;
            }
        }


        /*

        // Icrisinde birden fazla key, yani aranan deger varsa,
        // binarySearch methodu, aranan key yokmus gibi sonuc döner

        int indexOf2 = Arrays.binarySearch(numbers,2);
        //System.out.println(indexOf2);
        if(0 <= indexOf2){
            if(numbers[indexOf2+1] == 3){
                numbers[indexOf2+1] = 0;
            }
        }

         */

    }
}
