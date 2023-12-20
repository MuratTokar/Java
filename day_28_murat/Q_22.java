package day_28_murat;

public class Q_22 {
    public static void main(String[] args) {
        /**
         * Array icerisindeki elemanlardan 1 degerlerinin sayisinin
         * 4 degerlerinin sayisindan büyük olup olmadigini kontrol eden program
         */
       // int[] x = {1, 4, 1}; // = > true
    int[] x = {1,4,1,4}; // = > false
        //int[] x = {1,1}; //  = > true
        checkNumbersOfOneAndFour(x);
    }
    public static void checkNumbersOfOneAndFour(int[] numbers){
        int counterOne=0;
        int counterFour=0;
        for (int num:numbers) {
            if (num==1){
                counterOne++;

            } else if(num==4){
                counterFour++;

            }

        }
        System.out.println(counterFour < counterOne);

    }
}
