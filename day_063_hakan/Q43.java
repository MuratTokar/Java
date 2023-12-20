package day_063_hakan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q43 {

    public static void main(String[] args) {
        //String[] arr = ("Hi", "How","Are","You");
        String[] arr = {"Hi", "How","Are","You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        //if(arrList.removeIf(s -> (return s.length() <= 2;))){
        if(arrList.removeIf(s -> s.length() <= 2)){
            System.out.println("removed");
        }

        System.out.println(arrList); // [How, Are,You]
    }
}
