package day_28_murat;

import java.util.Scanner;

public class Task {
    /** Alisveris Listesi / ToDo List
     *
     * Ekrana Menu basma
     * 0 - Menuyu göster
     * 1 - Alisveris listesini göster
     * 2 - Yeni bir ürün ekle
     * 3 - Ürünü degistir
     * 4 - Ürünü cikar
     * 5 - ürünü ara
     * 6 - Programdan cik
     *
     * 0'a bastiginda, ana sayfa mantiginda bütün listeyi karsimiza cikarsin
     * 1'e bastiginda Alisveris listesine kaydedilmis ürünleri listelesin
     * 2'e bastiginda, ürün istesin ve listeye eklesin
     * 3'e bastiginda degistirmek istedigi ürünü sorsun, yeni ürün ismini sorsun
     * 4'e bastiginda, cikarilacak ürünün ismini sorsun, ürünü listeden cikarip
     * 5'e girilen ürünün listede oldugu/ya da olmadigi bilgisini göstersin
     * 6'a bastiginda programdan ciksin QUIT
     *
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        printMenü();

            System.out.println("Lütfen bir secenek girin(0-6");
            int choice = input.nextInt();
            checkChoice(choice);
        }

    public static void checkChoice(int choice){
        switch (choice){
            case 0:
                // menüyü yazdir
                break;
            case 1:
                // alis veris listesini yazdir
                break;
            case 2:
                //ürünü listeye ekle
                break;
            case 3:
                //ürünü degistir
                break;
            case 4:
                //ürünü listeden cikar
                break;
            case 5:
                // ürün ara
                break;
            case 6:
                // QUIT
                break;
            default:
                // Gecersiz degerler icin bir uyari yaz
                break;


        }

    }
    public static void printMenü(){
        System.out.println("Alis veris listesi menusu ");
        System.out.println("0-Ana Menü");
        System.out.println("1-Alis veris Listesi");
        System.out.println("2-ürün ekle");
        System.out.println("3-ürün degistir");
        System.out.println("4-ürünü sil");
        System.out.println("5-ürünü ara");
        System.out.println("6-QUIT");

    }

}
