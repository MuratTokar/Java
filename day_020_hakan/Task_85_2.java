package day_020_hakan;

import java.util.Random;
import java.util.Scanner;

public class Task_85_2 {
    /*

    // bilgisayar 1-6 degeri
    // kullanici icin 1-6 degeri
    // büyük olan kazansin
    // devam etmek istiyor musun? y ise basa dön, n ise asagiya devam et
    // Bilg - user skorlarini bastir

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rn = new Random();
        int computerDice, userDice;
        int counterComputer = 0, counterUser = 0, counterBrotherhood = 0;
        String answer = "y";

        // according to users' answer, continue to loop
        while (true) {
            if (answer.equals("y")) {
                computerDice = rn.nextInt(1, 7);
                userDice = rn.nextInt(1, 7);
                System.out.println("Computer : " + computerDice + " User : " + userDice);

                if (computerDice < userDice) {
                    System.out.println("User Kazandi!");
                    counterUser++;
                } else if (userDice < computerDice) {
                    System.out.println("Computer Kazandi!");
                    counterComputer++;
                } else {
                    System.out.println("Kardeslik Kazandi!");
                    counterBrotherhood++;
                }

            } else {
                break;
            }
            System.out.print("Devam mi, Tamam mi? : ");
            answer = input.nextLine().toLowerCase();
        }


        System.out.println("Oyundan ciktiniz!!!");
        System.out.println("***********************************");
        System.out.println("Computer Skoru = " + counterComputer);
        System.out.println("User Skoru = " + counterUser);
        System.out.println("Kardeslik Skoru = " + counterBrotherhood);

    }

     */
}
