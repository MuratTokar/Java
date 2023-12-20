package day_28_murat;

public class Q_24b {
    public static void main(String[] args) {
        /**
         * Bir arrayde, arka arkaya gelen sayilardan en az biri,
         * verilen sayiya esitse, bu sayiya "everywhere" sayisi denir.
         *
         * Verilen bir arrayde, verilen sayinin "everywhere" olup olmadigini kontrol eden program
         */

         // int[] x = {1, 2, 1, 1, 4};
         //int a = 1; //true
       int[] x = {1, 2, 1, 15, 4};
         int a = 1; //false
        adjacentCheckElement(x,a);

    }
    public static void adjacentCheckElement(int[] numbers,int num){
        boolean isEverywhere=true;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]==num||numbers[i+1]==num){

            }else {
                isEverywhere=false;
                break;
            }

        }
        System.out.println(isEverywhere);


        // 2. yol
        for(int i = 0; i < numbers.length -1; i++){
            if(numbers[i] != num && numbers[i+1] != num){
                System.out.println(false);
                break;
            }
        }
    }
}
