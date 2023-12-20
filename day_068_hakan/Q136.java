package day_068_hakan;

import java.util.ArrayList;
import java.util.List;

public class Q136 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0,"Java"); // update
       //  {"Java", "Expert"}
        arrayList.forEach(a -> a.concat("Forum")); // etkisiz line
       // arrayList.forEach(a -> {a = a.concat("Forum");}); // etkisiz line
        arrayList.replaceAll(s -> s.concat("Group"));
       // arrayList.replaceAll(s -> "Group");
        //  {"JavaGroup", "ExpertGroup"}
        System.out.println(arrayList);
    }
}
