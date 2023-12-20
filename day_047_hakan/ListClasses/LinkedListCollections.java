package day_047_hakan.ListClasses;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListCollections {

    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();
        cities.add("Munich");
        cities.add("Munich");
        cities.add("Augsburg");
        cities.add("Nurnberg");
        cities.add("Ingolstadt");
        System.out.println(cities.lastIndexOf("Munich"));
    }
}
