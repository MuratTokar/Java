package day_020_Exmpls;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C3_Deneme {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kanal secmek icin 0-9 arasi sayilari kullanain...\nSesi artirmak icin + tusuna basin...\nSesi azaltmak icin - tusuna basin...\nTV kapatmak icin OFF tusuna basin");
        while (true){
            try {
                int sayi=scanner.nextInt();
                girdiyiYazdir(sayi);
            }catch (InputMismatchException e){
                try {
                    char ch=scanner.next().charAt(0);
                    girdiyiYazdir(ch);
                }catch (InputMismatchException e1){
                    try {
                        String str=scanner.nextLine();
                        girdiyiYazdir(str);
                        break;
                    }catch (InputMismatchException e2){

                    }
                }
            }
        }



    }

    private static void girdiyiYazdir(String str) {
        if (str.toUpperCase().equals("OFF")){
            System.out.println("TV kapaniyor");
        }


    }

    public static void girdiyiYazdir(char ch){
        if (ch==43){
            System.out.println("Ses aciliyor");
        } else if (ch==45){
            System.out.println("Ses kisiliyor");
        } else {
            System.out.println("Lutfen gecerli bir islem yapiniz");
        }

    }

    private static void girdiyiYazdir(int sayi) {
        if (sayi>=0 && sayi<=9){
            System.out.println("Kanal " + sayi + " Hos geldiniz");
        } else {
            System.out.println("Lutfen 0-9 arasinda bir tusa basin");
        }



    }

}
