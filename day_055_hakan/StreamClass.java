package day_055_hakan;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Davut","Turgut", "Alper", "Haldun", "Selvi","Said","Busra","Abdullah"));

        list.forEach(System.out::println); // prints each value

        list.stream().forEach(v -> {
            System.out.println("Hello " + v);
        });

        // 'S' harfi ile baslayanlari yazdir
        list.stream()
                .filter(v -> v.startsWith("S"))
                .forEach(System.out::println);

        List<String> list2 = list.stream()
                .filter(v -> v.startsWith("S"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        list2.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"bir");
        map.put(2,"iki");

        Stream.of(map)
                .filter(m -> m.containsKey(3))
                .forEach(k -> k.forEach((i,v) -> {
            System.out.println("Key " + i);
            System.out.println("Value " + v);
        }));



        // TASK
        /**
         *  'a' veya 'A' harfini iceren isimleri, UPPERCASE e cevirip, bir listeye atayalim, sonra da yazdiralim
         */

        System.out.println("******** h Contains List *********");

        List<String> containsHList = list.stream()
                .filter(v -> v.contains("H") || v.contains("h") )
                .map(String::toUpperCase)
                .toList();

        containsHList.forEach(System.out::println);

    }
}
