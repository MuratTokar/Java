package day_025_hakan;

import java.util.Arrays;

public class Arrays_DegisiklikleriKorur {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3};
        int a = 5;
        String name = "Java";
        degerleriIkiArttir(nums, a , name);

        System.out.println(Arrays.toString(nums)); //
        System.out.println(a); //
        System.out.println(name); //


    }

    public static void degerleriIkiArttir(int[] sayilar, int a, String name){
        name += " like";
        a += 2;
        for(int i=0; i < sayilar.length; i++){
            sayilar[i] += 2;
        }

    }
}
