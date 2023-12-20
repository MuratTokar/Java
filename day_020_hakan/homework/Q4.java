package day_020_hakan.homework;

import java.util.Random;

public class Q4 {

    public static void main(String[] args) {
        createEmail(6,"gmail");
    }

    public static void createEmail(int randomCharNumber, String emailProvider){
        //   1. yol

        String input1="Bugun harika", input2="ika bir gun.";


        String inputY=input2.substring(4);
        System.out.println(input1.concat(" ").concat(inputY));

        //  2. yol


        String result = "";

        for (int i = 0; i < input1.length(); i++) {
            if (input2.startsWith(input1.substring(i))) {
                result = input1 + input2.substring(input1.length() - i);
                break;
            }
        }

        if (result.equals("")) {
            result = input1 + " " + input2;
        }

        System.out.println(result);

    }

}
