package homework_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Q_1 {


    public static void main(String[] args) {


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
        ArrayList<String> List_5 = new ArrayList<>(Arrays.asList("Adana", "Malatya", "Adiyaman", "Gaziantep", "Istanbul"));
        ArrayList<String> List_10 = new ArrayList<>(Arrays.asList("Ankara", "Konya", "Kayseri", "Elazig", "Denizli", "Kars", "Mus", "Trabzon", "Mersin", "Agri"));

        System.out.println("Orijinal Hali List_5 : " + List_5);
        System.out.println("Orijinal Hali List_10 : " + List_10);

        System.out.println("###################################################################");

        // a. list_10 daki sesli harfle baslayan sehirleri yazdiriniz.
        for (String sehirler : List_10) {
            char sesliHarf = sehirler.charAt(0);
            sesliHarf = Character.toLowerCase(sesliHarf);
            if (sesliHarf == 'a' || sesliHarf == 'e' || sesliHarf == 'i' || sesliHarf == 'o' || sesliHarf == 'u' || sesliHarf == 'ü' || sesliHarf == 'ö') {
                System.out.println(sehirler);
            }

        }
        System.out.println("###########################################################");
        // b.List_10 a list_5 I ekleyiniz.
        List_10.addAll(List_5);
        System.out.println(List_10);

        System.out.println("####################################################");
        // c. list_5 e 2 sehir ismi daha ekleyip, list_10 dan, list_5 i cikariniz.
        List_5.add("Edirne");
        List_5.add("Karaman");
        System.out.println("List_5 eklenen yeni sehirle : " + List_5);

        List_10.removeAll(List_5);
        System.out.println("Liste_10 dan list_5 i cikardik : " + List_10);

        System.out.println("#######################################################");
        //d. List_5 i tamamen bosaltiniz.
        List_5.clear();
        System.out.println("List_5 bosaltildi : " + List_5);

        System.out.println("#######################################################");
        // e. List_10 da sesli harfle baslayan sehirleri, list_5 e ekleyiniz.
        for (String sehirler : List_10) {
            char sesliHarf = sehirler.charAt(0);
            sesliHarf = Character.toLowerCase(sesliHarf);
            if (sesliHarf == 'a' || sesliHarf == 'e' || sesliHarf == 'i' || sesliHarf == 'o' || sesliHarf == 'u' || sesliHarf == 'ü' || sesliHarf == 'ö') {
                List_5.add(sehirler);


            }
        }
        System.out.println("Liste_10 daki sesli harfli sehirlerin List_5 e eklenmesi : " + List_5);

        // f. List_5 de bulunan sehirlerin, list_10 daki index numaralarini yazdiriniz.
        System.out.println("####################################################################");

        for (String sehirler : List_5
        ) {
            int index = List_10.indexOf(sehirler);
            if (index != -1) {
                System.out.println(sehirler + " index'i: " + index);
            }

        }
        System.out.println("#################################################");
        // g. List_10 daki A harfi ile baslayan sehirleri „Augsburg“ ile degistiriniz.

        // h. List_5 deki sehirleri harflerine göre siralayiniz. (Collections.sort(list_5))

        Collections.sort(List_5);
        System.out.println(List_5);

        //i. List_5.sort methodu ile ustteki islemi yapip yapamayacaginizi arastiriniz.

        List_5.sort(null);
        System.out.println(List_5);

    }
}