package day_065_mrt;

public class C077 {
    public static void main(String[] args) {
        int[] intArr={8,16,32,64,128};
        // Hangi iki sik bagimsiz olarak tum elementleri yazdirir.


        for(int i : intArr){
            System.out.println(i);
        }

        System.out.println("*****************");

        for(int i=0; i< intArr.length; i++){
            System.out.println(intArr[i]);
        }
        /*
        // A
        for(int i : intArr){
            System.out.print(intArr[i] + " "); //  foreach kullandigimiz zaman : iki noktanin  saginda ki i sadece yazmaliyiz
        }

         */
        /*
        // B
        for(int i : intArr){
            System.out.print(i + " "); //  bu dogru
        }

         */
        /*
        // C
        for(int i =0 : intArr){
            System.out.print(intArr[i] + " "); //  yanlis
            i++;
        }

         */
        /*
        // D
        for(int i =0 ; i< intArr.length ; i++){ // yanlis
            System.out.print(i + " ");
        }

         */

        /*
        // E
        for(int i =0 ; i< intArr.length ; i++){ // dogru yani bunu indexine göre bastiriyoruz
            System.out.print(intArr[i] + " ");
        }

         */

        /*
         // F
        for(int i ; i< intArr.length ; i++){
            System.out.print(intArr[i] + " ");
        }

         */
        // Cevap:B E

    }
    }

