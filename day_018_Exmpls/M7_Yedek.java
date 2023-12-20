package day_018_Exmpls;

import java.util.InputMismatchException;
import java.util.Scanner;

public class M7_Yedek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir seyler giriniz..");
        try {
            int sayi=scan.nextInt();
            girdiyiYazdir(sayi);
        }catch (InputMismatchException e){
            try {
                String str=scan.nextLine();
                girdiyiYazdir(str);
            } catch (InputMismatchException e1){
                try {
                    char ch=scan.next().charAt(0);
                    girdiyiYazdir(ch);
                } catch (InputMismatchException e2){
                    try {
                        double db=scan.nextDouble();
                        girdiyiYazdir(db);
                    }catch (InputMismatchException e3){

                    }
                }
            }
        }

    }

    private static void girdiyiYazdir(int sayi) {
        System.out.println("Dirilen deger: " + sayi);
    }

    private static void girdiyiYazdir(String str) {
        System.out.println("Dirilen deger: " + str);
    }

    private static void girdiyiYazdir(char ch) {
        System.out.println("Dirilen deger: " + ch);
    }
    private static void girdiyiYazdir(double db) {
        System.out.println("Dirilen deger: " + db);
    }







}
