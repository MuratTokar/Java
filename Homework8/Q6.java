package Homework8;

public class Q6 {
    public static void main(String[] args) {
         /*
    Bir isci günlük 100€ yevmiye ile calismaktadir. Saat ücreti ise 15€ dur. Günde max 8 saat
calisan bu iscinin, toplam calisma süresine göre alacagi ücreti hesaplayan program yaziniz.
input = 100 output = 1260€
     */



            int input=100;
            int yevmiye=100;
            int saatUcreti=15;
            int artikSaat=100%8;  // artik saat hesaplama
            int gün=(input-artikSaat)/8; // 12 gün calisildi
            int toplamUcret= (gün*100)+(artikSaat*15);



            System.out.println("Toplam Ucret: " +toplamUcret); // 1260

        }
}
