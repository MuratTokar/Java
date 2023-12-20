package day_062_mrt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C028 {
    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));

        if (arrList.removeIf(s -> {
            System.out.println(s);
            return s.length() <= 2;
        })) {
            System.out.println("removed");// HiHoweAreYou removed
            //arrList.removeIf(k-> 2 <=k.length());
            //System.out.println(arrList);


            // removeIf(s -> code block; return condition;)
            // Her bir eleman icin icerideki kodu calistirir.Eleman condition  sagliyor ise o elemani remove eder.
            // Ve elemanlar bitmeden removeIf methodu calismayi durdurmaz.sonunda eger listedeki elemanlardanöä
            // en az  biri sartlari sagliyor ise True döner.Hic bir eleman sartlari saglamiyorsa  fallse döner
        }
    }
}