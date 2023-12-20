package homework14;

import java.util.Scanner;

public class Cözüm2_a {
    public static void main(String[] args) {
        //Asagida istenen programlari uygun olan loop’u kullanarak yaziniz.
        //a. Kullanici tarafindan girilen 10 sayidan, ciftleri ve tekleri kendi aralarinda olacak sekilde
        //toplayan ve toplam sonucu veren programi yaziniz.
        //Input : 5, 10, 30, 4, 6, 3, 7, 13, 15, 20
        //Output : Tek sayilarin toplami 43, cift sayilarin toplami 70.


        int tekSayilarinToplami=0;
        int ciftayilarinToplami=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 10 sayi girin");
        for (int i = 0; i <10; i++) {
            int input = scan.nextInt();
            if (input%2==0){
                ciftayilarinToplami+=input;

            }else {
                tekSayilarinToplami+=input;
            }
        }
        System.out.println("cift sayilarin toplami:"+ciftayilarinToplami);
        System.out.println("tek sayilarin toplami:"+tekSayilarinToplami);
    }
}
