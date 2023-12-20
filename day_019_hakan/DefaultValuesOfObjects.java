package day_019_hakan;

public class DefaultValuesOfObjects {

    public static void main(String[] args) {

        // Default olarak fields(instance variables) degerleri, normal variables larin aksine null, 0 , false atanir
        // int 0
        // String null
        // boolean false
        // char '\u0000'
        Cars carA = new Cars();
        carA.model="Touran";
        carA.motorGucu="2.0 TDI";
        //carA.uretimYili=2020;
        carA.yakitTuru="Diesel";
        carA.renk = "Beyaz";

        carA.printInfo();
        System.out.println("****************");
        Cars carB = new Cars();
        carB.printInfo(); // uretimYili default degeri 2023 olarak atanmistir

        // asagidaki olusturulan degiskenler hata verirken,
        // üstteki olusturulan object fileds hata vermeden default bir deger ile dönüyor
        /*
        int a;
        String str;
        System.out.println(a);
        System.out.println(str);
        */

    }
}
