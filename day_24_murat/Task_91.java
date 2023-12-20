package day_24_murat;

import java.util.Random;

public class Task_91 {
    public static void main(String[] args) {

        /**
         * 10 elemanli bir array olusturun
         * Elemanlar 0-100 araliginda random sayilardan secilecek
         * Array in elemanlarini yazdirin
         */

int [] elements=new int[10];
        Random rn=new Random();
        int a;

        for (int i = 0; i < elements.length; i++) { // deger atama dongusu
a= rn.nextInt(0,100);
elements[i]=a;
        }
        for (int j = 0; j < elements.length; j++) {
            System.out.println((j+1) + "number= " + elements[j]);

        }
    }
}
