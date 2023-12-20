package day_021_hakan;

import java.util.Scanner;

public class Task_75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Name : ");
        String name = input.nextLine();

        System.out.print("Last Name : ");
        String lastName = input.nextLine();

        int totalCharacterNumber = name.length() + lastName.length();
        System.out.println("Toplam karakter sayisi : " + totalCharacterNumber);

    }
}
