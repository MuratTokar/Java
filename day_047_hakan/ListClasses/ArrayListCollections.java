package day_047_hakan.ListClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCollections {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        //ArrayList<String> citiesArrayListSingle = new ArrayList<>();
        cities.add("Munich");
        cities.add("Augsburg");
        cities.add("Nurnberg");
        cities.add("Ingolstadt");

        System.out.println(cities.get(1)); // index number ile cagrilabilir
        cities.remove(2); // to remove 2.index of element
        cities.remove("Auhsburg");
        cities.removeAll(Arrays.asList("Augsburg","Munich"));
        cities.size(); // size of list
        cities.contains("Ingolstadt"); // true - false
        cities.indexOf("Ingolstadt"); // int, index of item
        cities.addAll(Arrays.asList("Landshut")); // liste olarak eklemek icin


    }
}
