package day_014_murat;

public class Task_53 {
    public static void main(String[] args) {
        int a=1,toplam=0;
        while (a<=100) {


            if (a % 2 == 0) {
                toplam += a;
            }
            a++;
        }
            System.out.print( "Toplam = " + toplam);


    }
}
