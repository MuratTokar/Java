package day_047_hakan;

import java.util.*;

public class RemoveDuplicatedItems {

    public static void main(String[] args) {
        /**
         * Verilen bir arraydeki duplicate edilen elemanlari cikarin
         */

        // Set ile...

        int[] numbers = {1,2,2,3,4,5,3,4};
        Set<Integer> numSet = new HashSet<>();
        for (int num : numbers){
            numSet.add(num);
        }
        System.out.println(numSet);

        // Array to  ArrayList
        List<Integer> numList_1 = new ArrayList<>();
        for (int num : numbers){
            numList_1.add(num);
        }
        System.out.println("numList_1 : " + numList_1);

        // remove duplicated numbers
        List<Integer> numList_2 = new ArrayList<>();
        for (int num : numbers){
            if(!numList_2.contains(num)){
                numList_2.add(num);
            }
        }
        System.out.println("numList_2 : " + numList_2);


    }
}
