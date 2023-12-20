package day_020_hakan;

import java.util.Random;

public class Task_84 {

    public static void main(String[] args) {
        Random rn = new Random();
        boolean toss;

        for(int i = 1; i <=10; i++) {
            toss = rn.nextBoolean();
            System.out.print(i + ". atis : ");
            if (toss) {
                System.out.println("Tura");
            } else {
                System.out.println("Yazi");
            }
        }
    }
}
