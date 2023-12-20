package day_21_murat;

import java.util.Scanner;

public class Task_75 {
    public static void main(StringClass[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Isim: ");
        String name=scan.nextLine();

        System.out.println("Last name: ");
        String lastNmae=scan.nextLine();

        int totalname=name.length()+lastNmae.length();
        System.out.println("Toplam karakter sayiyisi: " + totalname);

    }
}
