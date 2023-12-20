package day_045_hakan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlock_2 {

    public static void main(String[] args) {
        //String number = "1a";
        String number = "1";
        try{
            int a = Integer.parseInt(number);
            System.out.println(a);

            //String text = null;
            String text = "java";
            System.out.println(text.length());

            int[] arr = new int[5];
            arr[5] = 3;
        } catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }



        Scanner input = new Scanner(System.in);
        int a = 0;
        while(0<= a){
            try {
                System.out.println("Lutfen bir integer griniz");
                a = input.nextInt();
            } catch(Exception e){
                input.next();
                System.out.println("not integer");
            } finally {
                System.out.println("KOD Bitti");
            }
        }

        int k=0;
        try {
            System.out.println("Lutfen bir integer griniz");
            k = input.nextInt();
        } catch(Exception e){
            input.next();
            System.out.println("not integer");
        } finally {
            if(k == 0 ){
                k=5;
            }
            System.out.println("KOD Bitti");
        }

        System.out.println("k value : " + k);
    }
}
