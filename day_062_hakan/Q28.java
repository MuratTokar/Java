package day_062_hakan;

import java.util.*;

public class Q28 {
    public static void main(String[] args) {
        String[] arr = {"Hi","How","Are","You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf(s -> {
            System.out.print(s);
            return s.length()<=2;
        })){
                System.out.println(" removed");
        }

        System.out.println("\n" + arrList);
        // 1. thread
        // s = "Hi"
        // "Hi" print
        // "Hi".lenth() <= 2 ise remove "Hi" true

        // 2. thread
        // s = "How"
        // "How" print
        // "How".lenth() <= 2 ise remove "How" false

        // 3. thread
        // s = "Are"
        // "Are" print
        // "Are".lenth() <= 2 ise remove "Are" false

        // 4. thread
        // s = "You"
        // "You" print
        // "You".lenth() <= 2 ise remove "You" false

        // Yukaridaki elemanlardan en az biri sarti sagliyor ve removeIf ile cikarildi ise,
        // if condition true doner ve elemanlar bittikten sonra, if in code block una girer ve calistir
        // EGER, elemanlardan hic biri bu sarti saglamiyor ise,
        // o zaman removeIf false doner ve if in code block una girmeden code u bitirir.


        //arrList.removeIf(k -> 2 <= k.length());
        //System.out.println(arrList);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        map.forEach((k,v)-> {System.out.println("key : " + k); System.out.println("value : " + v);});

    }

    // removeIf(s -> code block; return condition;)
    // Her bir eleman icin icerideki kodu calistirir
    // Eleman condition saglaniyor ise, o elemani remove eder
    // elemanlar bitmeden removeIf methodu calismayi durdurmaz
    // Sonunda, eger listedeki elemanlardan en az biri sartlari sagliyor ise
    // true doner
    // hic bir eleman sartlari saglamiyor ise false doner


}
