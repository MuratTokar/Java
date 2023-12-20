package extraCalismalarim3;

import java.util.Scanner;

public class Switch_soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir rakam girin");
        int rakam = scan.nextInt();
        switch (rakam){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("Üc");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Lütfen sayi girmeyin");

        }
    }
}
