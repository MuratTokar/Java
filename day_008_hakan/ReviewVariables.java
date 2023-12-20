package day_008_hakan;

import day_007_hakan.Variables;

public class ReviewVariables {

    public static void main(String[] args) {
        // declare
        // DataType variableName;
        String name;

        // assign
        // DataType variableName = value;
        name = "Tester";

        //DataTypes

        // PRIMITIVE Data Types : Javada sinirli bir yer tutan, veri degerinin limitli oldugu
        // Integers : byte, short, int, long
        byte b; // -128, 127 , 1 byte
        short s; // -32,768 ; 32767, 2 byte
        int i; // -2^31, 2^31-1 ; 4 byte
        long l = 2200000000l; // integerin max value sundan daha büyük degerler icin, degerin sagina "l" harfi aliyor
        // 8 byte, min = -2^63, max 2^63-1

        // floating point : float, double
        float f = 4.5f; // 4 byte, float a deger atanirken sagina "f" ya da "F" harfi eklenir
        float f2 = 4.5F;

        double d = 3.5; // 8 byte

        // HINT : en cok kullanilan integer data type i "int"
        // HINT : en cok kullanilan floating data type i "double"

        // boolean,
        boolean bo = true; // 2 farkli degeri vardir: true, false, 1 bit
        boolean bo2 = false;

        //char
        char c = '&'; // 2 byte java da yer tutar, genel olarak character ler 1 byte liktir
        // HINT : char degiskenine deger atarken, tek tirnak 'char' kullanilir, String in aksine, String te cift tirnak kullanilir



        // NON_PRIMITIVE Data Types : Siniri olmayan, veri limitini kullanicinin belirledigi
        // String, class, Array, interface
        String carModel = "Audi"; // Cift tirnak kullanilir, Data type in bas harfi büyük harfle yazilir
        Variables var = new Variables(); // class Variables tan var isminde bir object create edildi
        // Arrays
        String[] stringArray = {"a", "2", "java"};
        int[] integerArray = {1,5,100};
        char[] charArray = {'a','(','ß'};

        // Concatenation : String tabanli ekleme, + isareti ile birlestirme
        // Eger eklenenlerden en az birisi String ise, + isareti concatenation yapar
        // integerler arasinda toplama yapar
        System.out.println("Siniftaki ogrenci sayisi : " + 1 + 2);
        // OUTPUT : Siniftaki ogrenci sayisi : 12

        System.out.println("Siniftaki ogrenci sayisi : " + (1 + 2));
        // OUTPUT : Siniftaki ogrenci sayisi : 3

        // multiline coklu variable decleration
        int i1, i2, i3=5;
        //int i4, String str; // Compile error: virgulle ayrilan bir satirda sadece bir data type ve sadece 1 kez yazilabilir
        //int i5, int i6; // Compile Error: 2 kez int kullanildigi icin
        int i7; int i8; // noktali virgulden dolayi ayri satir gibi degerlendirilir

        // !!! Asagidaki bir kural degildir, yani java HATA VERMEZ (TEAMÜL) !!!
        // HINT : Javada, camelCase kullanilir.
        // Variables kücük harfle baslar, sonraki gelen kelimeler büyükharfle baslar
        // Class ismi, büyük harfle baslar, sonraki gelen kelimeler de büyük harfle baslar

        // RULES : asagidaki kurallara uyulmazsa, Java compile error verir
        // - variable ismi sadece a-z.A-Z,_$ karakterleri ile baslayabilir
        // - Icerisinde a-z,A-Z,_.$ ve rakamlar olabilir
        // _ ve $ haricinde karakter barindiramaz
        // Java reserved keyword lerini alamaz : class, int, short

        // TEAMÜL : final keyword une sahip degiskenler büyük harfle yazilir
        final String NAME = "Java";
        // NAME = "Programming"; // Compile Error : final keyword une sahip degisken, degistirilemez
        final String NAME_GUEST;
        NAME_GUEST = "Python";

        final double pi=3.14; // kücük harfle yazilirsa, hata vermez, teamülden büyük harfle yazilir
    }
}
