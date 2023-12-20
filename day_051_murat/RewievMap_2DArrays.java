package day_051_murat;

import java.util.HashMap;
import java.util.Map;

public class RewievMap_2DArrays {
    /*
    MAP:
    *Pairs of list((String ,Integer,Object) (String,Integer,Objeckt))--->1. key , 2.value yani iki liste halinde olur
    *List:index numaralara göre ,value call edilebilir
    * set:index numalari yoktur,karisk bir sekilde geliyor,icerisinde duplicate yani aynisinda ikinciye musade etmez
    *primitive data tipi alamaz

    *KEY:
    * List icin bir(Arraylist in) index gibi ,Set icinde bir HashSet gibi
    -keyler index numarasi gibi ,valuelere ulasmak icin kullanilir
    -Key ler dublicate edilmez(keyset)

    *VALUE:object,String,Integer,ClassName
    -Key gibi primary degillerdir,dublicate edilebilir

    Map<Integer,String> map=new HashMap<>();
    Map-SortedMap(interface)-TreeMap(class) elemanlari sorted bir sekilde muhafaza ediyordu
    Map-HashMap class -asynchronized-non thread -safe   -faster
    Map-HaschTable- (Stack,Vector,) synchronized-thread safe   -slower

     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // map.get(Key);  value getirir
        // map.keySet(); key lerden oluisan bir set döner
        // map.values(); List of values
        // map.containsValue(value); true vya falls döner.yani bu value var mi yok mu
        // map.containsKey(key); fals yda true döner
        // map.size();--size(length) of map
        // map.replace(key,newvalue); keyde ki value yerine newValue degerini yazar
        // map.replace(key,oldValue,new value); key ve old value degerlerine sahip elemanin yerine key ve newvalue degerini yazar
        // map.remove(key);  remove edilen value degerini döner
        //map.remove(key,oldValue);  true veya falls döner
        // map.clear();map i tamamen siler
        //map.entrySet(): set of entries
        //map.isEmpty(); size =0 ise true
        //map.put(key,value);  list.add(value); gibi yada list.add(index,value)
        // map.putAll(map2); list.addAll (list2); gibi buraya baska liste ekleriz

        for (Integer key : map.keySet()) {// en cok bu tercih edilir.hem key hemde value var
            map.get(key);// value
        }
        for (String value : map.values()) {
            // sadece values ulasailabilir,key ulasilmaz

        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {// class in icindeki ikilileri entryset olarak tutuyor.sonra tek tek cagiriyo
            entry.getKey(); // key degerini
            entry.getValue();// value degerini elde ederiz

        }
        /*
        2D ARRAYS:
        ARRAYS:
        Arrays primitive ve object olabilir
        fixed-lenght
        kendi hazir metotlari yok





        ARRAYLIST:
        sadece object kabull eder
        dynamic -length (initialized oldugunda arkada 10 uzunlugunda bir array ile calisr
        Arka planda array ile calisir)
        kendi data scructure yapisindan dolayi methodlari vardir


        *Object[][] objectArr2D;
        Integer[][] integerArr2d={{i00,i01,i02,i03,i04,},{i10,i11,i12,i13,i14},{i20,i21,i22}}
        String[][] strinArr2D;
         */
        System.out.println("***************************");
        int[][] numbers={{0,1,2,3,4},{5,6,7,8},{9}};
        for (int[] arr:numbers){
            for (int a:arr){
                System.out.println(a);
            }
        }
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.println("numbers ["+i+"]["+j+"] = " + numbers[i][j]);

            }

        }
    }
}