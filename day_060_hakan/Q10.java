package day_060_hakan;

public class Q10 {
    public static void main(String[] args) {
        int var1 = 200;
        System.out.print(doCalc(var1)); // 400
        System.out.print(" " + var1); // 200


        StringBuilder str1 = new StringBuilder("Java");

        System.out.println(strTest(str1));
        System.out.println(str1);

    }

    static int doCalc(int var1){
        var1 = var1*2;
        return var1;
    }

    static StringBuilder strTest(StringBuilder str){
        str = str.append(" the best");
        return str;
    }

}

/**
 * bir variable, method icerisinde gonderildiginde,
 * o method un icerisinde yapilan degisiklikler,
 * variable in orjinal degerini etkilemez.
 *
 * FAKAT : Bu variable bir object(String haric) ise, mesela array ise,
 * referance noktasi tasindigi icin,
 * icerisindeki degerler degisir ve orjinal degerler degismis olur...
 *
 */
