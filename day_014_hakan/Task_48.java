package day_014_hakan;

public class Task_48 {

    public static void main(String[] args) {
        // i = 7
        // 1. satirda j=1
        // 2. satirda j=2
        // 3. satirda j=3
        // ...
        // 7. satirda j=7
        // j = 1, j<=i
        // sout("*")
        // System.out.print("*");

        // j döngüsünün disina
        // sout println
        // System.out.println();

        for(int i = 1; i <= 7; i++){

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
