package day_027_Exmpls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AL5_a {
    /*
    5. Üstteki ArrayList sonucunu azalan ve artan olacak sekilde siralayip yazdiriniz.
a. Collections.sort method kullanarak
b. For loop kullanarak yaziniz.
     */
    public static void main(String[] args) {

        ArrayList<Integer> inputList=new ArrayList<>(Arrays.asList(1,2,13,24,30,40,17,20,25));

        int limit=25;

        ArrayList<Integer> outputList=new ArrayList<>();

        for (int each: inputList
        ) {
            if (each<=25){
                outputList.add(each);
            }
        }

        Collections.sort(outputList);
        System.out.println(outputList);

        Collections.sort(outputList, Collections.reverseOrder());
        System.out.println(outputList);


    }
}
