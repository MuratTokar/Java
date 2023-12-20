package day_28_murat;

public class Q_21 {
    public static void main(String[] args) {
        /**
         * Icerisindeki elemanlardan 2 ye esit olanlarin toplami 8 ise true veren program
         */
        int[] x = {2, 3, 2, 2, 4, 2}; // = > true
      //  int[] x = {2, 3, 2, 2, 4, 2, 2}; // = > false
         // int[] x = {1, 2, 3, 4}; // = > false
        checkSumOfTwosEight(x);
    }
    public static void checkSumOfTwosEight(int[] numbers){
int total=0;
        for (int num:numbers) {
            if ( num==2){
                total+=num;

            }

        }
        System.out.println(total==8);
    }
}
