package day_028_hakan;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {

    // Array gibi birden fazla datayi icerisinde tutabilen data havuzudur
    // Arraylist, primitive data tiplerini tutamaz, autoboxing yaparak,
    // object e cevirip muhafaza eder
    // Arraylist : Otomatik genisleme ve daralma özelligi vardir
    // Array : Uzunlugu sabit
    // ArrayList : elemani silebilir, arraylisti kisaltabilirsiniz
    // Array : elemanin degerini silebilirim, elamnin index i orada kalir
    // ArrayList : default olarak 10 uzunlugunda bir liste olusturur

    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println(numbers.length); // 5
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums.size()); // 0

        System.out.println("**************** add(value) **************");
        System.out.println("**************** add(index, value) **************");
        // add()
        // tek bir eleman eklemek icin kullanilir
        // son index ten itibaran eklemeye baslar
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(0);
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        System.out.println(nums2.size());
        System.out.println(nums2.toString());

        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(8,9,10));
        System.out.println(nums3.size());
        System.out.println(nums3.toString());
        nums3.add(7); // son index e ekledi
        nums3.add(0, 7); // basa ekledi
        System.out.println(nums3.toString());


        System.out.println("**************** addAll() **************");
        // addAll()
        // bir veya birden fazla elemani eklemek icin kullanilir(liste olarak)
        // eklemeye son indexten baslar
        nums2.addAll(Arrays.asList(4,5,6,7));
        System.out.println(nums2.toString());
        // nums2.addAll(3); compile Error, 3 yerine cünkü liste bekliyor

        nums2.addAll(nums3);
        System.out.println(nums2.toString());

        System.out.println("**************** clear() **************");
        // clear()
        // bütün elemanlari temizler, siler
        ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(0,1,2));
        System.out.println(nums4.toString());
        nums4.clear();
        System.out.println(nums4.toString());

        System.out.println("**************** remove(index) **************");
        // remove(index)
        // belirtilen indexteki elemani önce return eder, sonra listeden siler
        ArrayList<Integer> nums5 = new ArrayList<>(Arrays.asList(0,1,2));
        System.out.println(nums5.toString());
        System.out.println(nums5.remove(2));
        System.out.println(nums5.toString());

        System.out.println("**************** List.removeAll(cikarilacakList) **************");
        // removeAll()
        // A.removeAll(B) -> A listesinden, B listesini cikarir, returns true
        ArrayList<Integer> nums6 = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        ArrayList<Integer> nums7 = new ArrayList<>(Arrays.asList(2,5));
        System.out.println(nums6.toString());
        System.out.println(nums7.toString());
        System.out.println(nums6.removeAll(nums7));
        System.out.println(nums6.toString());
        System.out.println(nums7.toString());

        System.out.println("**************** indexOf(value) **************");
        // indexOf() like search, bulamazsa -1, varsa index numarasini döner
        // A.indexOf(deger) -> returns index number
        ArrayList<Integer> nums8 = new ArrayList<>(Arrays.asList(0,1,2,3,4));
        System.out.println(nums8.toString());
        System.out.println("index Number : " + nums8.indexOf(2)); // returns index number rof the value

        System.out.println("**************** get(index) **************");
        // get()
        // array[2]
        // A.get(index) -> belirtilen indexteki value
        ArrayList<Integer> nums9 = new ArrayList<>(Arrays.asList(0,1,2,3,4));
        System.out.println(nums9.toString());
        System.out.println("Value : " + nums9.get(2)); // returns value, verilen indexteki

        System.out.println("**************** set(index, newValue) **************");
        // set()
        // array[5] = 10;
        ArrayList<Integer> nums10 = new ArrayList<>(Arrays.asList(0,1,2,3,4));
        System.out.println(nums10.toString());
        nums10.set(2, 5); // 2.indexteki degeri 5 ile degistirecek
        System.out.println(nums10.toString());

    }

}
