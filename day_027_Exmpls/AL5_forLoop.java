package day_027_Exmpls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AL5_forLoop {
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

        for (int i = 0; i < outputList.size(); i++) {
            for (int j = 0; j < outputList.size(); j++) {
                if (outputList.get(i)<outputList.get(j)){
                    int cuval=outputList.get(i);
                    outputList.set(i, outputList.get(j));
                    outputList.set(j, cuval);
                }
            }
        }
        System.out.println("Artarak sirala: "+outputList);


        for (int i = 0; i < outputList.size(); i++) {
            for (int j = 0; j < outputList.size(); j++) {
                if (outputList.get(i)>outputList.get(j)){
                    int cuval=outputList.get(i);
                    outputList.set(i, outputList.get(j));
                    outputList.set(j, cuval);
                }
            }
        }
        System.out.println("Azalarak sirala: "+outputList);

    }
}
