package day_065_hakan;

public class Q77 {
    public static void main(String[] args) {
        int[] intArr = {8,16,32,64,128};

        for(int i : intArr){
            System.out.println(i);
        }

        for(int i=0; i< intArr.length; i++){
            System.out.println(intArr[i]);
        }
        /*
        // A
        for(int i : intArr){
            System.out.print(intArr[i] + " ");
        }

         */
        /*
        // B
        for(int i : intArr){
            System.out.print(i + " ");
        }

         */
        /*
        // C
        for(int i =0 : intArr){
            System.out.print(intArr[i] + " ");
            i++;
        }

         */
        /*
        // D
        for(int i =0 ; i< intArr.length ; i++){
            System.out.print(i + " ");
        }

         */

        /*
        // E
        for(int i =0 ; i< intArr.length ; i++){
            System.out.print(intArr[i] + " ");
        }

         */

        /*
         // F
        for(int i ; i< intArr.length ; i++){
            System.out.print(intArr[i] + " ");
        }

         */

    }
}
