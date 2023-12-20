package day_28_murat;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        // Array gibi birden fazla datayi icerisinde tutabilen data havuzudur
        // Arraylist, primitive data tiplerini tutamaz, autoboxing yaparak,
        // object e cevirip muhafaza eder
        // Arraylist : Otomatik genisleme ve daralma özelligi vardir
        // Array : Uzunlugu sabit
        // ArrayList : elemani silebilir, arraylisti kisaltabilirsiniz
        // Array : elemanin degerini silebilirim, elamnin index i orada kalir
        // ArrayList : default olarak 10 uzunlugunda bir liste olusturur

        int[] numbers=new int[5];
        System.out.println(numbers.length);

        ArrayList<Integer> nums=new ArrayList<Integer>();
        System.out.println(nums.size());
        System.out.println("**************** add(value) **************");
        System.out.println("**************** add(index, value) **************");

        // add()
        // tek bie lelman klemek icin kullanilir
        // son endex ten itibaren eklemeye baslar
         //index degeri verip arayada ekleriz
         // addAll
        // addAll=liste olarak deger ekler
        // bir veya birden fazla elemani eklemek icin kullannir
        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.add(0);
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        System.out.println(nums2.size());// uzunlugunu verir
        System.out.println(nums2.toString());// liste halinde yazdiririr

        nums2.addAll(Arrays.asList(4,5,6,7));// daha sonra yeni elemanlari addAll metodu ile ekleriz
        System.out.println(nums2.toString());// eklenen yeni elemanlarin listesi icin
        System.out.println("+++++++++++++++++++++nums3+++++++++++++++++++++++++++++++++++++++++");
        ArrayList<Integer> nums3=new ArrayList<>(Arrays.asList(1,2,3,4));// listrmiz hazir ise böylede ekleriz ve nums3 icine atar
        System.out.println(nums3.size());
        System.out.println(nums3.toString());
        System.out.println("+++++++++++++++++++++nums4+++++++++++++++++++++++++++++++++++++++++");
        ArrayList<Integer> nums4=new ArrayList<>(Arrays.asList(8,9,10,11));
        System.out.println(nums4.size());
        System.out.println(nums4.toString());
        System.out.println("+++++++++++++++++++++nums4 ü nums3 e ekledik +++++++++++++++++++++++++++++++++++++++++");
       nums2.addAll(nums4);// nums4 listesini nums2 ye ekledik
        System.out.println(nums2.size());
        System.out.println(nums2.toString());

        System.out.println("#######################   clear    ######################################################");
ArrayList<Integer> nums5=new ArrayList<>(Arrays.asList(5,6,8,9));
        System.out.println(nums5.toString());

        nums5.clear();// listedeki tüm elemanlari sildi
        System.out.println(nums5.toString());

        System.out.println("#######################   remove    ######################################################");
        // istedigimiz elemanin index numarsini verip istedigimiz elemani sileriz.remove(index)
        ArrayList<Integer> nums6=new ArrayList<>(Arrays.asList(7,3,5,68));
        System.out.println(nums6.toString());
        nums6.remove(2);
        System.out.println(nums6.toString());
        System.out.println("#######################   removeAll    ##################################################");
        ArrayList<Integer> nums7=new ArrayList<>(Arrays.asList(2,8,6,9,4,5,1));
        System.out.println(nums7.toString());

        ArrayList<Integer> nums8=new ArrayList<>(Arrays.asList(2,8,1));
        System.out.println(nums8.toString());
        System.out.println(nums7.removeAll(nums7));// true yada fallse döner ve listeyi siler
        System.out.println(nums7.toString());
        System.out.println(nums7.removeAll(nums8));
        System.out.println("#######################   indexOf ##################################################");
        ArrayList<Integer> nums9=new ArrayList<>(Arrays.asList(2,8,6,9,4,5,1));
        System.out.println(nums9.toString());
        System.out.println(nums9.indexOf(2));// index numarsi döner yani deger  veririiz index i döner
        System.out.println("#######################   get ##################################################");
        // index i veririz degeri döner
        ArrayList<Integer> nums10=new ArrayList<>(Arrays.asList(2,8,6,9,4,5,1));
        System.out.println(nums10.toString());
        System.out.println(nums10.get(2));
        System.out.println("#######################   set ##################################################");
        ArrayList<Integer> nums11=new ArrayList<>(Arrays.asList(2,8,6,9,4,5,1));
        System.out.println(nums11.toString());
        System.out.println(nums11.set(1, 5));
        System.out.println(nums11.toString());
        // set ile degistirme yapilir
    }

}
