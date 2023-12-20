package day_029_hakan.lab;

import java.util.Arrays;

public class Q30 {
    /**
     * Bir arraydeki elemanin sagindaki ve solundaki degerler,
     * ona esit degilse, o sayiya "yalniz" sayi denilir
     *
     * Eger verilen arrayde, aranan sayi "yalniz" ise,
     * o sayi solundaki ve sagindaki degerlerden büyük olanin degerini alir.
     *
     * Sonucu array olarak yazdiriniz.
     *
     * Ex :
     * int[] x = {1,3,4,5,3,3,6,3,20};  a = 3;
     * Output : [1,4,4,5,3,3,6,20,20]
     *
     */

    public static void main(String[] args) {
        int[] x = {1,3,4,5,3,3,6,3,20};
        int a = 3;
        doNotLeaveAlone(x,a);

        int[] y = {1, 2, 3, 2, 5, 2};
        a = 2;
        doNotLeaveAlone(y,a);

        int[] z = {1,2,3};
        a = 2;
        doNotLeaveAlone(z,a);
    }

    public static void doNotLeaveAlone(int[] nums, int alone){

        // i=1 den baslangic, cünkü solu ve sagina bakilacak
        // i < nums.length - 1
        // alone sayisini ara
        // compare i-1 || i+1 == i degerindeki alone sayisi ile kiyasla
            // esit bir deger var ise yalniz degildir, islem yapma
            // else yalnizsa
                //  i-1 <? i+1 büyük olanin degerini, i indexine ata

        for(int i=1; i < nums.length - 1; i++){
            if(nums[i] == alone){
                if(!(nums[i-1] == alone || nums[i+1] == alone)){
                    // yalnizdir
                    nums[i] = Math.max(nums[i+1], nums[i-1]);
                    // nums[i] = nums[i-1] < nums[i+1] ? nums[i+1] : nums[i-1];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
