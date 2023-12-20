package day_025_Array_methods;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {

        // equels()

        int [] a={1,1,1,1,1,1,1,1,1};
        int [] k=Arrays.copyOf(a, a.length);
        int [] b={9,0,1,4,7,9,9,9,44};

        System.out.println(Arrays.equals(a, b));

        // ToString()

        System.out.println(Arrays.toString(a));

        // deepToString()

        int [][] c={{1,3,5}, {2,4,6}};

        System.out.println(Arrays.deepToString(c));

        // sort()

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        // copyOf()

        // binarySearc()

        System.out.println(Arrays.binarySearch(a, 1));
        System.out.println(Arrays.binarySearch(b, 6));

        // length  == atama



        // split()



        // forEach  == Dongu


        for (int l :  a )
        {

        }







    }

}
