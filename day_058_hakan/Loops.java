package day_058_hakan;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        /**
         if(true/false){
         // true ise
         // calistir
         } else {
         // if sartini saglamayan her durum
         }

         if(condition 1){
         // condition 1 saglaniyor ise
         // calistir
         } else if(condition 2) {
         // condition 1 saglanmiyor ise, conditon 2 saglaniyor ise
         } else if (..)...

         else -> if condition larinin gecerli olmadigi diger tum durumlar...

         nested if-else
         if(degisken 1 condition / bayan ise){
         if(degisken 2 condition/ 18 yasindan buyukse){
         } else { // 18 yasindan kucukse
         }
         } else { // erkekse
         if(degisken 2 condition/ 18 yasindan buyukse){
         } else { // 18 yasindan kucukse
         }
         }
         cinsiyet = erkek / kadin
         switch(cinsiyet){
         case "erkek":
         // kodu calistir
         if(){
         }
         break;
         case "kadin":
         // kodu calistir
         break;
         default:
         throw new IllegalArgumentException("Entered sex is not valid!");
         }

         **/
        if(2 < 1){
            System.out.println("2 kucuktur 10");
            System.out.println("2.satir");
        }

        if(2< 1)
            System.out.println("2 kucuktur 10");
        System.out.println("2.satir");

        System.out.println("2.satir");

        //String cinsiyet = "erkek";
        String cinsiyet = "erkek cocuk";
        switch(cinsiyet) {
            // alt alta 2 case yazarak, caseleri || olarak kullanmis oluruz
            case "erkek":
            case "erkek cocuk":
                // kodu calistir
                break;
            case "kadin":
            case "kadin cocuk":
                // kodu calistir
                break;
            default:
                throw new IllegalArgumentException("Entered sex is not valid!");
        }

        for(int i=0; i < 10 ; i++){
            if(i%2 == 0){
                System.out.println("i = " + i);
            }
        }

        int[] nums = {1,2,3,4,5};
        for(int m : nums){
            System.out.println(m);
        }

        int counter=0;
        while(counter < 10){
            if(counter%2 == 0){
                System.out.println("counter = " + counter);
            }
            counter++;
        }

        counter =0;

        do {
            // WebElement elem = Driver.findElement(By.xpath(""));
            String elem ="";
            if(elem != null){
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
        } while(counter < 5);


        int i = 0;
        for(; i < 5;){

            System.out.println("i = " + i);
            i++;
        }

        for(int k =0; k<7 ;k++){
            for(int j=0; j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=0; k<10; k++){
            if(k==5){
                continue;
            }
            System.out.println(k);
        }

        // count continue dan dolayi 5 te takili kalir ve sonsuz donguye girer
        int count=0;
        while(count < 10){
            if(count == 5){
                System.out.println("count = " + count);
          //      continue;
            }
            count++;
        }

        outerLoop:for(int k=0; k< 4 ; k++){
            if(k==2){
                break;
            }
            System.out.println("***************");
            System.out.println("k value : " + k);

            for(int j=0;j<3; j++){
                System.out.println("j value : " + j );
                if(j==1){
                    break outerLoop;
                }
            }
        }
        System.out.println("*******************************************");
        String[][] bookStores = {{"Idris", "Zafer"},{"Haldun","Turgut","Birsen"},{"Abdullah","Enes"}};

        outer:for(String[] bookStore : bookStores){
            for(String book : bookStore){
                System.out.println(book);
                if(book.equals("Turgut")){
                    break outer;
                }
            } // outer label i kullanilmasaydi buraya atlayacakti
        } // outer kullanildigi icin buraya atlayacak

        System.out.println("*******************************************");

        for(int j=0;j<3;j++){
            outer:for(String[] bookStore : bookStores){
                for(String book : bookStore){
                    System.out.println(book);
                    if(book.equals("Turgut")){
                        break outer;
                    }
                } // outer label i kullanilmasaydi buraya atlayacakti
            }
        }

        Scanner input = new Scanner(System.in);
        String myName = "Hakan";
        System.out.println("Isminizi lutfeder misiniz?");
        String name = input.next();
        System.out.println(name + ", ne guzel bir isim, memnun oldum ben de " + myName);



    }
}
