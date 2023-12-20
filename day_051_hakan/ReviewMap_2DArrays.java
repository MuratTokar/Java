package day_051_hakan;

import java.util.HashMap;
import java.util.Map;

public class ReviewMap_2DArrays {
    /**
     * Map
     *Pairs of List (String, Integer, Object)(String, Integer, Object)) -> KEY, VALUE
     * List : index numberlara gore, values call edilebilir
     * Set : Index numaralari yoktu, karisik bir sekilde geliyor, icerisinde duplicate e musaade edilmiyor
     * - primitive data tipleri almaz, list gibi
     *
     * KEY : List icin bir (ArrayList in) index gibi, Set icin de bir HashSet gibi
     *      - Key'ler index numarasi gibi, value lara ulasmak icin kullanilir
     *      - Key ler duplicate edilemez (keySet)
     *
     * VALUE : Object, String, Integer, ClassName
     *         - Key gibi primary degillerdir, duplicate edilebilir
     *
     * Map<Integer, String> map = new HashMap<>();
     *
     * Map - SortedMap (Interface) - TreeMap (Class) elemanlari sorted bir sekilde muhafaza ediyordu
     * Map - HashMap class - asynchronized - non thread-safe            - faster
     * Map - HashTable - (Stack, Vector) synchronized - thread safe     - slower
     *

     * 2D Arrays
     *  - Arrays
     *      - primitive ve object alabilir
     *      - fixed-length
     *      - kendi hazir methodlari yoktur
     *
     *  - ArrayList
     *      - sadece object kabul eder
     *      - dynamic-length (initialized oldugunda arkada 10 uzunlugunda bir array ile calisir)
     *      - Arka planda Array ile calisir
     *      - Kendi data structure yapisindan dolayi methodlari vardir
     *
     *  Object[][] objectArr2D;
     *  Integer[][] integerArr2D = {  {i00,i01,i02,i03,i04}  ,  {i10,i11,i12,i13,i14}  ,  {i20,i21,i22}  };
     *  String[][] stringArr2D;

     */

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // map.get(KEY); -> value
        // map.keySet(); -> Keylerden olusan bir Set donuyor
        // map.values() -> List of values
        // map.containsValue(value); -> boolean true,false
        // map.containsKey(key); -> boolean true,false
        // map.size(); -> size(length) of map
        // map.replace(key, newValue); -> key deki value yerine newValue degerini yazar
        // map.replace(key, oldValue, newValue); -> key ve oldValue degerlerine sahip elemanin yerine. key ve newValue degerini yazar
        // map.remove(key); -> remove edilen value degerini doner
        // map.remove(key, oldValue) -> key ve oldValue degerine sahip elemani cikarir, boolean doner
        // map.clear(); -> map i tamamen bosaltir
        // map.entrySet(); -> set of entries
        // map.isEmpty(); -> size = 0 ise, true
        // map.put(key, value); -> list.add(value) list.add(index, value)
        // map.putAll(map2); -> list.addAll(list2) gibi kullanilir

        for(Integer key : map.keySet()){
            map.get(key); // value
        }

        for(String value : map.values()){
            // sadece values ulasilabilir, key ulasilamaz
        }

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            entry.getKey(); // key degerini
            entry.getValue(); // value degerini elde edebiliriz
        }

        System.out.println("********** Arrays 2D ***********");
        int[][] numbers = {{0,1,2,3,4}, {5,6,7,8}, {9}};

        // foreach array 2D
        for(int[] arr : numbers){
            for(int a : arr){
                System.out.println(a);
            }
        }

        // for loop arrays 2D
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.println("numbers["+i+"]["+j+"] = " + numbers[i][j]);
            }
        }

    }
}
