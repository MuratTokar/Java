package day_021_hakan;

import java.util.Scanner;

public class Task_77 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Emoji : ");
        String emoji = input.next();
        char c1 = emoji.charAt(0);
        char c2 = emoji.charAt(1);

        // asagidaki ifadeyi tek if else ile yaziniz
        if(emoji.length() == 2){
            if((c1 == ':' && (c2 == ')' || c2 == '(' || c2 == '/' || c2 == 'p')) || c1 == ';' && (c2 == ')' || c2 == '0')){
                System.out.println(emoji + " gecerlidir");
            } else {
                System.out.println(emoji + " gecersizdir");
            }

        } else {
            System.out.println(emoji + " gecersizdir");
        }
    }
}
