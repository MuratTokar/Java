package extraCalismalarim9_video_14;

import java.util.Scanner;

public class WhileLoop_Soru1 {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar alin ve toplami 500 u asinca
        // kac sayi girdigini ve sayilarin toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int girilenSayiAdedi=0;

        while (toplam<500){
            System.out.println("Toplanmak uzere tam sayi giriniz");
             sayi=scan.nextInt();
            toplam+=sayi;
            girilenSayiAdedi++;
        }
        System.out.println("Girilen sayi adedi : " + girilenSayiAdedi + " ve girilen sayi toplami : " + toplam);



    }
}
