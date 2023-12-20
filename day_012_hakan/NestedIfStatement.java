package day_012_hakan;

public class NestedIfStatement {

    public static void main(String[] args) {
        /**
         * Temp < 0 => Dondurucu soguk      1       3
         * 0 <= Temp < 10 => Cok soguk      2       4
         * 10 <= Temp < 20 => Soguk         3       2
         * 20 <= Temp < 30 => Normal        4       3
         * 30 <= Temp < 40 => Sicak         5       4
         * 40 <= Temp => Cok sicak          6       2
         */
        int temp = 20;

        if(temp < 0){ // negatif degerler
            System.out.println("Dondurucu Soguk");
        } else if(temp < 10){ // [0,9]
            System.out.println("Cok soguk");
        } else if(temp <20){ // [10,19]
            System.out.println("Soguk");
        } else if(temp <30){ // [20,29]
            System.out.println("Normal");
        }else if(temp <40){ // [30,39]
            System.out.println("Sicak");
        } else { // [40,--]
            System.out.println("Cok sicak");
        }

        // nested if - ic ice if statement

        if(temp < 20) {
            if(10 <= temp){
                System.out.println("Soguk");
            } else if(temp < 0){
                System.out.println("Dondurucu Soguk");
            } else {
                System.out.println("Cok soguk");
            }
        } else {
            if(40 <= temp){
                System.out.println("Cok sicak");
            } else if(temp < 30){
                System.out.println("Normal");
            } else {
                System.out.println("Sicak");
            }
        }



        // 100 kisilik bir grupta, 18 yasindan kücüklerin ve büyüklerin cinsiyet dagilimini veren bir program yaziniz.
        // {yas, cinsiyet}

        /*
        if(yas < 18) {
            if(cinsiyet == erkek){
                // 18 yasindan kücük erkeklerin sayisini 1 arttir
            } else {
                // 18 yasindan kücük bayanlarin sayisini 1 arttir
            }
        } else {
            if(cinsiyet == erkek){
                // 18 yasindan büyük erkeklerin sayisini 1 arttir
            } else {
                // 18 yasindan büyük bayanlarin sayisini 1 arttir
            }
        }
        */

        System.out.println("*******************************************");

        // Ülkelere göre kadin erkek secilme yasini veren programi yaziniz

        String ulke = "Hollanda";
        String cinsiyet = "Erkek";

        if(ulke == "Türkiye"){
            if(cinsiyet=="Kadin"){
                System.out.println(ulke + "'de secme secilme yasi, " + cinsiyet + " cinsiyeti icin 20 dir.");
            } else {
                System.out.println(ulke + "'de secme secilme yasi, " + cinsiyet + " cinsiyeti icin 18 dir.");
            }
        } else if(ulke == "Almanya"){
            if(cinsiyet=="Kadin"){
                System.out.println(ulke + "'de secme secilme yasi, " + cinsiyet + " cinsiyeti icin 25 dir.");
            } else {
                System.out.println(ulke + "'de secme secilme yasi, " + cinsiyet + " cinsiyeti icin 30 dir.");
            }
        } else if(ulke == "Hollanda"){
            if(cinsiyet=="Kadin"){
                System.out.println(ulke + "'de secme secilme yasi, " + cinsiyet + " cinsiyeti icin 35 dir.");
            } else {
                System.out.println(ulke + "'de secme secilme yasi, " + cinsiyet + " cinsiyeti icin 18 dir.");
            }
        } else {
            System.out.println("Lütfen gecerli bir ülke degeri giriniz");
        }

    }
}
