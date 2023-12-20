package day_024_hakan.lab;

import java.util.Arrays;

public class Q6 {
    /**
     * Bir arrayi parametre olarak kabul eden bir method yaziniz
     * Bu method, array icerisindeki en büyük sayiyi bulup, diger elemanlarin degerlerine bu sayiyi atar
     * Array in son halini yazdirir
     *
     */

    public static void main(String[] args) {
        //int[] nums = {11,5,9}; // [11,11,11]
        //int[] nums = {11,5,9,100}; // [100,100,100,100]
        int[] nums = {-11,5,9}; // [9,9,9]
        setGreatestNumberToAllElements(nums);
    }

    public static void setGreatestNumberToAllElements(int[] nums){
        int greatestNumber = nums[0];
        // greatestNumber a büyük olan sayiyi ata
        // en büyük sayiyi bul
        for (int i = 1; i < nums.length; i++){
            if(greatestNumber < nums[i]){
                greatestNumber = nums[i];
            }
        }

        // diger elemanlara bu degeri ata
        for(int i=0; i < nums.length ; i ++){
            nums[i] = greatestNumber;
        }

        // yeni arrayin ciktisini al
        System.out.println("New Array = " + Arrays.toString(nums));
    }
}
