package day_24_murat.lab;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        // bir arrayi parametre olarak kabul edip toplamlarini basan array
        int[] sayi={1,5,8,-2};
        arrayTopla(sayi);//  methodu cagiriyoruz
    }
    public static void arrayTopla(int[] sayi){
        int toplam=0;// sonucu tutacagim havuz
        for (int i = 0; i < sayi.length; i++) {
            toplam+=sayi[i];     // toplayip toplayip ustune yaz ve int toplama at

        }
        System.out.println(Arrays.toString(sayi));
        System.out.println("Toplam " +toplam);

    }
}
