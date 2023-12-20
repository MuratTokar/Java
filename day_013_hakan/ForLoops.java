package day_013_hakan;

public class ForLoops {
    public static void main(String[] args) {
        // Loops  -> Döngü
        // cok sayida benzer islemi yaptirmak icin kullanilir
        // Her isleme uygulanacak kural ortaktir

        // 0,1,2,3,4,5...50
        for(int i = 0; i <= 50; i++){ // (sartlar) -> (  init(baslangic degerini tanimla)  ; (sart) ; (uygulanacak islem)    )
            // islem satiri
            if(i%10 == 0){
                System.out.println(i); //
            }
        }

        for(int i = 0; i <= 50; i+=10){ // 0, 10, 20, 30, 40, 50
            System.out.println(i);
        }


        /*
        for(int i = 0;; i++){ // int max value sina kadar integerlari ekrana basar
            System.out.println(i);
        }
*/


        /*

        - init kismi, yani ilk kisim ve i degeri ile ilgili islem, yani son kisim olmasi ZORUNLU
        - orta kisim, yani condition, yani kosul kismi, olmak zorunda degil, fakat, kosulsuz, java limitlerine kadar calsiir
        for(int i = 0; i < 5;){ // int max value sina kadar integerlari ekrana basar
            System.out.println(i);
        }

         */
        System.out.println("**********************************************");

        for(int i = 1; i < 100 ; i *=3){
          System.out.println(i);
        }
        System.out.println("***********************************");
        for(int i = 1; i < 10 ; i++){
            System.out.println(i);
        }

        System.out.println("***********************************");
        for(int i = 1; i < 10 ; ++i){
            System.out.println(i);
        }



    }
}
