package homework_27;

import java.util.ArrayList;

public class Q_3 {
    /*
   3. Verilen bir ögrenci listesinden, verilen bir ismi cikaran ve kalan ögrencilerin isimlerini
yazdiran programi yaziniz.
Ögrenci listesi : (“Ahmet“,“Mehmet“,“Ayse“,“Fatma“,“Naciye“)
Cikarilacak isim : “Naciye“
Sonuc : (“Ahmet“,“Mehmet“,“Ayse“,“Fatma“)
Not : Cikarilacak isim, listede birden fazla bulunabilir ve hepsinin cikarilmasi gerekir.
    */
    public static void main(String[] args) {

        ArrayList<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Ahmet");
        ogrenciList.add("Mehmet");
        ogrenciList.add("Ayse");
        ogrenciList.add("Fatma");
        ogrenciList.add("Naciye");
        ogrenciList.add("Naciye");

        String cikarilacakIsim = "Naciye";


        // 1. yol

        for (String each : ogrenciList
        ) {
            each = each.replaceAll(cikarilacakIsim, "");
            System.out.println(each);
        }


        // 2. yol

        ArrayList<String> kalanOgrenciList = new ArrayList<>();

        for (String each : ogrenciList
        ) {
            if (!each.equals(cikarilacakIsim)) {
                kalanOgrenciList.add(each);
            }

        }
        System.out.println(kalanOgrenciList);
    }
}