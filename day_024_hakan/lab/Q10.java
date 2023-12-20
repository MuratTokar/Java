package day_024_hakan.lab;

public class Q10 {
    /**
     * Bir arrayin icerisinde 2 defa "2" veya 2 defa "3" degeri icerip icermedigini kontrol eden bir program
     */

    public static void main(String[] args) {
        int[] nums = {2,3,5,2,2,3}; // true
        checkElementsTwice(nums);
    }

    public static void checkElementsTwice(int[] nums){
        int counterTwo = 0;
        int counterThree = 0;
        for (int i=0; i < nums.length ; i ++ ){
            if(nums[i] == 2){
                counterTwo++;
            } else if(nums[i] == 3){
                counterThree++;
            }
        }
        System.out.println(counterTwo == 2 || counterThree == 2);
    }
}
