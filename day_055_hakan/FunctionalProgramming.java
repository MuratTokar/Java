package day_055_hakan;

import java.util.HashMap;
import java.util.Map;

public class FunctionalProgramming {
    /**
     * OOP programlama dillerinin, scripting language dillerine benzedigi kisimlar.
     * Function() -> anlik ihtiyaclari giderebilmek icin gelistirilmis functional kodlardir
     *
     */

    public static void main(String[] args) {
        //System.out.println("Toplama sonucu : " + topla(3, 5));
        //System.out.printf("Toplama sonucu : %d", topla(3, 5));

        int sum = topla(3, 5);
        int total = multiply(sum, 5);
        System.out.println("Total : " + total);

        // int total = ({int sum = topla(a,b) -> (a + b) } -> { multiply(sum, 5) -> sum * 5;})

        // String name = "";
        // myFunction mf = ()

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"bir");
        map.put(2,"iki");
        map.put(3,"uc");
        map.put(4,"dort");

        for(Integer key : map.keySet()){
            System.out.println(key + " : " +map.get(key));
        }
        map.forEach( (k,v) -> System.out.println("key : " + k + " - value : " + v)   );

        FunctionalProgrammingPrint fpp = (name) -> {
            return "Hello " + name;
        };

        System.out.println(fpp.greeting("Said"));

        FunctionalProgrammingPrintWithout fpp2 = (name) -> {
            return "Hello " + name;
        };

        System.out.println(fpp2.greeting("Said"));


    }

    public static int topla(int a, int b){
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

}
