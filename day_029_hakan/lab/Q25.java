package day_029_hakan.lab;

public class Q25 {
    /**
     * Ayni uzunluga sahip, 2 arrayi parametre olarak kabul eden bir method yaziniz
     * Ayni indexteki sayilari kiyaslayan ve 2 veya daha az bir fark olan
     * ama esit olmayan elemanlarinin sayisini veren program
     */

    public static void main(String[] args) {
//        int[] x = {1,2,3};
//        int[] y = {2,3,10};
        // Output : 2

//        int[] x = {1,2,3};
//        int[] y = {2,3,5};
       // Output:3

        int[] x = {1,2,5, 7};
        int[] y = {2,6,5, 3};
        // Output:1
        compareIndexValue(x, y);
    }

    public static void compareIndexValue(int[] nums1, int[] nums2){
        int counter = 0;
        for(int i = 0; i < nums1.length; i++){
            // Math.abs(-5); // 5
            int fark = Math.abs(nums1[i] - nums2[i]);
            if(0 < fark && fark <= 2){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
