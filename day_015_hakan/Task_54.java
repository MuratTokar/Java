package day_015_hakan;

public class Task_54 {

    public static void main(String[] args) {
        // start = 1  sum = 1
        // start = 2  sum = 1
        // start = 3  sum = 4
        // start = 4  sum = 4
        // start = 5  sum = 9
        // start = 6  sum = 9
        // start = 7  sum = 16
        // start = 8  sum = 16
        // start = 9  sum = 25
        // start = 10  sum = 25

        int start = 1, end = 10;
        int sum = 0;

        do{
            if(start%2==0){
                continue;
            // buraya bir islem yazamayiz, cünkü buradaki isleme ulasilamayacagi icin,
                // hata verecektir
            }
            sum += start; // sum = sum + start
            System.out.println("Ara toplam : " + sum);
        } while(++start<=end);
        System.out.println("Genel Toplam : " + sum);
    }
}
