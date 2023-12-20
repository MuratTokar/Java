package extraCalismalarim7_12.video;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
       /* Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak aralarindaki
        tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucukse,
          uyari yazdirip islemi sonlandirin*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir baslangic dgeri girin");
        int baslangic = scan.nextInt();
        System.out.println("Lütfen pozitif bir bitis  dgeri girin");
        int bitis = scan.nextInt();

       int sayilarintoplami = 0;

        if (baslangic>bitis){
            System.out.println("Baslngic bitisten buyuktur");

        }else {
            for (int i = baslangic; i <=bitis ; i++) {
               sayilarintoplami+=i;

            }
        }
       System.out.println(sayilarintoplami);


    }
}