package extraCalismalarim;

import java.util.Arrays;

public class IlkerHoca_Array {
    public static void main(String[] args) {
        String a="asdc 123 .,,,,?#*+";
        System.out.println(a.replaceAll("\\s","*")); //"asdc 123 .,,,,?#*+" //asdc*123*.,,,,?#*+
        System.out.println(a.replaceAll("\\S","*")); //**** *** *********
        System.out.println(a.replaceAll("\\d","*")); //asdc *** .,,,,?#*+
        System.out.println(a.replaceAll("\\D","*")); //*****123**********
        System.out.println(a.replaceAll("\\w","*")); //**** *** .,,,,?#*+
        System.out.println(a.replaceAll("\\W","*")); // asdc*123**********
        System.out.println(a.replaceAll("\\p{Punct}","*")); //asdc 123 *********
        System.out.println(a.replaceAll("\\p{P}","*")); //asdc 123 ********+


        int[] x={9,0,1,47,9,44};
        int[] y={9,0,1,47,9,44};

        // equels
        System.out.println(Arrays.equals(x, y));

        //ToString
        System.out.println(Arrays.toString(x));

        //deepToString
        int[][] z={{1,3,5},{2,4,6}};
        System.out.println(Arrays.deepToString(z));
        //short
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));


        //copyOf
        int[] k=Arrays.copyOf(x,x.length);

        //binarySearch
        System.out.println(Arrays.binarySearch(x,1));
        System.out.println(Arrays.binarySearch(x,6));

        //length// arama

        //forEach:sinirlari belli olmayanlari döngüye koyar
        for (int l : x) {

        }

        //split



        System.out.println(Arrays.equals(x, y));
    }
    }
