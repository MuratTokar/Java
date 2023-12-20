package day_026_hakan.labArrays_2;

public class Q12 {
    /**
     * 2 array parametre olarak kabul edne bir method yaziniz
     * Ilk elemani 1 degerinde olan arraylerin sayisini bastiran program
     *
     */

    public static void main(String[] args) {
        //int[] x = {1,2,3};
        //int[] y = {1,3};

        //int[] x = {7,2,3};
        //int[] y = {1};

        int[] x = {3,2,4};
        int[] y = {4,3,4};
        checkFirstElement(x,y);
    }

    public static void checkFirstElement(int[] nums1, int[] nums2){
        int counter = 0;

        if(nums1[0] == 1)
            counter++;

        if(nums2[0] == 1)
            counter++;

        System.out.println(counter);
    }
}
