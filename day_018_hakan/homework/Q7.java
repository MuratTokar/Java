package day_018_hakan.homework;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String girdi = input.nextLine();

        String sonucStr;
        int sonucInt;
        double sonucDouble;
        char sonucChar;

        char c = girdi.charAt(0);

        if (girdi.length() == 1 && ((c < 'z' && 'a' < c) || (c < 'A' && 'Z' < c))) {
            System.out.println(girdi + " bir character dir.");
            sonucChar = c;
            printGirdi(sonucChar);
        } else if ((c < 'z' && 'a' < c) || (c < 'A' && 'Z' < c)) {
            System.out.println(girdi + " bir String tir.");
            sonucStr = girdi;
            printGirdi(sonucStr);
        } else if (girdi.contains(".")) {
            System.out.println(girdi + " bir double dir.");
            sonucDouble = Double.parseDouble(girdi);
            printGirdi(sonucDouble);
        } else if (48 <= c && c <= 57) {
            System.out.println(girdi + " bir int dir.");
            sonucInt = Integer.parseInt(girdi);
            printGirdi(sonucInt);
        } else {
            System.out.println("Gecersiz input");
        }

            /*
        printGirdi("Java");
        printGirdi('a');
        printGirdi(5);
        printGirdi(6.12);

             */
    }

    public static void printGirdi(int num) {
        System.out.println(num);
    }

    public static void printGirdi(String str) {
        System.out.println(str);
    }

    public static void printGirdi(char ch) {
        System.out.println(ch);
    }

    public static void printGirdi(double doub) {
        System.out.println(doub);
    }


}
