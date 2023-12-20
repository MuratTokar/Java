package day_027_Exmpls;

import java.util.ArrayList;
import java.util.Arrays;

public class AL4 {
    /*
    4. Verilen bir int ArrayList inde, verilen limitin üzerindeki sayilari cikaran ve kalan sayilari
yazdiran programi yaziniz.
Input : (1, 2, 13, 24, 30, 40, 17, 20, 25) limit : 25
Output : (1, 2, 13, 24, 17, 20, 25)
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

        System.out.println(outputList);

    }
}
