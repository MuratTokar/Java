package day_020_hakan;

import java.util.Random;
import java.util.Scanner;

public class Task_83 {

    // rn.nextInt(51)-50; // min -50, max-1-50 = 0
    // rn.nextInt(-50,1); // min sayi dahil iken, max girilen deger dahil degil

    public static void main(String[] args) {
        Random rn = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Rolling the dice...");
        int dice_1, dice_2;

        boolean contFlag = true; // flag
        while(contFlag) {
            dice_1 = rn.nextInt(6) + 1; // min 1, max 6
            // int dice_1 = rn.nextInt(1, 7); // min 1, max 6
            dice_2 = rn.nextInt(6) + 1; // min 1, max 6
            // int dice_2 = rn.nextInt(1, 7); // min 1, max 6
            System.out.println("Their values are : " + dice_1 + " " + dice_2);

            contFlag = checkAnswer();

            /*
            boolean contFlagYesNo = true;
            while(contFlagYesNo) {
                System.out.print("Roll them again? (y=yes, n=no) : ");
                String answer = input.nextLine();
                answer = answer.toLowerCase(); // Y -> y, N -> n

                if (answer.equals("y")) {
                    contFlagYesNo = false;
                } else if (answer.equals("n")) {
                    contFlagYesNo = false;
                    contFlag = false;
                    System.out.println("Kumar kötülüklerin anasidir!");
                } else {
                    System.out.println("Lütfen gecerli bir cevap giriniz!");
                }
            }
            */



        }
    }

    public static boolean checkAnswer(){
        boolean contFlag = true;
        Scanner input = new Scanner(System.in);

        boolean contFlagYesNo = true;
        while(contFlagYesNo) {
            System.out.print("Roll them again? (y=yes, n=no) : ");
            String answer = input.nextLine();
            answer = answer.toLowerCase(); // Y -> y, N -> n

            if (answer.equals("y")) {
                contFlagYesNo = false;
            } else if (answer.equals("n")) {
                contFlagYesNo = false;
                contFlag = false;
                System.out.println("Kumar kötülüklerin babasidir!");
            } else {
                System.out.println("Lütfen gecerli bir cevap giriniz!");
            }
        }

        return contFlag;
    }
}
