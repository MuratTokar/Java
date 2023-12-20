package day_024_hakan.lab;

public class Q8 {
    // Bir arrayin icerisinde 2 veya 3 elemani olup olmadigini kontrol eden program
    public static void main(String[] args) {
        int[] nums = {1,5,7};

        boolean containsTwoOrThree = false;
        for(int i = 0; i < nums.length ; i ++){
            if(nums[i] == 2 || nums[i] == 3){
                containsTwoOrThree = true;
                break;
            }
        }
        System.out.println(containsTwoOrThree);
    }
}
