package day_013_murat;

public class Forlops {
    public static void main(String[] args) {
         //      -> Döngü
         // cok sayida benzer islemi yaptirmak icin kullanilir
         // Her isleme uygulanacak kural ortaktir

         // 0,1,2,3,4,5...50
         /*
         for(int i = 0; i <= 50; i+=10) { // (sartlar) -> (  init(baslangic degerini tanimla)  ; (sart) ; (uygulanacak islem)    )
            // islem satiri

                System.out.println(i); //

        }

         */
        for (int i=0; i<=50; i++){
            if (i%10==0){
                System.out.println(i);
            }

        }

       /* for (int i=1; i<100; i*=3){
            System.out.println(i);
        }
        for(int i = 0;; i++){
            System.out.println(i);
        }*/
        int deger=2;
        if (deger<10){
            System.out.println(deger+ ": 10 dan kücüktür");
        }else {
            System.out.println(deger+" girilen sayi 10 dan kücük degil ");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);


        }
        System.out.println("+++++++++++++++++++++++++++++++++");
        for (int i = 10; i >=5; i--) {
            System.out.println(i);

        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i <=50 ; i++) {
            if (i%10==0){
                System.out.println(i);
            }

        }
        System.out.println("+++++++++++++++++++++++");
        for (int i = 0; i <=50 ; i+=10) {
            System.out.println(i);

        }
        System.out.println("+++++++++++++++++++++++++++++");
        for (int i = 1; i <=50 ; i+=2) {
            System.out.println(i);

        }
        for (int i=0;i <=20;i++){
            if (i%2==1){
                System.out.println(i);
            }
        }
        for (int i = 1; i <=25; i*=3) {
            System.out.println(i);

        }
    }
}
