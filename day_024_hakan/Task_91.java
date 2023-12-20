package day_024_hakan;

import java.util.Arrays;
import java.util.Random;

public class Task_91 {

    /**
     * 10 elemanli bir array olusturun
     * Elemanlar 0-100 araliginda random sayilardan secilecek
     * Array in elemanlarini yazdirin


    public static void main(String[] args) {

        int elements[] = new int[10];
        Random rn = new Random();
        int a;

        for (int i = 0; i < elements.length; i++) {
            a = rn.nextInt(0, 100);
            elements[i] = a;
        }

        System.out.println(Arrays.toString(elements)); // tüm array i string olarak bastirir

        System.out.println(elements.toString()); // reference adresini yazdirir

        for (int j = 0; j < elements.length; j++) {
            System.out.println((j+1) + ". number = " + elements[j]);

        }
    }
     */
}
