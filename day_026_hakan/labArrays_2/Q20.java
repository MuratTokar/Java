package day_026_hakan.labArrays_2;

public class Q20 {

    /**
     * Parametre olarak int array kabul eden,
     * ve array icerisinde ard arda 2 sayisinin gelmesini kontrol eden program
     *
     */

    public static void main(String[] args) {
//        int[] x = {1, 2, 1,2}; // = > false
        int[] x = {2,2,1,2}; // = > true
        boolean result = checkTwoNextToTwo(x);
        System.out.println(result);
    }

    public static boolean checkTwoNextToTwo(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 2 && nums[i+1] == 2){
                return true;
            }
        }
        return false;
    }
}
