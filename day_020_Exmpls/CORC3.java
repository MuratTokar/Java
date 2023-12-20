package day_020_Exmpls;

import java.util.Scanner;

public class CORC3 {
    /*

TV Kumandasi yapiniz.
- Kullanici tarafindan girilen bir rakam ise 0-9, „Kanal $girilenSayi ya hosgeldiniz”
- Kullanici tarafindan girilen “+” veya “-“ karakterleri ise, “Ses aciliyor” veya “Ses
kisiliyor”
- Kullanici tarafindan girilen “OFF” ise “TV kapaniyor...”
yazdiriniz.

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tuslar="";

        while (true) {
            System.out.print("Kumanda sende\n");
            tuslar = scanner.nextLine();

            if (tuslar.toUpperCase().equalsIgnoreCase("OFF")) {    //  harf girislerinde olasi farkliliklari gidermek icin equalsIgnoreCase() kullanilabilir
                System.out.println("TV kapaniyor...");
                break;
            } else if (tuslar.equals("+")) {
                System.out.println("Ses aciliyor...");
            } else if (tuslar.equals("-")) {
                System.out.println("Ses kisiliyor...");
            } else if (tuslar.length() == 1 && Character.isDigit(tuslar.charAt(0))) {    //  sayisal degeri taniyacak
                System.out.println("Kanal " + tuslar + "'ye hoş geldiniz!");
            }else {
                System.out.println("Geçersiz giriş!");
            }
        }



    }
}
