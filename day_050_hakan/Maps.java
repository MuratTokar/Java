package day_050_hakan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    /**
     * MAP -> 2 li (ciftli) data muhafazasi icin kullanilir
     *      - (key, value) (1, "Murat") (2, "Haldun") (3, "Turgut") (4, "Idris")
     *
     *      List<String> list = new ArrayList<>(8);
     *      list.add("Murat");
     *      list.add("Haldun");
     *      list.add("Turgut");
     *      list.add("Idris");
     *
     *      list.get(0); // Murat
     *
     */

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); // key = Integer, value = String
        map.put(1,"Murat");
        map.put(2,"Haldun");
        map.put(3,"Turgut");
        map.put(4,"Idris");
        map.put(4,"Zafer");
        map.put(5,"Zafer");

        System.out.println("key=1 value=" + map.get(1));
        System.out.println("key=2 value=" + map.get(2));
        System.out.println("key=3 value=" + map.get(3));
        System.out.println("key=4 value=" + map.get(4));
        System.out.println("key=5 value=" + map.get(5));

        System.out.println("************* foreach map *************");

        for (Integer k : map.keySet()){
            System.out.println("key=" + k + " value=" + map.get(k));
        }

        System.out.println("************* Entry(entry.getKey(), entry.getValue()) foreach map *************");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }

        System.out.println("************* methods map *************");
        // Methods
        System.out.println(map.remove(2)); // remove key=2 value, and return value // Haldun
        System.out.println(map.remove(1,"Murat")); // remove key=1 value="Murat", and return boolean // true
        System.out.println(map.remove(1,"Murat")); // remove key=1 value="Murat", and return boolean // false

        // map.clear(); // clear all data in map
        //map.isEmpty(); // boolean true/false
        System.out.println("contains key : " + map.containsKey(4)); // boolean -> true
        System.out.println("contains key : " + map.containsKey(1)); // boolean -> false

        System.out.println("contains value : " + map.containsValue("Murat")); // boolean -> false
        System.out.println("contains value : " + map.containsValue("Turgut")); //  boolean -> true

        //map.putAll(map2);
        map.replace(3,"Idris");
        map.replace(3,"Idri", "Abdullah");
        map.replace(3,"Idris", "Abdullah");
        for (Integer k : map.keySet()){
            System.out.println("key=" + k + " value=" + map.get(k));
        }

        System.out.println("size of map : " + map.size());

        System.out.println(map); // {3=Abdullah, 4=Zafer, 5=Zafer}
        System.out.println(map.values()); // [Abdullah, Zafer, Zafer]
    }
}
