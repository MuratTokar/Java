package day_012_murat;

public class NestedIfStatement {
    public static void main(String[] args) {
       String ulke =("Almanya");
        String cinsiyet=("Erkek");
        if (ulke=="Türkiye"){
            if (cinsiyet=="Erkek"){
                System.out.println(ulke + " ' de secme secilme yasi, "  + cinsiyet + "  icin 20 dir");
            } else {
                System.out.println(ulke + " ' de secme secilme yasi, " + cinsiyet + "  icin 18 dir");
            }

        } else if (ulke=="Hollanda") {
            if (cinsiyet == "Kadin") {
                System.out.println(ulke + " ' de secme secilme yasi, " + cinsiyet + " icin 25 tir ");
            } else {
                System.out.println(ulke + " ' de secme secilme yasi, " + cinsiyet + " icin 30 dur");
            }
        } else if (ulke=="Almanya"){
            if (cinsiyet=="Kadin"){
                System.out.println(ulke + " ' da secme secilme yasi, " + cinsiyet + " icin 20 dir." );
            } else {
                System.out.println(ulke + " ' da secme secilme yasi, " + cinsiyet+ " icin 18 dir ");
            }


            }else {
            System.out.println("Lütfen gecereli bir ülke giriniz");
        }



        /*Girilen sicaklik derecesine göre hava durumunu bildiren programi yaziniz.
Temp < 0 => Dondurucu soguk
0 <= Temp < 10 => Cok soguk
10 <= Temp < 20 => Soguk
20 <= Temp < 30 => Normal
30 <= Temp < 40 => Sicak
40 <= Temp => Cok sicak



int temp=31;
if (temp<0){
    System.out.println("Dondurucu Soguk");
}else if (temp<10) {
    System.out.println("Cok soguk");
} else if (temp<20) {
    System.out.println("Soguk");
} else if (temp<30) {
    System.out.println("Normal");
} else if (temp<40) {
    System.out.println("Sicak");
}else{
    System.out.println("Cok sicak");
}
        System.out.println("************************************************************");
        int temp1=-1;
   if (temp1<20){
       if (temp1>=10) {
           System.out.println("Soguk");
       } else if (temp1>=0) {
           System.out.println("Cok Soguk");
        } else {
           System.out.println("Dondurucu Soguk");
       }
   }else {
       if (temp1>=40){
           System.out.println("Cok Sicak");
       } else if (temp1>=30) {
           System.out.println("Sicak");
       }else {
           System.out.println("Normal");
       }
   }



*/

    }

}

