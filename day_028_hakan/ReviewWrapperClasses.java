package day_028_hakan;

public class ReviewWrapperClasses {
    public static void main(String[] args) {
        // Wrapper Class : Primitive data tipinin kaplama yapilmis class ina denir
        // int -> Integer
        // byte -> Byte
        // short -> Short
        // long -> Long
        // char -> Character
        // boolean -> Boolean
        // float -> Float
        // double -> Double

        // primitive data tipinde, method kullanilamaz
        // Wrapper Class ta, methodlar, field lar kullanilabilir

        System.out.println(Character.isDigit('2')); // true
        System.out.println(Character.isDigit('a')); // false
        System.out.println(Character.isAlphabetic('a')); // true
        System.out.println(Character.isAlphabetic('?')); // false

        int a = Integer.parseInt("123"); // int a = 123; // returns primitive
        int b = Integer.valueOf("123"); // int a = 123; // returns Integer object

        // Autoboxing
        int b1 = 15;
        Integer i2 = b1; // Autoboxing -> primitive int to Integer object

        // unboxing
        Integer i1 = Integer.valueOf("123"); // returns Integer object
        int a1 = i1; // unboxing -> object Integer to primitive int

        // Wrapper Classlar arasinda casting olmaz
        // Double d2 = i1;

        double d = i1; // Integer object -> primitive int -> primitive double

        // Math Methods

        // round , normal yuvarlama, return int
        // ceil, tavana yuvarlama, returns double a < x < b  Math.round(x) = (double) b
        // floor, tabana yuvarlama, returns double a < x < b  Math.round(x) = (double) a

        // String.format("%.xf",ondalikSayi); returns ondalikSayi yi, virgulden sonra x basamak round edilmis sekilde döner.
    }
}
