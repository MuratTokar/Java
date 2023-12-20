package day_013_hakan;

public class ReviewIfElseIfSwitchCaseStatements {
    public static void main(String[] args) {

        // girilen sayinin 10 dan kücük olup olmadigini kontrol eden programi yaziniz.
        int a = 5;
        if(a < 10){
            // a 10 dan kücük durum
        } else {
            // a nin 10 dan büyük olma durumu
        }

        // girilen sayinin 10 dan kücük olup olmadigini ve esit olup olmadigini kontrol eden programi yaziniz.
        if(a < 10){
            // a 10 dan kücük durum
        } else if(a == 10){
            // a nin 10 a esit oldugu durum
        } else {
            // a nin 10 dan büyük oldugu durum
        }

        // girilen sayinin 10 dan kücük olup olmadigini kontrol eden programi yaziniz.
        int caseValue = 0;
        if(a < 10) caseValue=1;

        switch(caseValue){
            case 1:
                // case gecerli ise buradaki kodu calistir
                System.out.println(a + " sayisi 10 dan kücüktür");
                break;
            case 0:
                int caseValue2 = 0;
                if(a==10) caseValue2 = 1;
                switch (caseValue2){
                    case 0:
                        System.out.println(a + " sayisi 10 dan büyüktür");
                        break;
                    case 1:
                        System.out.println(a + " sayisi 10 sayisina esittir.");
                }
                // case gecerli ise buradaki kodu calistir
                break;
            default:
                // tanimlanan case lerin hicbiri gecerli olmadiginda calistir
                break;
        }

        // girilen bir sayinin cift mi tek mi oldugunu veren program
        int b = 10;

        if(b%2 == 0){
            System.out.println(b + " bir cift sayidir");
        } else {
            System.out.println(a + " bir tek sayidir");
        }

        switch(b%2){
            case 0:
                System.out.println(b + " bir cift sayidir");
                break;
            case 1:
                System.out.println(a + " bir tek sayidir");
                break;
        }

        // nested if : Icice If statement
        // Tek parametreli durumlarda, sartlar ne kadar karisik olsa da if - else if yeterli olacaktir
        // 2 veya daha fayla parametreli durumlarda, parametreler birbiri ile baglantili olduguu durumlarda ic ice if statment kulllanmak daha mantiklidir.

        char note = 'A';

        if(note == 'A' || note == 'a'){
            System.out.println("Cok basarili");
        } else if(note == 'B' || note == 'b'){
            System.out.println("Basarili");
        } else {
            System.out.println("Basarili degil");
        }

        switch(note){
            case 'A':
            case 'a':
                System.out.println("Cok basarili");
                break;
            case 'B':
            case 'b':
                System.out.println("Basarili");
                break;
            default:
                System.out.println("Basarili degil");
                break;
        }

        String name = "Deniz";
        String cinsiyet = "Kadin";
        int erkekDenizSayisi=0;
        int kadinDenizSayisi=0;

        if(name == "Deniz"){
            if(cinsiyet == "Kadin"){
                kadinDenizSayisi++;
                kadinDenizSayisi += 1;
            } else {
                erkekDenizSayisi++;
            }
        }

        int c = 10;

        if (c < 40){
            System.out.println(c + " sayisi 40 tan kücüktür");
        }

        if (c < 20){
            System.out.println(c + " sayisi 20 tan kücüktür");
        }

        if (c < 20){
            System.out.println(c + " sayisi 20 tan kücüktür");
        } else if (c < 40){
            System.out.println(c + " sayisi 40 tan kücüktür ve 20 den büyüktür");
        }








    }
}
