package day_047_hakan;

import java.util.*;

public class SortingNumbers {

    public static void main(String[] args) {
        int[] numbers = {100,43,90,3,25,50};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        List<Integer> numList = new ArrayList<>(Arrays.asList(100,43,90,3,25,50));
        Collections.sort(numList);
        System.out.println(numList);

    }
}
