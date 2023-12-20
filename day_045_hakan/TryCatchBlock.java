package day_045_hakan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=-1;
        int divider=1;
        while(0<= number){
            try{
                System.out.println("Lutfen bolunecek sayiyi giriniz");
                number = input.nextInt();
                System.out.println("Lutfen bolecek sayiyi giriniz");
                divider = input.nextInt();
                System.out.println("Sonuc : " + (number/divider));
            } catch(InputMismatchException e){
                input.next();
                System.out.println("INFO : Invalid input, not integer");
            } catch(ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println("INFO : Invalid input, divider can not be '0'");
            }
        }

        while(-1<= number){
            try{
                System.out.println("Lutfen bolunecek sayiyi giriniz");
                number = input.nextInt();
                System.out.println("Lutfen bolecek sayiyi giriniz");
                divider = input.nextInt();
                System.out.println("Sonuc : " + (number/divider));
            } catch(InputMismatchException | ArithmeticException e){
                input.next();
                System.out.println("INFO : Invalid input");
                e.printStackTrace();
            }
        }
    }

}
