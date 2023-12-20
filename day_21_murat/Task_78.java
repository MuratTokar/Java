package day_21_murat;

import java.util.Locale;
import java.util.Scanner;

public class Task_78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime girin");
        String word = input.nextLine().toLowerCase();
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                System.out.println(word.charAt(i));
                counter++;
            }

        }
        System.out.println("Toplam sesli harf " + counter + " tür");
    }
}
