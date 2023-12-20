package day_021_hakan;

import java.util.Scanner;

public class Task_78 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String text = input.nextLine().toLowerCase();

        System.out.print("Aranacak karakteri giriniz : ");
        char c = (  input.next().toLowerCase()).charAt(0);

        int counter = 0;

        for(int i= 0; i< text.length(); i++){
            if(text.charAt(i) == c){
                counter++;
            }
        }

        System.out.println("'" + text + "' icerisinde '" + counter + "' defa '" + c +  "' karakteri bulunur.");
    }
}
