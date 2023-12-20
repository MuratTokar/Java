package day_020_hakan.homework;

import java.util.Scanner;

public class Q3 {

    /**
     * 3. TV Kumandasi yapiniz.
     * - Kullanici tarafindan girilen bir rakam ise 0-9, „Kanal $girilenSayi ya hosgeldiniz”
     * - Kullanici tarafindan girilen “+” veya “-“ karakterleri ise, “Ses aciliyor” veya “Ses kisiliyor”
     * - Kullanici tarafindan girilen “OFF” ise “TV kapaniyor…” yazdiriniz.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String basilanTusTest = "off";
        evaluatePress(basilanTusTest);

        while(true) {
            System.out.print("Bir tusa basiniz : ");
            String basilanTus = input.next();
            // Character.isDigit(c);
            // boolean isDigit = 48<=c && c <=57;
            if(basilanTus.toLowerCase().equals("q")){
                System.out.println("Kumanda kapaniyor");
                break;
            }
            evaluatePress(basilanTus.toLowerCase());
        }
    }

    public static void evaluatePress(String basilanTus){
        char c = basilanTus.charAt(0);
        if((48<=c && c <=57) && basilanTus.length()==1){
            System.out.println("Kanal " + basilanTus + " ya hosgeldiniz!");
        } else if(basilanTus.equals("+")){
            System.out.println("Ses aciliyor");
        } else if(basilanTus.equals("-")){
            System.out.println("Ses kisiliyor");
        } else if(basilanTus.equals("off")){
            System.out.println("TV Kapaniyor");
        } else {
            System.out.println("Lütfen gecerli bir tusa basiniz!");
        }
    }
}
