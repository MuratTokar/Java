package day_026_hakan.labArrays_2;

public class Q16 {
    /**
     * Icerisine parametre olarak giren arrayin,
     * icinde kac adet cift sayi oldugunu bulan program
     */

    public static void main(String[] args) {
        int[] x = {2,1,2,3,4,0}; // 4
//        int[] x = {1,3,5}; // 0

        countEvenNumbers(x);

    }
    public static void countEvenNumbers(int[] nums){
        int counter = 0;
        for(int num : nums){
            if(num%2==0){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
