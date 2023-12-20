package day_026_hakan.labArrays_2;

public class Q18 {
    /**
     * Bir arrayin icerisinde 13 sayisi ve
     * bu sayidan sonra gelen sayilar haric elemanlarin toplamini veren program
     */

    public static void main(String[] args) {
//        int[] x = {1,2,2,1}; // 6
//        int[] x = {1,2,2,1,13}; // 6
        int[] x = {1,2,2,1,13,3,6}; // 6
        sumExcept13(x);
    }

    public static void sumExcept13(int[] nums){
            // 13 e esit olunca break at
        int total = 0;
        for(int num : nums){
            if(num == 13){
                break;
            }
            total += num;
        }

        System.out.println(total);
    }
}
