package day_28_murat;

public class Q_27 {
    public static void main(String[] args) {
        /**
         * Verilen bir arrayde, ardi ardina ardisik birer
         * artan 3 sayinin olup olmadigini kontrol eden program
         */
        int[] x = {1,4,5,6,2}; //true
        int[] y = {1,2,3}; //true
        int[] z = {1,2,4,5,8,9}; //false

        System.out.println(checkAdjacentIncreasingNumbers(x));
        System.out.println(checkAdjacentIncreasingNumbers(y));
        System.out.println(checkAdjacentIncreasingNumbers(z));

        System.out.println(checkAdjacentIncreasingNumbersReverse(x));
        System.out.println(checkAdjacentIncreasingNumbersReverse(y));
        System.out.println(checkAdjacentIncreasingNumbersReverse(z));
    }

    public static boolean checkAdjacentIncreasingNumbers(int[] nums){
        // i i+1 i+2
        for(int i=0; i < nums.length - 2; i++){
            if(nums[i+1] -nums[i] == 1 && nums[i+2] -nums[i+1] == 1){
                return true;
            }
        }
        return false;
    }

    public static boolean checkAdjacentIncreasingNumbersReverse(int[] nums){
        for(int i = nums.length - 1; 1 < i; i--){
            if(nums[i] - nums[i-1] == 1 && nums[i-1] - nums[i-2] == 1){
                return true;
            }
        }
        return false;
    }
}
