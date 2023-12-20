package day_047_hakan.SetClasses;

import java.util.Set;
import java.util.TreeSet;

public class SortedTreeCollections {
    public static void main(String[] args) {
        Set<String> cities = new TreeSet<>();
        cities.add("Munich");
        cities.add("Augsburg");
        cities.add("Nurnberg");
        cities.add("Ingolstadt");

        System.out.println(cities);
    }
}
