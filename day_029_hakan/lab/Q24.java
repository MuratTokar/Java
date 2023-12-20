package day_029_hakan.lab;

public class Q24 {
    /**
     * Verilen array icerisinde,
     * bir elemanin en az 2 defa bulunup, bulunmadigini kontrol eden program
     */

    public static void main(String[] args) {
//        int[] x = {1, 2, 1, 3};
//        int a = 2;
//        Output: false

        int[] x = {1, 2, 1, 3};
        int a = 1;
//        Output: true

        checkEverywhere(x,a);
    }

    public static void checkEverywhere(int[] numbers, int num){
        // counter = elemanin array icerisindeki tekrarini
        // loop : array in bütün elemanlarini kontrol edecek
                // statement/condition : verilen sayinin,
                // elemana esit olup olmadigini verecek
                    // esitse, counter i 1 arttir.

        // sout(2 <= counter );

        int counter = 0;
        for (int elem : numbers) {
            if(elem == num){
                counter++;
            }
        }
        System.out.println(2 <= counter);

    }
}
