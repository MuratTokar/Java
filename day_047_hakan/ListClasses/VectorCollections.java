package day_047_hakan.ListClasses;

import java.util.Stack;
import java.util.Vector;

public class VectorCollections {
    public static void main(String[] args) {
        Vector<String> cities = new Vector<>();
        cities.add("Munich");
        cities.add("Augsburg");
        cities.add("Nurnberg");
        cities.add(null);

        System.out.println(cities.get(1));
        System.out.println(cities.elementAt(3));
        System.out.println(cities.get(3));

        cities.firstElement();
        cities.lastElement();
    }
}
