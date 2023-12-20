package day_014_hakan;

public class Task_53 {

    public static void main(String[] args) {

        int i=0, toplam = 0;
        while(i<=100){
            if(i%2==0){
               toplam += i;
            }
            i++;
        }
        System.out.println("Toplam = " + toplam);

    }
}
