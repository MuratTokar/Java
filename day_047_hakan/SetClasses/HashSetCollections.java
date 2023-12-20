package day_047_hakan.SetClasses;

import java.util.*;

public class HashSetCollections {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Munich");
        cities.add("Augsburg");
        cities.add("Nurnberg");
        cities.add("Ingolstadt");

        // cities.get(1) index ile item cagrilamaz
        // Cunku, insertion order not preserved, aklerken, siralama muhafaza edilmiyor

        cities.addAll(Arrays.asList("Landshut")); // list olarak eklemek icin kullanilir
        cities.contains("Munich"); // true false
        cities.remove("Munich");
        System.out.println(cities.containsAll(Arrays.asList("Munich", "Landshut"))); // check list contains in the set
        // cities.equals() iki seti kiyaslamak icin kullanilir
        System.out.println(cities.hashCode());
    }
}
