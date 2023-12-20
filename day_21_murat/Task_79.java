package day_21_murat;

import java.util.Scanner;

public class Task_79 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime girin :");
        String word = input.next().toLowerCase();


        int counter = 0;
        for (int i = 0; i < word.length(); i++) {

            if ( word.charAt(i)=='a'  || word.charAt(i) == 'e' ||  word.charAt(i) == 'o' ||word.charAt(i) == 'i' || word.charAt(i) == 'u'){
                System.out.println(word.charAt(i));
                counter++;

            }

        }
        System.out.println("Toplam " +  counter  + " sesli harf vardir");
    }
}