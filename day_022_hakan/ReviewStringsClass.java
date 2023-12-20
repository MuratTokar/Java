package day_022_hakan;

import java.util.Arrays;

public class ReviewStringsClass {

    public static void main(String[] args) {
        // String : sequence of chars, karakterler kümesi
        // 2 farkli sekilde String object i olusturulabilir : 'literal', by using 'new keyword'
        // literal : String str = "value";
        // new Keyword : String str = new String("value");

        // literal vs new Keyword

        // literal : string pool a gözgezdir, deger daha önce olusturuldu ise, sadece o degeri yeni variable a refere ediyordu
        // literal : degerler ** String Pool ** a yazilir
        // literal : value lar esitse, reference noktalari da esittir
        // literal : value lar esit ise, str1 == str2 ile str1.equals(str2) ayni sonucu verir

        // new Keyword : bir object olarak, Heap memory de, kendine özgü bir alana sahiptir.
        // new Keyword : yeni object olusurken, Heap kontrol edilmez ve yeni, object e özgü bir alan tahsis edilir
        // new Keyword : value lar esit olsa bile, reference noktalari farklidir
        // new Keyword : value lar esit ise, str1 == str2 -> false dönerken str1.equals(str2) -> true döner

        // literal
        String str1 = "value";
        String str2 = "value";
        System.out.println(str1==str2); // true
        System.out.println(str1.equals(str2)); // true



        // new Keyword
        String str3 = new String("value");
        String str4 = new String("value");
        System.out.println(str3==str4); // false
        System.out.println(str3.equals(str4)); // true

        // String methods
        // equals() // true, false
        String str_1 = "value";
        String str_2 = "value";
        String str_3 = new String("value");
        System.out.println(str_1==str_2); // true
        System.out.println(str_1==str_3); // false
        System.out.println(str_1.equals(str_2)); // true
        System.out.println(str_1.equals(str_3)); // true

        System.out.println("***** CONCAT() *****");
        // concat() -> str1 + str2, concat edilen string yeni degeri almiyor, tekrar atanmadikca
        String str_4 = "value";
        String str_5 = "value";
        str_4.concat(str_5);
        System.out.println(str_4);
        str_4 = str_4.concat(str_5);
        System.out.println(str_4);

        System.out.println("***** replace(arananString, yeniDeger) *****");
        // replace(arananString, yeniDeger) aranan stringi, bulup, degistirmek icin
        String str_6 = "value";
        String str_7 = "dfsdfsd value sdfdsfsdfsdf12 3423545";
        str_7.replace(str_6,"X");
        System.out.println(str_7);
        str_7 = str_7.replace(str_6,"X");
        System.out.println(str_7);

        System.out.println("***** replaceAll(arananString, yeniDeger) *****");
        // str.replaceAll(arananString, yeniDeger)  str icerisindeki tüm aranan string degerlerini bulur ve yeni degerle degistirir
        String strAll = "Bu hayat, Bu kadar acimasiz, olsa da, Bu hayati yasamaliyiz";
        strAll = strAll.replaceAll("Bu", "Neseli");
        System.out.println(strAll);



        System.out.println("***** charAt(index) *****");
        // charAt(index) index : 0 dan baslar, o indexteki string icerisindeki karakteri -> return char
        String str_8 = "dfsdfsd value sdfdsfsdfsdf12 3423545";
        char c = str_8.charAt(5); // s
        String str_9 = str_8.charAt(5) + "";
        System.out.println(str_9);

        System.out.println("***** length() *****");
        // str.length() str stringinin icerisindeki karakter sayisi -> returns int
        String str_10 = "dfsdfsd value sdfdsfsdfsdf12 3423545";
        int lengthOfString = str_10.length();
        System.out.println(lengthOfString);

        System.out.println("***** toLowerCase() *****");
        // str.toLowerCase() str nin icerisindeki harfleri kücük harfe ceviriyor, atanmadan kayit etmiyor
        String str_11 = "BEN JAVAYI COK SEVIYORUM  )(?%&/() 12 3423545";
        str_11 = str_11.toLowerCase();
        System.out.println(str_11);


        System.out.println("***** toUpperCase() *****");
        // str.toUpperCase() stringin icerisindeki harfleri, büyük harfe ceviriyor, atanmadan kayit etmiyor
        String str_12 = "ben javayi cok seviyorum  )(?%&/() 12 3423545";
        str_12 = str_12.toUpperCase();
        System.out.println(str_12);

        System.out.println("***** isEmpty() & isBlank() *****");
        // isEmpty() stringin length i 0 ise true, degilse false
        // isBlank() stringin icerisinde bosluk harici karakter var mi?
        String str_13 = "";
        String str_14 = "  ";
        String str_15 = "  a";

        boolean isEmptyStr_13 = str_13.isEmpty();
        boolean isBlankStr_13 = str_13.isBlank();

        System.out.println(isEmptyStr_13); // true
        System.out.println(isBlankStr_13); // true

        System.out.println(str_14.isEmpty()); // false
        System.out.println(str_14.isBlank()); // true

        System.out.println(str_15.isEmpty()); // false
        System.out.println(str_15.isBlank()); // false

        System.out.println("***** contains() *****");
        // str.contains(arananDeger) arananDeger bulunursa true, bulunmazsa false döner
        String str_16 = "Merhaba";
        boolean arananDegerVarMi = str_16.contains("a");
        boolean arananDegerVarMi2 = str_16.contains("k");
        System.out.println(arananDegerVarMi);   // true
        System.out.println(arananDegerVarMi2);  // false

        System.out.println("***** equalsIgnoreCase() *****");
        // str1.equalsIgnoreCase(str2) str1 ile str2 nin caseSensitive(büyük kücük harfe duyarli) olmadan degerlerini kiyasla
        String str_17 = "MERhaba";
        String str_18 = "merhaba";
        boolean stringlerEsitMi = str_17.equals(str_18); // false
        boolean stringlerBuyukKucukHarfDuyarsizligindaEsitMi = str_17.equalsIgnoreCase(str_18); // true

        System.out.println(stringlerEsitMi);
        System.out.println(stringlerBuyukKucukHarfDuyarsizligindaEsitMi);

        System.out.println("***** trim() *****");
        // str.trim() String in basindaki ve sonundaki bosluklari siler
        String str_19 = "    MERha      ba            ";
        System.out.println(str_19);
        str_19 = str_19.trim();
        System.out.println(str_19);

        System.out.println("***** indexOf() *****");
        // str1.indexOf(aranacakDeger) str1 icerisinde, aranacakDeger in ilk karakter indexini getiriyor -> returns int
        // str1.indexOf(str2, baslangicIndexi) verilen baslangic indexinden sonraki kisimda ara
        // baslangicIndex i, birden fazla arananDeger bulmak icin kullanilir
        String str_20 = "Javasiz hayat, ekmeksiz yemek gibidir.";
        String str_22 = "Javasiz hayat, +902121234567 yemek gibidir.";
        String str_21 = "hayat";
        int indexOfstr = str_20.indexOf(str_21);
        int indexOfstr22 = str_22.indexOf("+");
        System.out.println(indexOfstr);
        System.out.println(indexOfstr22);
        System.out.println(str_20.indexOf("ekmeksiz")); // 15


        System.out.println("***** split() *****");
        // str.split(ayirac) str icerisinde ayiraclara kadar olan kisimlari ayirip, ayri
        // seklinde string array ine yaziyor.
        // aranan elamani cikarip, yerine " " koyar
        // aranan elemanin ilk karakterine kadar kismi bir element
        // aranan elemanin son karakterinden sonraki kismi " " + ayri bir element olarak kabul ediyor
        String str_23 = "Ya bu odev yapilacak ya da bu odev yapilacak ya";
        String str_24 = "Hakan, omer, Mehmet, Ayse, Hakan, Mehmet";
        String[] strArray = str_23.split(" ");
        String[] strArray2 = str_23.split("bu");
        String[] strArray3 = str_24.split("Hakan");
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(strArray2)); // [Ya ,   odev yapilacak ya da ,   odev yapilacak ya]
        System.out.println(Arrays.toString(strArray3)); // [, , omer, Mehmet, Ayse, , , Mehmet]

        System.out.println("***** substring() *****");
        // str.substring( indexBaslangic ) baslangic indexinden sonuna kadar string i al
        // str.substring(indexBaslangic, indexBitis ) baslagic ile bitis arasindaki stringi al
        String str_25 = "Javasiz hayat, +902121234567 yemek gibidir.";
        String phoneNumber = str_25.split(" ")[2];
        System.out.println(phoneNumber);
        int indexOfPlus = str_25.indexOf("+");
        System.out.println(str_22.substring(indexOfPlus,indexOfPlus+13));

        String str_26 = "0123456789";
        System.out.println(str_26.substring(3)); // 3456789
        System.out.println(str_26.substring(3,8)); // 34567
        System.out.println(str_26.substring(0)); // text in tamami
        //System.out.println(str_26.substring(-1)); // run time error

        System.out.println("***** lastIndexOf() *****");
        // lastIndexOf() indexOf() kardes methodlardir, sagdan sola arama yapar, buldugunda aranan kelimenin, ilk karakterinin index ini alir.
        // aranan kelime bulunamadiginda -1 dönerler
        String str_27 = "Ay ve Ay ve Ay";
        int indexOfAy = str_27.indexOf("Ay");
        System.out.println(indexOfAy); // 0
        int lastIndexOfAy = str_27.lastIndexOf("Ay");
        System.out.println(lastIndexOfAy); // 12
        int bulunamayanIndex = str_27.lastIndexOf("Java");
        int bulunamayanIndex2 = str_27.indexOf("Java");
        System.out.println(bulunamayanIndex); // java icermedigi icin -1 doner
        System.out.println(bulunamayanIndex2); // java icermedigi icin -1 doner

        System.out.println("***** startWith() *****");
        // str.startWith(kontrol) str stringinin kontrol ile baslayip baslamadigini
        // str.endsWith(kontrol) str stringinin kontrol ile bitip bitmedigini
        // returns boolean true,false
        String str_28 = "burasi mustur yolu yokustur";
        boolean buIleBasliyorMu = str_28.startsWith("Bu"); // false, case-sensitive
        boolean turIleBitiyorMu = str_28.endsWith("tur"); // true
        System.out.println(buIleBasliyorMu);
        System.out.println(turIleBitiyorMu);


        System.out.println("***** compareTo() *****");
        // compareTo() 2 stringin, basamak basamak kontorlunu yapip, farki gördügünde, character degerlerinin farkini alip. cikiyor
        String str_29= "HBkan";
        String str_30= "Oakak";
        System.out.println(str_29.compareTo(str_30));

        StringBuilder str_31 = new StringBuilder("value");
        String str_32 = new String("value");
        StringBuffer str_33 = new StringBuffer("value");
        String str_34 = "value";

        System.out.println(str_31.equals(str_32)); // false
        System.out.println(str_31.equals(str_33)); // false
        System.out.println(str_32.equals(str_33)); // false
        System.out.println(str_32.equals(str_34)); // true

        System.out.println(str_32.contentEquals(str_33)); // true

    }
}
