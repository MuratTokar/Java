package day_020_hakan;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        // class i import etmek icin kisayol, alt + ENTER
        Random rn = new Random();
        int randomNumber = rn.nextInt();
        System.out.println(randomNumber);

        System.out.println("*****************************");

        randomNumber = rn.nextInt(100);
        System.out.println(randomNumber);

        System.out.println("*****************************");

        boolean randomBooelan = rn.nextBoolean();
        System.out.println(randomBooelan);

        // 20 ile 45 arasi random int üreten bir program yazalim

        rn.nextInt(26); // min = 0 , max = 25
        randomNumber = rn.nextInt(26) + 20; // min = 20 , max = 45

        System.out.println("*****************************");

        String phoneNumber = "";
        for(int i=1; i < 10; i++) {
            phoneNumber = phoneNumber + rn.nextInt(10);
        }

        System.out.println(phoneNumber);

    }
}
