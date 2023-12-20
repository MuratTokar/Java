package day_062_hakan;

public class Q25 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {1,2,3,4,5};
        nums2 = nums1;
        for(int x : nums2){
            System.out.println(x + " : " );
        }
    }
}

// nums1 in referans noktasi nums2 ye ataniyor
// nums2 nin artik, nums1 in degerlerini gostermesi gerekiyor
