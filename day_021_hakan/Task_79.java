package day_021_hakan;

import java.util.Scanner;

public class Task_79 {

    public static void main(String[] args) {

        // Scanner user dan bir kelime alalim, next, nextLine, toLowerCase
        // int counter = 0;
        // for dongusu, start = 0, length()
                // if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o' ....
                        // sout(word.charAt(i))
                        // counter++;

        // $word kelimesinde sesli harflerin sayisi $counter
        // $word kelimesinde sesli harfler : a,e,o

        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String word = input.next().toLowerCase();

        int counter = 0;
        String harfler = "";

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o' || word.charAt(i) == 'i' || word.charAt(i) == 'u') {
                if(!harfler.contains(word.charAt(i)+"")){
                    harfler = harfler.concat(word.charAt(i) + " ");
                }
                counter++;
            }
        }

        System.out.println(word + " kelimesinde sesli harflerin sayisi " + counter);
        System.out.println(word + " kelimesinde sesli harfler " + harfler);

        System.out.println(!true);
    }
}
