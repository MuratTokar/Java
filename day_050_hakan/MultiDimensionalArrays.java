package day_050_hakan;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        /**
         * Arrays
         * - fixed-length
         * - primitive ve objects
         * - kendi hazir data structure methodlari yoktu
         * - performans olarak daha hizli, cunku sabit bir uzunluga sahip oldugu icin
         * - Generic islemleri yapilamaz
         *
         * ArrayList
         * - dynamic-length
         * - Objects
         * - kendi methodlari var
         * - performans olarak daha yavas (arka planda array yapisi, ilk olusturuldugunda 10 uzunlugunda olan bir array,
         *      kullandigi icin, ilk 10 nesnede, hizli, daha sonralari daha yavas)
         * - Generic K,T islemleri yapilabilir
         */

        String[] names = {"Turgut","Haldun","Enes","Alper","Said"};

        for(int i=0; i<names.length; i++){
            System.out.println((i+1) + ". name : " + names[i]);
        }

        String[] keys = new String[3];
        System.out.println(keys[1]);

        // String[arrayilarin indexini verir][arraylerin icindeki elementlerin indexini]
        //String[][] names2 = {{"Turgut","Haldun","Enes","Alper"},{"T","H","E","A","S"},{"1","2","3","4","5","6"}};
        Object[][] names2 = {{"Turgut","Haldun","Enes","Alper"},{"T","H","E","A","S"},{1,2,3,4,5,6}};
        // String[][] names2 = { {[0][0],[0][1],[0][2],[0][3]}  ,   {[1][0],[1][1],[1][2],[1][3],[1][4]}   ,  {[2][0],[2][1],[2][2],[2][3],[2][4],[2][5]}   };
        System.out.println(names2[0][0]);
        System.out.println(names2[0][1]);
        System.out.println(names2[0][2]); // Enes
        System.out.println(names2[0][3]);
        System.out.println("Array 0 length : " + names2[0].length);
        // Eksik olan array elementini null tamamlamaz
        //System.out.println(names2[0][4]); // Said

        System.out.println(names2[1][0]);
        System.out.println(names2[1][1]);
        System.out.println(names2[1][2]); // E
        System.out.println(names2[1][3]);
        System.out.println(names2[1][4]); // S
        System.out.println("Array 1 length : " + names2[1].length);

        System.out.println(names2[2][0]);
        System.out.println(names2[2][1]);
        System.out.println(names2[2][2]); //
        System.out.println(names2[2][3]);
        System.out.println(names2[2][4]); //
        System.out.println(names2[2][5]); //
        System.out.println("Array 2 length : " + names2[2].length);

        // Multidimensional arraylerde, arrayler ayni uzunlukta olmak zorunda degil, fakat, eksik uzunluktaki arrayin elemanlari "null" degeri atanmaz

        System.out.println("********** multidimensional array for loop **********");
        for(int i=0; i < names2.length; i++ ){
            for(int j=0; j< names2[i].length; j++){
                System.out.println("names2["+i+"]["+j+"] = " + names2[i][j]);
            }
        }
    }
}
