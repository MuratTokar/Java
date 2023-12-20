package day_025_hakan;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }

        System.out.println("\n********************************");

        // for each loop
        for(int i : nums){
            System.out.print(i + " ");
        }

        // 1. for loop, index numarasina göre hareket ederken, for each te index kullanilmaz
        // 2. For each, bastan sona tüm arrayin degerlerini okurken,
                //  for loop, istenilen aralikta degerleri okur ve o degerlere islem yapma olanagi verir
    }
}
