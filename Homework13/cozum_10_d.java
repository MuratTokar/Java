package Homework13;

public class cozum_10_d {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) { // 7 tane satir olusturdum
            System.out.print("#"); // her satir basina 1 adet # yazdirdim
            for (int j = 1; j <=i; j++) { //ic döngüyü baslattim
                System.out.print(" ");

            }
            if (i>1){ // ikinci satirdan itibaren bir bosluk daha ekledim
                System.out.print("#");

            }
            System.out.println(" ");
        }
    }
}
