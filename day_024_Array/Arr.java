package day_024_Array;

import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {

        // array olusturma

        String [] arr1=new String[3];

        arr1[0]="a";
        arr1[1]="b";


        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        String [] arr2={"v", "w"};

        String [] arr3=new String[]{"k", "l", "m"};

        System.out.println(arr3.length);

        int [] inArr={1,2,3};

        int [] intArr2, abc, dsl[];

        int [][] icIceArr={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(icIceArr));


    }
}
