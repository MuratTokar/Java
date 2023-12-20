package day_062_hakan;

public class Q31 {

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = new int[5];

        array2 = array1; // array2 = {1,2,3}

        for(int i : array2){
            System.out.print(i + " "); // print : 1 2 3
        }
        System.out.println(); // enter

        int[] array3 = new int[3];
        array3 = array2; // array3 = {1,2,3}

        for(int i : array3){
            System.out.print(i + " "); // print : 1 2 3
        }

    }
}
