package day_017_hakan;

public class Task_64 {

    public static void main(String[] args) {
        printPattern(10);
    }

    public static void printPattern(int num){
        for (int i = 1; i <= num; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
