package day_011_hakan;

public class IfElseStatement {

    public static void main(String[] args) {

        // 2 veya faha fazla condition(sart) varsa, if - else if kullanilir
        // Tek sart(condition) varsa if kullanilir
        // sartlarin disinda kalanlari kapsamak icin else kullanilir


        // Cift sayi : -2k... -100. -98 ...-2,0,2,4,6....98,100...2k
        // Bir sayi ya cifttir, ya da tektir. Cift olmayan bir sayi tek sayidir.


        // else yi kalan ihtimallerden sadece bir durum var ise kullanabiliyoruz
        int num = 17;
        if(num%2 == 0) {
            System.out.println(num + " bir cift sayidir.");
        } else {
            System.out.println(num + " bir tek sayidir.");
        }

        // 2 if le yazmak istedigimizde
        if(num%2 == 1){
            System.out.println(num + " bir tek sayidir.");
        }


        int num2 = 20;
        if(0 < num2) {
            System.out.println(num2 + " bir pozitif sayidir.");
        } else { // !!! 0 negatif bir sayi olmadigi icin, kod hatalidir
            System.out.println(num2 + " bir negatif sayidir.");
        }




        int num3 = 20;
        if(0 < num3) {
            System.out.println(num3 + " bir pozitif sayidir.");
        } if(num3 < 0){
            System.out.println(num3 + " bir negatif sayidir.");
        } else { // 0 negatif bir sayi olmadigi icin, kod hatalidir
            System.out.println(num3 + " sayisi == 0 dir");
        }


        // pozitif ve 0 i condition olarak yazip, negatif sartini else ye atalim
        int num4 = 20;
        if(0 < num4) {
            System.out.println(num3 + " bir pozitif sayidir.");
        } else if(num4 == 0){
            System.out.println(num3 + " sayisi == 0 dir");
        } else { // 0 negatif bir sayi olmadigi icin, kod hatalidir
            System.out.println(num3 + " bir negatif sayidir.");
        }

        System.out.println("****************************************");

        /**
         * Task :
         * 0-30 arasi not alan ögrenciler : Basarisiz
         * 30-60 arasi not alan ögrenciler : Vasat
         * 60-80 arasi not alan ögrenciler : Basarili
         * 80-100 arasi not alan ögrenciler : Cok Basarili
         *
         */


        // Eger else if kullanmazsak, sadece ifleri kullanirsak...
        // kod calistiginda, if ler birbirinden bagimsiz olarak
        // ve her seferinde her birisi calisacak sekilde parametreyi karsilastirirlar

        // bagimsiz
        // if
        // if

        // bagimli
        // if(con1) -> else if(con2) -> else if(con3) -> else if(con4) -> else

        // if 0-30 print basarisiz
        // else if 30-60 print Vasat
        // else if 60-80 print Basarili
        // else if 80-100 print Cok Basarili
        // else print "Lütfen gecerli bir not giriniz"
        int note = 90;

        if(0 <= note && note < 30) {
            System.out.println("Basarisiz");
        } else if(30 <= note && note < 60) {
            System.out.println("Vasat");
        } else if(60 <= note && note < 80) {
            System.out.println("Basarili");
        } else if(80 <= note && note <= 100) {
            System.out.println("Cok Basarili");
        } else {
            System.out.println("Lütfen gecerli bir not giriniz");
        }


        System.out.println("****************************************");
        // Small-Tasks 2
        System.out.println("****************************************");
        // 1
        int x = 100, y;
        // if the variable x is greater than 100, y = 20
        // else y = 0

        if(100 < x) {
            y = 20;
        } else {
            y = 0;
        }

        System.out.println("x'in degeri : " + x + " iken y nin degeri : " + y);

        System.out.println("****************************************");
        // 2
        // if y == 100, x = 1
        // else x = 0
        int y2 = 1000, x2;

        if(y2 == 100){
            x2 = 1;
        } else {
            x2 = 0;
        }

        System.out.println("y'in degeri : " + y2 + " iken x nin degeri : " + x2);

        System.out.println("****************************************");

        // 3
        // if a < 10 -> b=0 and c = 1
        // else -> b= -99 and c = 0

        int a=11, b, c;

        if(a < 10) {
            b = 0;
            c = 1;
        } else {
            b = -99;
            c = 0;
        }



    }


}
