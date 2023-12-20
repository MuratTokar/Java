package day_018_Exmpls;

import java.util.Scanner;

public class M7 {
    /*
    Kullanicidan alinan farkli data tiplerindeki degerleri yazdiran methodlari yaziniz.
girdiyiYazdir(“Java”) -> “Girilen deger ‘Java’”
girdiyiYazdir(6) -> “Girilen deger ‘6’”
girdiyiYazdir(‘A’) -> “Girilen deger ‘A’”
girdiyiYazdir(6.12) -> “Girilen deger ‘6.12’”

     */
    public static void main(String[] args) {

      girdiyiYazdir(" ");
      girdiyiYazdir(9);
      girdiyiYazdir('#');
      girdiyiYazdir(4.55);

    }


    public static void girdiyiYazdir(String java) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen string bir ifade giriniz");
        String str=scanner.nextLine();
        System.out.println("girdiginiz deger " + str);

    }

    public static void girdiyiYazdir(int sayi) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen string bir sayi giriniz");
        int num=scanner.nextInt();
        System.out.println("girdiginiz deger " + num);

    }

    public static void girdiyiYazdir(char kr) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char kkk=scanner.next().charAt(0);

        System.out.println("girdiginiz deger " + kkk);

    }

    public static void girdiyiYazdir(double db) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir double sayi giriniz");
        double ddddd=scanner.nextDouble();
        System.out.println("girdiginiz deger " + ddddd);

    }

    /*   Basit dusunecek olursak

    public static void main(String[] args) {
        girdiyiYazdir("Java");
        girdiyiYazdir(6);
        girdiyiYazdir('A');
        girdiyiYazdir(6.12);
    }

    private static void girdiyiYazdir(String java) {
        System.out.println("Girilen deger; " + java);
    }
    private static void girdiyiYazdir(int sayi) {
        System.out.println("Girilen deger; " + sayi);
    }
    private static void girdiyiYazdir(char krktr) {
        System.out.println("Girilen deger; " + krktr);
    }
    private static void girdiyiYazdir(double db) {
        System.out.println("Girilen deger; " + db);
    }
     */


}