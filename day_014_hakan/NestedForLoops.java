package day_014_hakan;

public class NestedForLoops {

    public static void main(String[] args) {
        /**

        1   2   3   4
    1   1   2   3   4
    2   2   4   6   8
    3   3   6   9   12
    4   4   8   12  16
         */



        // x, y , z
        // i , j , k

        for (int i = 1; i <= 5; i++ ){

            System.out.print(i);

            for (int j = 1; j <= i; j++){
                System.out.print(" Süt");
            }

            System.out.println();
            // i        j'ye göre süt ciktisi
            // 1        Süt
            // 2        Süt Süt
            // 3        Süt Süt Süt

        }

        for (int i = 1; i <= 5; i++ ){

            System.out.print(i + " ");

            for (int j = 1; j <= 5; j++){
                System.out.print(j + " ");
            }

            System.out.println();
            // i        j'ye göre süt ciktisi
            // 1        Süt
            // 2        Süt Süt
            // 3        Süt Süt Süt

        }

        for (int i = 1; i <= 10; i++ ){ // satir

            System.out.print(i + " ");

            for (int j = 1; j <= i; j++){ // sütun
                System.out.print(" Java");
            }

            System.out.println();
            // i        j'ye göre süt ciktisi
            // 1        Süt
            // 2        Süt Süt
            // 3        Süt Süt Süt

        }

        /**
            10 * 10
             1   2   3   4
         1   1   2   3   4
         2   2   4   6   8
         3   3   6   9   12
         4   4   8   12  16
         */

        for (int i = 1; i <= 10; i++ ){ // satir

            for (int j = 1; j <= 10; j++){ // sütun
                System.out.print(i*j + "\t");
            }

            System.out.println();

        }

        // 1    2   3   4   5   6   7   8   9   10
        // 2    4   6   8   10  12  14  16  18  20
        // 3

        for (int i = 1; i <= 5; i++ ){ // satir
            System.out.println("i = " + i);
            for (int j = 1; j <= 3; j++){ // sütun
                System.out.println("j = " + j);
            }

            System.out.println();

        }





    }



}
