package day_014_hakan;

public class ReviewForLoops {

    public static void main(String[] args) {

        // Loop : Döngü
    /*
    for(  init  ; karsilastirma   ;  islem ){
        // code block

    }

     */

        for(int i=0; i<10 ; i++){
            // buradaki kodu her seferinde calistir
            System.out.print("*");
        }

        System.out.println();

        /*

        // 0 bir defa
        // 0 - 1 - 2 - 3 - 1 - 2 - 3 - 1 - 2 ... 1 numarali sart saglanana kadar devam eder.

    for(  0 ; 1   ;  3 ){
        // 2
    }

     */
        for(int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 0 - 20 arasinda ikiser artarak sayilari veren program
        for(int i = 0; i<=20; i+=2){
            System.out.print(i + "\t");
        }

        System.out.println();
        for(int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 0 - 20 arasinda cift sayilari veren program
        for(int i = 5; i<=20; i++){
            if(i%2==0){
                System.out.print(i + "\t");
            }
        }

        System.out.println();
        for(int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();

        // iki sayi arasindaki cift sayilari veren program
        int a=10, b=55;
        for(int i = a; i<=b; i++){
            if(i%2==0){
                System.out.print(i + "\t");
            }
        }















    }



}
