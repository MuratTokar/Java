package day_009_hakan;

public class ReviewOperators {

    public static void main(String[] args) {
        short a = 5;
        short b = 10;

        //short c = a + b; // Compile Error : aritmetik islemler byte ve short
        // ta tanimli olmadigi icin, bu islemi yaparken, degiskenin data tipi otomatik olarak int e cevirilir
        short c = (short) (a + b); // explicit casting, narrowing

        byte x = 5, y = 15;
        // byte z = x + y; // Compile Error : aritmetik islemler byte ve
        // short ta tanimli olmadigi icin, bu islemi yaparken, degiskenin data tipi otomatik olarak int e cevirilir
        byte z = (byte) (x + y); // explicit casting, narrowing
    }
}
