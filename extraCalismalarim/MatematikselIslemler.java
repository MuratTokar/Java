package extraCalismalarim;

import java.util.Scanner;

public class MatematikselIslemler {
    public static void main(String[] args) {
        /* modulus islemi sayesinde ;
        -Cift sayilar (sayi%2)
        -bir sayinin birler basamagini bulma(sayi%10)
        -Bir sayi (örnegin 5) ile tam bölünebilen sayilari bulma(sayi%5)
        islemleri mümkündür

         */
        // Kullanicidan 3 basamakli bir sayi alin ve sayilarin rakamlarinin toplamini yazin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli pozitif bir sayi girin");
       int girilenSayi =scan.nextInt();

       int birler=girilenSayi%10;
       int onlar=(girilenSayi/10)%10;
       int  yüzler=(girilenSayi/100)%10;
        System.out.println("###########################################################################################");
// girlen sayi 135 dersek
       int sayiToplami=birler+onlar+yüzler; // birler basamaginin modulu aldik rakamlar toplamina gönderik(yani 5 i aldik)
        System.out.println(sayiToplami);
        int rakam=girilenSayi%10;
        int rakamlarToplami=rakam;

        // yeni sayim 13
        girilenSayi=girilenSayi/10;
        rakam=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+rakam;

        // yeni sayim 1
        girilenSayi=girilenSayi/10;
        rakam=girilenSayi%10;
        rakamlarToplami=rakam+rakamlarToplami;
        System.out.println(rakamlarToplami);







    }
}
