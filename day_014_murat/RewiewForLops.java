package day_014_murat;

public class RewiewForLops {
    public static void main(String[] args) {
        // Loop:döngü
        /*
        for(init; karsilastirma;islem){
        // coode block
      */

        for (int i = 0; i < 10; i++) {
            System.out.print("*");


        }
        // 0  ile 20 arasindaki cift sailari veren program
        for (int i = 0; i <=20; i++) {    // bu program ideal
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        // iki sayi arasindaki cift sayilari veren program
        int a=10, b=55;
        for (int i = a; i <b ; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }

        }

    }
}
