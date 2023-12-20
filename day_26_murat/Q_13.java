package day_26_murat;

import java.util.Arrays;

public class Q_13 {
    public static void main(String[] args) {
        // 2 array i kabul eden bir metot yazin
        // array larin elemanlarinin toplamlarini kiyaslayan ve toplami daha buyuk olan array i ekrana basin
        // esitse esittir yazdirsin
        int[] x={1,2,};//2
        int[] y={3,4};

        //int[] x={5,6};
        // int[] y={3,8}

        //int[] x = {1, 1};
       // int[] y = {1, 0};
        checkSumsArray(x, y);// x ve y yi metoda gönderiyorum// 3

    }

    public static void checkSumsArray(int[] nums1, int[] nums2) {// 1

        // arraylerin elemanlarini topla
        // toplamlari kiyasla
        // büyük olani yazdir
        // esitse, esittir yazdir
        int total_1 =sumElementsOfArray(nums1);
        int total_2=sumElementsOfArray(nums2);

        if (total_1<total_2){
            System.out.println(Arrays.toString(nums2));
        }else if (total_1>total_2){
            System.out.println(Arrays.toString(nums1));


        }else{
            System.out.println("Esittir");
        }


    }

    public static int sumElementsOfArray(int[] nums) {
        int total = 0;
        for (int num : nums) { // topladik
            total += num;

        }
        return total;
    }
}