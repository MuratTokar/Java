package day_50_murat;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    /*
    MAP-> ikili data muhafazasi icin kullanilir
    (key,data) ikili data
    testte kullanacagimiz sadece Hasmap tir
    (1,"Murat") (2,"Haldun") (3,"Turgut") (4,"Idris")

    List<String> list=new Arraylist<>(); arrraylari boyle ekliyorduk
    list.add("Murat");
    list.add("Haldun");
    list.add("Turgut");
    list.add("Idris");

    List.get(0);   bu bize murat i getirirdi.index numarasi ile cagirirdik

     */
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"Murat");
        map.put(2,"Haldun");
        map.put(3,"Turgut");
        map.put(4,"Idris");
        map.put(4,"Zafer");// idris yerine zaferi ekledim
        map.put(5,"Zafer");// 5 numaraya zaferi eklerim

        System.out.println("key=1 , value =" + map.get(1));
        System.out.println("key=2 , value =" + map.get(2));
        System.out.println("key=3 , value =" + map.get(3));
        System.out.println("key=4 , value =" + map.get(4));



        // key ler cift olamaz yani iki tane 2 .olamaz

        System.out.println("********foreach map ****");// ustteki gibi yazdiracagiz
        for (Integer k:map.keySet()) {
            System.out.println(" key = " + k + " value = " + map.get(k));

        }
        System.out.println("******** Entry(entry.getKey(),entry.getValue()) foreach map*****");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " value : " + entry.getValue());
        }
        System.out.println("**********Remove******************");
        System.out.println(map.remove(2));// 2.key i siler ve value yi return eder
        System.out.println(map.remove(1, "Murat"));// hem key hemde value siler ve return boolean //true
        System.out.println(map.remove(1, "Murat"));// hem key hemde value siler ve return boolean //falls olur cunku silindi

        // map.clear(); // tum datalari siler
        // map.isEmpty();// boolean true yada falls doner

        System.out.println("contains key : " + map.containsKey(4));// boolean / true
        System.out.println("contains key : " + map.containsKey(1));// booean / falls cunku 1 silinmisti
        System.out.println("contains value : " + map.containsValue("Murat"));// falls doner cunku value silindi
        System.out.println("contains value : " + map.containsValue("Turgut"));// true doner
        System.out.println("************************************************");

        map.replace(3,"Idris");// 3 e git ve idris i ata
        map.replace(3,"Idris","Abdullah");// 3 e git ve value Idris ise Abdullah i ata degilse atama
        for (Integer k: map.keySet()) {
            System.out.println("key = " + k + " value= " + map.get(k));

        }
        System.out.println(" Size " + map.size());// size 3 veririr
        System.out.println(map);// {3=Abdullah, 4=Zafer, 5=Zafer}
        System.out.println(map.values());//[Abdullah, Zafer, Zafer]


    }
}
