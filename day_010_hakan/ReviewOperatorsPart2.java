package day_010_hakan;

public class ReviewOperatorsPart2 {
    public static void main(String[] args) {

        // ++ 1 arttir ve -- 1 azalt
        // ++variableName :(pre increment) öncelikle variableName degerini 1 arttiriyor, sonra isleme aliyordu
        // variableName++ :(post increment) variableName degerini isleme al, sonra degerini 1 arttir

        // --variableName :(pre decrement) öncelikle variableName degerini 1 azalt, sonra isleme aliyordu
        // variableName-- :(post decrement) variableName degerini isleme al, sonra degerini 1 azalt

        /*
        int x = 100, y = 15;
        x = x + y; // x = 115 // x += y;

        x = 100, y = 15;
        x = x - y; // x = 85 // x -= y;

        x = 100, y = 15;
        x = x * y; // x = 1500 // x *= y;

        x = 100, y = 15;
        x = x / y; // x = 8 // x /= y;

        x = 100, y = 15;
        x = x % y; // x = 10 // x %= y;

        */

        /*
        Relational Operators
        ** Sonucu her zaman boolean döner : true, false
        4 > 3 -> true
        5 >= 5 -> true
        3 >= 5 -> false
        4 < 3 -> false
        5 <= 5 -> true
        3 <= 5 -> true

        // = assign operatoridir, sagindaki degeri soldaki degiskene atamak icin kullanilir
        // == compare operatoridir, soldaki ve sagdaki degerlerin esit olup olmadigini kiyaslar, sonuc olarak true ya da false döner

        2 == 4 -> false
        5 == 5 -> true

        // ! reverse operator, true ise false a, false ise true ya cevirir.
        !(true) -> false
        !(5 <= 5) -> false

        // != solundaki deger ile sagindaki deger esit ise, false veriyor, diger durumlarda true veriyor
        4 != 5  -> true
        6 != 6 -> false
         */

        /*
        Logical Operators
        &(and, ve) && | || (or, veya, pipe, ya da) ^ (xor, exor)


        &&  veya & ayni sonucu verir, java da islem hacminden tasarruf icin && tercih edilir
        T && T -> T
        T && F -> F
        F && T -> F
        F && F -> F

        a & b // a ve b yi isleme alir, ayri ayri boolean degerlerini hesaplar, sonra and islemi yapar
        false && b // Ilk deger false ise, b ye bakmadan false sonucunu verir
        true && b // Ilk deger true ise, b yi isleme alir, boolean degerini hesaplar, b true ise true, false ise false sonucunu verir

        || veya | olarak kullanilir, java da islem hacminden tasarruf icin || tercih edilir
        T || T -> T
        T || F -> T
        F || T -> T
        F || F -> F

        a | b : java her iki tarafi da degerlendirip, sonucu isleme sokuyor
        true || b : Ilk islem sonucu true oldugu icin, 2. taraftaki sonuca bakmadan, true sonucunu verir
        false || b : Ilk islem false oldugu icin, 2. tarafi degerlendirir, onun sonucuna göre true ise true, false ise false döner

        ^ xor (x ^ y = (x' & y ) | ( x & y') ) // Hint : x' = !x
        ^ xor (x ^ y = (!x & y ) | ( x & !y) ) // Hint : x' = !x
        T ^ T -> F
        T ^ F -> T
        F ^ T -> T
        F ^ F -> F
         */

        boolean x;
        x = 12 - 6 > 4 + 3; // false
        // (-2 + 5 > 5*2) && !true // ( 3 > 10 ) && !true // false && !true // false && false = false

        boolean y;

        y =  true && 5 == 5 || false; // true && true || false

    }
}
