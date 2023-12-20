package extraCalismalarim9_video_14;

import java.util.Scanner;

public class WhileLoop_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int girilenSayiAdedi=0;
        int girilenSayiToplami=0;
        int sayi=0;

        for (int i = sayi; sayi<500 ; i++) {
            System.out.println("Toplanmak uzere lutfen bir sayi girin");
            sayi=scan.nextInt();
            girilenSayiToplami+=sayi;
            girilenSayiAdedi++;
            if (girilenSayiToplami>500){

                break;
            }

        }
        System.out.println("girilen sayi toplami " + girilenSayiToplami + " ,  girilen sayi adedi : " + girilenSayiAdedi);
    }
}
