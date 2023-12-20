package day_028_hakan;

import java.util.ArrayList;
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

   static boolean continueToProgram = true;
   static ArrayList<String> groceryList = new ArrayList<>();
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        printMenu();

        while(continueToProgram) {
            System.out.print("Lütfen bir secenek giriniz(0-6) : ");
            int choice = input.nextInt();
            checkChoice(choice);
        }
    }

    public static void checkChoice(int choice){
        switch(choice){
            case 0:
                // print menu, menuyu yazdir
                printMenu();
                break;
            case 1:
                // print grocery list, alisveris listesini yazdir
                printGroceryList();
                break;
            case 2:
                // add product to list, ürünü listeye ekle
                addProductToList();
                break;
            case 3:
                // modify the product, ürünü degistir
                modifyProduct();
                break;
            case 4:
                // remove the item/product, ürünü listeden cikar
                removeProduct();
                break;
            case 5:
                // search the product in the list, ürünü listede ara
                searchProduct();
                break;
            case 6:
                // quit, cikis
                System.out.println("Programdan cikiliyor....");
                continueToProgram = false;
                break;
            default:
                // Gecersiz degerler icin bir uyari yaz, warning for invalid values
                break;
        }
    }

    public static void printMenu(){

        System.out.println("\n\tAlisveris Listesi Menusu");
        System.out.println("0 - Ana menu");
        System.out.println("1 - Alisveris Listesi");
        System.out.println("2 - Ürün ekle");
        System.out.println("3 - Ürün degistir");
        System.out.println("4 - Ürünü sil");
        System.out.println("5 - Ürün ara");
        System.out.println("6 - QUIT\n");

    }

    public static void printGroceryList(){
        if(0 < groceryList.size()) {
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". ürün : " + groceryList.get(i));
            }
        } else {
            System.out.println("Listeniz bos!");
        }
    }

    public static void addProductToList(){
        boolean contToAddProduct = true;
        while(contToAddProduct){
            System.out.print("Eklemek istediginiz ürünün ismini giriniz : ");
            input.nextLine();
            String product = input.nextLine().toLowerCase();
            groceryList.add(product);
            System.out.print("Tamam mi T, devam mi D : ");
            String decision = input.next().toLowerCase();
            if(decision.equals("t")){
                contToAddProduct = false;
            } else if(decision.equals("d")){
            } else {
                System.out.println("Lütfen gecerli bir harf giriniz!");
            }
        }

    }

    public static void modifyProduct(){
        System.out.print("Degistirmek istediginiz ürünün ismini giriniz : ");
        input.nextLine();
        String product = input.nextLine().toLowerCase();
        System.out.print("Yeni ürün ismini giriniz : ");
        String newProduct = input.nextLine().toLowerCase();
        int productIndex = groceryList.indexOf(product);
        groceryList.set(productIndex, newProduct);
        System.out.println(product + " ürünü " + newProduct + " olarak degistirildi.");
    }

    public static void removeProduct(){
        System.out.print("Cikarmak istediginiz ürünün ismini giriniz : ");
        input.nextLine();
        String product = input.nextLine().toLowerCase();
        int productIndex = groceryList.indexOf(product);
        groceryList.remove(productIndex);
        System.out.println(product + " ürünü cikarildi...");

    }

    public static void searchProduct(){
        System.out.print("Aramak istediginiz ürünün ismini giriniz : ");
        input.nextLine();
        String product = input.nextLine().toLowerCase();
        int productIndex = groceryList.indexOf(product);
        if(productIndex < 0){
            System.out.println("Aranan ürün listede bulunamadi : " + product);
        } else {
            System.out.println("Aranan ürün " + (productIndex + 1) + ". sirada bulundu : " + product);
        }
    }

}
