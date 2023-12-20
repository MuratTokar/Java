package day_26_murat;

import java.util.Arrays;

public class Q_15 {
    public static void main(String[] args) {
        /**
         * 1 arrayi parametre olarak kabul eden bir method yaziniz
         * 1. ve sonuncu elemanlari yerlerini degistiren ve sonuc arrayini yazdiran program
         */
        int[] x={1,2,3,4};
        swapFirstLastElements(x);

    }
    public static void swapFirstLastElements(int[] nums){
        // 1. elemani bir degiskene ata, orjinal degerini muhafaza icin
        // son elemanin degerini 1.elemanin yerine yaz
        // ilk degiskende tuttugum orjinal 1.eleman degerini son elemana ata
        int firstElement=nums[0];
        nums[0] =nums[nums.length-1];
        nums[nums.length-1]=firstElement;
        System.out.println(Arrays.toString(nums));


    }
}
