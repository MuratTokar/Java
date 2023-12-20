package day_062_hakan;

import java.util.ArrayList;
import java.util.List;

public class Q30 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        // {"Robb", "Bran", "Rick"} set olsaydi
        // {"Robb", "Bran", "Rick", "Bran"}
        // names.removeAll(Collections.singleton("Bran")); // remove all "Bran" elements
        // names.removeIf(s-> s.equals("Bran"));
        // names.removeIf("Bran"::equals);
        if(names.remove("Bran")){
            names.remove("Jon");
        }

        // {"Robb", "Rick", "Bran"}
        System.out.println(names);
    }
}
