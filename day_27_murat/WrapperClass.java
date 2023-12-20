package day_27_murat;

public class WrapperClass {
    public static void main(String[] args) {
        // CASTING
        double x = 2.0;
        int a = (int) x; // explicit, narrowing, daraltma

        int b = 5;
        double y = b; // implicit, genisletme, widening

        String s = "Java";
        String s1 =  new String("Java");

        // Wrapper Classes

        // Her bir primitive(ilkel) data type i icin atanan class lardir.
        // 8 Primitive Data Type i icin, 8 farkli Wrapper Class i vardir
        /**
         * INTEGER DATA Tipleri
         * byte -> Byte
         * short -> Short
         * int -> Integer
         * long -> Long
         *
         * Floating Data Tipleri
         * float -> Float
         * double -> Double
         *
         * char -> Character
         * boolean -> Boolean
         *
         */

        // Autoboxing - Unboxing
        // Autoboxing : primitive -> object (Wrapper Class object ine cevirir)
        // Unboxing : object -> primitive (Wrapper Class object ini, primitive data tipine cevirir)

        //Integer i2 = new Integer(12); // deprecated after java 9, yani desteklenmiyor
        int i3 = Integer.valueOf(12); // int i, primitive data tipine atama, unboxing
        Integer i4 = Integer.valueOf(12); // autoboxing
        int i5 = i4; // unboxing i4 Integer object ini , i5 int primitive data tipine cevirdim

        // !!! Wrapper class object lerinde, casting yapilamaz
        // Double i6 = i4; // compile error due to casting

        // WRAPPER CLASS Methods / fields
        int maxValue = Integer.MAX_VALUE;
        int string = Integer.parseInt("12345"); // primitive = primitive


        int string2 = Integer.valueOf("123"); // primitive = object, unboxing
        // 1. "123" stringini Integer objectine ceviriyor
        // 2. bu object in degeri 123
        // 3. = ifadesi ile, unboxing yaparak,
        // primitive string2 int degiskenine 123 degerini atiyor

        // Integer.valueOf()
        // methodu, primitive int degerini, Integer class object ine dönüstürerek, autoboxing yapar

    }
}
