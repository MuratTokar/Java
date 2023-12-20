package extraCalismalarim2;

import java.util.Scanner;

public class IfSoru3 {
    public static void main(String[] args) {
        //kullanicidan yasini isteyin  ve 65 yas uzeri ise "Emekli olabilirsiniz" yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yili söyleyin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas==65){
            System.out.println("Emekli olabilirsin");
        } else if (yas>65) {
            System.out.println("Siz zaten " + (yas-65) + " yil önce emekli olmussunuz");
        }else
        {
            System.out.println("Emekli olabilmeniz icin " +( 65-yas )  + " yil daha calismalisiniz");
        }
    }
}
