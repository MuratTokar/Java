package day_007_hakan;

public class VariableNamesRules {

    public static void main(String[] args) {
        // a-z, A-Z, '_' ve '$' ilk karakter sadece bunlarla baslayabilir
        // XXX sayi ile baslayamaz
        // _ underscore(alt tire) ve dollar sign $ karakterleri haric, baska karakter alamaz

        String A_$a1s;

        // sayilar ilk karakter haricinde kullanilabilir

        byte string;
        byte String;
        byte Object;
        String Array;
        // String public; compile error
        String Public;
        String True;

        // TASK
        String $2a;
        // first character _ veya $ olmali
        // Second character bir sayi olmali
        // _ $ a-z veya  A-Z

        final int AGE;
        AGE = 50;

         // AGE = 60; compile error final oldugu icin degistirilemez


    }
}
