package day_26_murat;

public class Q_20 {
    public static void main(String[] args) {
        // parametre olarak int array kabul eden
        // ve array icerisinde art arda 2 sayisinin gelmesini kontrol eden program

        //int[] x={1,2,1,2};
      int[] x={2,2,1,2};
       boolean result= checkTwoNextToWo(x);
        System.out.println(result);

    }
    public static boolean checkTwoNextToWo(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==2&& nums[i+1]==2){
                return true;
            }

        }
        return false;

    }
}
