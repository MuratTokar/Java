package extraCalismalarim;

import java.util.Scanner;

public class TersstenYazma {
    public static void main(String[] args) {
        // Kullanicidan alinan bir metnin ín tersten yazilmasi metodu
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin girin");// Kullaniciya mesaj verdik
        String kelime = scan.nextLine(); // kullanici deger girdi ve String kelime icine attim
        tersCevir(kelime);// metodu call ettim yani metodu burda calistirdim.icine kullanicinin kelimesini koydum
    }

    private static void tersCevir(String kelime) {
        for (int i =kelime.length()-1; i >=0; i--) {// index sifirdan basladigi icin
            // System.out.print(kelime.charAt(i));
            System.out.print(kelime.substring(i, i +1)); // sondaki
        }
    }
}
