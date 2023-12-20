package day_024_hakan.lab;

public class Q2 {
    /**
     * Arrayin uzunlugu 1 den büyükse, ilk ve son elemanlar esit mi diye kontrol et, return true
     * Arrayin uzunlugu 1'den büyük degilse, print "not valid array"
     */

    public static void main(String[] args) {
        // ALGORITHMA
        // 1 < array.length
            // ilkElement == sonElement
        // else
            // not valid array


          // int[] nums = {1,3,5}; // false
        // int[] nums = {1,3,1}; // true
        int[] nums = {8}; // not valid array
        // int[] nums = {6,3,6}; // true
        // int[] nums = {2,3,16}; // false


        if(1 < nums.length){
            System.out.println(nums[0]== nums[nums.length-1]);
        } else {
            System.out.println("not valid array");
        }


        // Ternary operator ile zorlanmis cözüm :)
        boolean sonuc = 1 < nums.length ? nums[0]== nums[nums.length-1] : false;
        if(!sonuc){
            System.out.println("not valid array");
        }
    }

}
