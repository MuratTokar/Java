package day_012_murat;

public class XXX {
    public static void main(String[] args) {
        /*
       Girilen sicaklik derecesine göre hava durumunu bildiren programi yaziniz.
Temp < 0 => Dondurucu soguk
0 <= Temp < 10 => Cok soguk
10 <= Temp < 20 => Soguk
20 <= Temp < 30 => Normal
30 <= Temp < 40 => Sicak
40 <= Temp => Cok sicak
Input : 35 Output : Sicak
         */
        int temp=35;
        if (temp<0){
            System.out.println("Dondurucu soguk");
        } else if (temp<10) {
            System.out.println("Cok soguk");
            
        } else if (temp<20) {
            System.out.println("Soguk");
            
        } else if (temp<30) {
            System.out.println("Normal");

        } else if (temp<40) {
            System.out.println("sicak");

        }else {
            System.out.println("Cok sicak");
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++");//2.yol ic ice  else if
        if (temp<20){
            if (temp>=10){
                System.out.println("Soguk");
            } else if (temp<0) {
                System.out.println("dondurucu soguk");

            }else {
                System.out.println("cok soguk");
            }
        }else {
            if (temp>=40){
                System.out.println("cok sicak");

            } else if (temp <30) {
                System.out.println("normal");

            }else {
                System.out.println("sicak");
            }
        }

       /* int yas=20;
        String cinsiyet="erkek";
        if (yas<18){
            if (cinsiyet=="erkek"){
                System.out.println("aaaaaaaaaaaaaaa");

            }else {
                System.out.println("bbbbbbbbbbbbbb");
            }


        }else {
            if (cinsiyet=="erkek"){
                System.out.println("hhhhhhhhhhhhhhhh");
            }else {
                System.out.println("kkkkkkkkkkkkkkkkkkkkk");
            }

        }*/

        String ülke="Hollanda";
        String cinsiyet="Erkek";
        if (ülke=="Türkiye"){
            if (cinsiyet=="Kadin"){
                System.out.println(ülke + " de secme secilme yasi : " + cinsiyet +" icin 18 dir");
            }else {
                System.out.println(ülke + " de secme secilme yasi : " + cinsiyet +" icin 19 dur");
            }

        } else if (ülke=="Hollanda") {
            if (cinsiyet=="Kadin"){
                System.out.println(ülke + " de secme secilme yasi : " + cinsiyet +" icin 20 dir");
            }else {
                System.out.println(ülke + " de secme secilme yasi : " + cinsiyet +" icin 21 dir");
            }


        } else if (ülke=="Almanya") {
            if (cinsiyet=="Kadin"){
                System.out.println(ülke + " de secme secilme yasi : " + cinsiyet +" icin 22 dir");
            }else {
                System.out.println(ülke + " de secme secilme yasi : " + cinsiyet +" icin 23 dir");
            }


        }
    }
}
