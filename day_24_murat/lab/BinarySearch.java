package day_24_murat.lab;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {// sralayip index i döner.key deki sayi yoksa - sayi döner
        int[] nums={3,5,7,2};
        Arrays.sort(nums);// 2,3,5,7
        System.out.println(Arrays.binarySearch(nums,6));// saiynin index ini getirir.ama yoksa da - li deger verir yani hangi index te olamsi gerekirse

    }
}
