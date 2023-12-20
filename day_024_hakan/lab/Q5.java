package day_024_hakan.lab;

import java.util.Arrays;

public class Q5 {
    /**
     * Parametre olarak array kabul eden bir method yaziniz
     * Bu method girilen arrayin elemanlarini  sola bir kaydirarak tekrar yazdirsin
     * [a,b,c] => [b,c,a]
     *
     */

    public static void main(String[] args) {
        int[] nums = {1,5,7,8,4,-1,0};
        String[] words = {"a","b","c","d"};
        shiftOneLeftArray(words);
        shiftOneLeftArray(nums);
    }

    public static void shiftOneLeftArray(int[] nums){

        System.out.println("Orjinal array = " + Arrays.toString(nums));

        // 0. elemanin degerini tut
        // 1. elemani -> 0. elemana ata
        // 2. elemani -> 1. elemana ata
        // ...
        // 0. elemani -> son elemana ata

        int firstElement = nums[0];
        for(int i = 0; i < nums.length - 1 ; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = firstElement;


        System.out.println("Son array = " + Arrays.toString(nums));

        // Soruldugu icin yazildi
        // System.out.println("Son array = " + nums); // referans adresini yazdirir

    }

    public static void shiftOneLeftArray(String[] words){
        System.out.println("Orjinal array = " + Arrays.toString(words));

        // 0. elemanin degerini tut
        // 1. elemani -> 0. elemana ata
        // 2. elemani -> 1. elemana ata
        // ...
        // 0. elemani -> son elemana ata

        String firstElement = words[0];
        for(int i = 0; i < words.length - 1 ; i++){
            words[i] = words[i+1];
        }
        words[words.length-1] = firstElement;

        System.out.println("Son array = " + Arrays.toString(words));
    }
}
