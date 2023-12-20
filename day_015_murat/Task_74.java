package day_015_murat;
// pozif sayilar girin.negatif sayi girince sistemden cikilsin
import java.util.Scanner;

public class Task_74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int girilenSayi = 0;
        while (girilenSayi>=0) {
            System.out.println("Lütfen pozitif bir sayi giriniz");
            girilenSayi = input.nextInt();
            if (girilenSayi >= 0) {
                toplam += girilenSayi;
            }
        }
        System.out.println("Girilen sayilarin toplami:" + toplam);
    }
}
