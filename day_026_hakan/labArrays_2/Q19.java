package day_026_hakan.labArrays_2;

public class Q19 {
    /**
     * Bir arrayin icerisindeki sayilardan 6 dahil,
     * 6 dan sonra gelen 7 sayisina kadar olan sayilari dahuil etmeden elemanlari topla
     * => Bunu her 6 ve 7 icin tekrarla
     *
     */

    public static void main(String[] args) {
//        int[] x = {1,2,3,6,5,4,7,4,3,6,5,4,3,7,2}; // 6 + 7 + 2 = 15
        int[] x = {1,2,3,7,6,5,4,7,4,3,6,5,4,3,7,2}; // 6 + 7 + 2 = 22
//        int[] x = {1,2,3,6,5,4,4,3,5,4,3,2}; // 6
        sumElementsExceptBetweenSixAndSeven(x);
    }

    public static void sumElementsExceptBetweenSixAndSeven(int[] nums){
        boolean isBlocked = false;
        int total = 0;
        for(int num : nums){
            if(num == 6){
                isBlocked = true;
            } else if(isBlocked && num == 7){
                isBlocked = false;
                continue;
            }

            if(!isBlocked){
                total += num;
            }
        }
        System.out.println(total);
    }
}
