package day_28_murat;

public class Q_25 {
    public static void main(String[] args) {
        // ayni uzunliga sahip 2 arrayi  parametre olarak kabul eden bir metoto yazin
        // ayni index teki sayilari kiyaslayan ve 2 veya daha az bir fark olan ama esit olmayan
        // elemanlarinin sayisini veren program
        int[] x={1,2,3};
        int[] y={2,3,10};
        //output=2

        //int[] x={1,2,3};
        //int[] y={2,3,5};
       // output=3

       // int[] x={1,2,5,7};
        //int[] y={2,6,5,3};
        //output=1
        compareIndexValue(x,y);


    }
    public static void compareIndexValue(int[] nums1, int[] nums2){
       int counter=0;
        for (int i = 0; i < nums1.length; i++){
            int fark=Math.abs(nums1[i]-nums2[i]);// Math.abs farkin mutlak degerini veriyor
            if (0<fark && fark<=2){
                counter++;
            }

        }
        System.out.println(counter);
    }

}
