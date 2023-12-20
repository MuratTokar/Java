package day_027_Exmpls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AL1 {
    /*
    1. 2 adet string array listi olusturunuz. Bu listlerden birine (list_5) 5 sehir ismi yaziniz,
digerine(list_10) 10 sehir ismi yaziniz.
a. list_10 daki sesli harfle baslayan sehirleri yazdiriniz.
b. List_10 a list_5 I ekleyiniz.
c. list_5 e 2 sehir ismi daha ekleyip, list_10 dan, list_5 i cikariniz.
d. List_5 i tamamen bosaltiniz.
e. List_10 da sesli harfle baslayan sehirleri, list_5 e ekleyiniz.
f. List_5 de bulunan sehirlerin, list_10 daki index numaralarini yazdiriniz.
g. List_10 daki A harfi ile baslayan sehirleri „Augsburg“ ile degistiriniz.
h. List_5 deki sehirleri harflerine göre siralayiniz. (Collections.sort(list_5))
i. List_5.sort methodu ile ustteki islemi yapip yapamayacaginizi arastiriniz.
     */
    public static void main(String[] args) {

        ArrayList<String> list_5=new ArrayList<>(Arrays.asList("Bursa", "Adana", "Hatay", "Manisa", "Cankiri"));

        ArrayList<String> list_10=new ArrayList<>();
        list_10.add("Trabzon");
        list_10.add("Afyon");
        list_10.add("Malatya");
        list_10.add("Burdur");
        list_10.add("Bartin");
        list_10.add("Bayburt");
        list_10.add("Elaziz");
        list_10.add("Siirt");
        list_10.add("Urfa");
        list_10.add("Hakkari");

        System.out.println("ilk hali: " + list_10);
        System.out.println("ilk hali: " + list_5);

        // a. list_10 daki sesli harfle baslayan sehirleri yazdiriniz.

        for (String each: list_10
             ) {
            if (each.matches("^[AEIOUaeiou].*")){
                System.out.println(each);
            }
        }

        // List_10 a list_5 I ekleyiniz.

        list_10.addAll(list_5);
        System.out.println(list_10);



        list_5.add("Frankfurt");
        list_5.add("Berlin");

        list_10.removeAll(list_5);
        System.out.println(list_10);

        //d. List_5 i tamamen bosaltiniz.

        list_5.clear();
        System.out.println(list_5);

        // e. List_10 da sesli harfle baslayan sehirleri, list_5 e ekleyiniz.
        System.out.println("############################");
        for (String each: list_10
        ) {
            if (each.matches("^[AEIOUaeiou].*")){
               list_5.add(each);
            }
        }
        System.out.println(list_5);


        // f. List_5 de bulunan sehirlerin, list_10 daki index numaralarini yazdiriniz.

        for (String each: list_5
             ) {
            int index= list_10.indexOf(each);
            if (index!=-1){
                System.out.println(each + " index'i: " + index);
            }

        }

        // g. List_10 daki A harfi ile baslayan sehirleri „Augsburg“ ile degistiriniz.

        for (int i = 0; i < list_10.size(); i++) {

            String sehirler= list_10.get(i);
            if (sehirler.startsWith("A")){
                list_10.set(i, "Ausburg");
            }

        }
        System.out.println(list_10);

        // h. List_5 deki sehirleri harflerine göre siralayiniz. (Collections.sort(list_5))

        Collections.sort(list_5);
        System.out.println(list_5);

        //i. List_5.sort methodu ile ustteki islemi yapip yapamayacaginizi arastiriniz.

        list_5.sort(null);
        System.out.println(list_5);


    }
}
