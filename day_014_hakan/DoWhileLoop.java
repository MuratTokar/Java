package day_014_hakan;

public class DoWhileLoop {

    public static void main(String[] args) {

        // true - false while(boolean)
        // for(init ; statement ; increment/decrement)
        // 1. init while in disinda gerceklesir
        // 2. statement while(statement)
        // 3. increment/decrement while döngüsünün icerisinde olur

        for(int i=1; i <= 5; i++){

            System.out.println(i);
        }

        System.out.println("***************************");

        // Fark 1: increment/decrement islemi döngü icerisindeki koddan önce veya sonraya birakilabilir(WHILE)


        int i=1;
        // 1-5 ekrana yazdirir
        while(i <= 5){

            System.out.println(i);
            i++;
        }

        System.out.println("***************************");


        // 2-6 yi ekrana bastirir
        i=1;
        while(i <= 5){
            i++;
            System.out.println(i);
        }

        System.out.println("***************************");

        // sonsuz döngü 1 sayisini ekrana basar
        /* i=1;
        while(i <= 5){
            System.out.println(i);
        }

         */


        System.out.println("***************************");
        i = 1;
        int a = 3;
        do{
            if(a==2){
                break;
            }
            System.out.println(i);
            i++;
        } while(i <= 5);

        System.out.println("***************************");
        i = 1;
        a = 2;
        if(a!=2) {
            while (i <= 5) {
                System.out.println(i);
                i++;
            }
        }



    }
}
