package day_22_murat;

import java.util.Arrays;

public class RewiewStringClass {
    public static void main(String[] args) {
        /*
        String str="value" --bu string literaldir.Value ler esit ise referans noktalarida esittir.
        str1==str2 ile str1.equals(str2) ayni sonuc verir
        --------------------------------------------------------------------------------------------------------------
        new Keyword ile yapinali ise value ayni olsada referans noktalari farklidir.Her memory de kendilerine özgü bir alana sahiplr
        str1==str2=false olur-- str1.equals(str2)=True olur .Valueler esitti ama refrans noktalri farklidir.== ile referanslari
        equals ile degerleri kontrol ettik
        not:tüm strigleri equals ile kontrol etmeli
         */
        String str1 = "ali";
        String str2 = "ali";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("*********************** EQUALS ***********************************************************");

        String str3 = new String("Mehmet");
        String str4 = new String("Mehmet");

        System.out.println(str3 == str4);     // objelerin esitligine baktik
        System.out.println(str3.equals(str4)); // degerlere baktik.

        System.out.println("**************************CONCAT**********************************************************");
        /*
        Concat metodu=concat edilen stringin dgeri degismiyor tekrar deger atanmadikca.
         */

        String str5 = "Veli";
        String str6 = "Veli";
        str5.concat(str6);// str5 in sonuna str4 ü yazar

        System.out.println(str5); // deger degismez str 5 i.Cünkü yeni deger atadik.Ama sonucu str5 e atarsam degisir

        str5 = str5.concat(str6); // böyle deger atarsam yani.
        System.out.println(str5);
        System.out.println("**************************REPLACE*********************************************************");

        /* Replace: Aranan stringi bulup yerine yeni deger atamak icin kullanilir.
         */
        String str7 = "Veli55476541212";
        String str8 = "Veli";
        str7.replace(str8, "Akilli ol");
        System.out.println(str8); // su sekilde yeni degeri atamaz.cunku yeni degeri str8 ye ataamdik
        str7 = str7.replace(str8, "Akilli ol");
        System.out.println(str7);

        System.out.println("**********charAt**************************************************************************");
        //charAt(index) 0 dan baslar ve o index teki string icerisindeki karakteri char olarak return eder
        // önce char olusturacagiz.charAt(5) bu 5 harf sirasidir.

        String str9 = "Veli55476541212";
        char c = str9.charAt(5);              //  char c= str9.charAt(5) yaparsak sonucu char olacak ve string olarak kullanamayiz
        String str10 = str9.charAt(5) + "";   // String str9=str9.charAt(5);bu sekil olursa hata verecek.ama charAt(5)+""; yapinca string olur
        System.out.println(str10);

        System.out.println("*****************Length*******************************************************************");

        // lenght string deki karakter sayisini verir
        String str11 = "Veli55476541212";
        int lengthstr = str11.length();
        System.out.println(lengthstr);

        System.out.println("*************toLowercase******************************************************************");
        // str.toLowercase() str nin icindeki harfleri kucuk harfe cevirir.Atamadan teyit etmez
        String str12 = "Veli554765412AAYYYZZZb";
        str12 = str12.toLowerCase();
        System.out.println(str12);
        System.out.println("****************toUppercase***************************************************************");

        String str13 = "veli554765412aayyyzzzb";
        str13 = str13.toUpperCase();
        System.out.println(str13);

        System.out.println("********************ISEMPTY & ISBLANK ****************************************************");
        // isEmpty= stringin lenght'i 0 ise true degilse fallse vreir.yani  karakter adeddi siifir olunca true
        // isBlank=stringin icerisinde bosluk haric karakter var mi .yoksa true varsa fallse

        String str14="";
        String str15=" ";
        String str16=" a";

        System.out.println(str14.isEmpty());// True
        System.out.println(str14.isBlank());// True

        System.out.println(str15.isEmpty());// Fllse
        System.out.println(str15.isBlank());// True

        System.out.println(str16.isEmpty());// Fallse
        System.out.println(str16.isBlank());// Fallse
        System.out.println("++++++++++++++++++++++++++++++++CONTAINS++++++++++++++++++++++++++++++++++++++++++++++++++");
        // aranan deger eger varsa --->True ama yoksa >>Falllse
        String str17="Merhaba";
        String str18="a";
        System.out.println(str17.contains(str18));// yada a yazilir iceriye
        System.out.println(str18.contains("g"));
         // Ya da;
        boolean arananDegerVarMi=str17.contains("a");
        boolean arananDegerVarMi1=str17.contains("f");

        System.out.println(arananDegerVarMi);
        System.out.println(arananDegerVarMi1);

        System.out.println("#######################   equalsIgnoreCase ################################################");
        // Büyük ve kücük harfe duyarli olmadan striglerin degerini karsilastirir
        String str19="MeRhaBa";
        String str20="merhaba";

        System.out.println(str19.equals(str20));
        System.out.println(str19.equalsIgnoreCase(str20));

        // Ya da;
        boolean stringlerEsitMi=str19.equals(str20);
        boolean stringlerHarfeDuyarliMi=str19.equalsIgnoreCase(str20);

        System.out.println(stringlerEsitMi);
        System.out.println(stringlerHarfeDuyarliMi);

        System.out.println("*********************************** Trim**************************************************");
        // String in basindaki ve sonundaki boslugu siler
        String str21="   Merhaba   ";

        str21=str21.trim();

        System.out.println(str21);

        System.out.println("################################## indexOf ################################################");
        // str1.indexOf(aranacakDeger) str1 icerisinde, aranacakDeger in ilk karakter indexini getiriyor -> returns int
        // str1.indexOf(str2, baslangicIndexi) verilen baslangic indexinden sonraki kisimda ara
        // baslangicIndex i, birden fazla arananDeger bulmak icin kullanilir.aradigimiz kelimenin ,stringin ikl basladigi noktayi verir
        String str_22 = "Javasiz hayat, ekmeksiz yemek gibidir.";
        String str_24 = "Javasiz hayat, +902121234567 yemek gibidir.";
        String str_23 = "hayat";
        int indexOfstr = str_22.indexOf(str_23);
        int indexOfstr24 = str_23.indexOf("+");
        System.out.println(indexOfstr);
        System.out.println(indexOfstr24);
        System.out.println(str_24.substring(15,27));

        System.out.println("********************************* Split **********************************************");
          // Spring te java Immutable dir yani degerler degistirilemez.Yani uterine yazilmaz xýeni bir yer olustulur ve oraya yazilir
        // String icerisinde ayraclara kadar olan kisimlari ayirip,ayri seklinde string array ine yaziyor
        // str.split(ayrac)
        // Arry ayraci icinde tum kelimeleri listeler.
        String str="Ya bu ödev yapilacak ya da bu ödev yapilacak";// string taniimladik
        String[]strArry=str.split(" "); // bosluklara bakip kelimelere ayiracak.buraya istedigimiz kelimeyide yazabiliriz
        String[]strArry2=str.split("bu "); // kelimeye göre ayiriyoruz.Bu kelimesini cikarip öyle cumleyi yazacak


        System.out.println(Arrays.toString(strArry));// 10 kelime verecek ve her biri bir string oldu.sonra bunu for dögüsüne alip
        System.out.println(Arrays.toString(strArry2));//

        System.out.println("******************************  *Substring ************************************************");
        /*
        iki sekilde kullanilir =str.substring(indexBaslangic) baslangictan sonuna kadar al demek
        yada Str.substring(indexBaslangic,indexBitis)
         */
        String str_25 = "Javasiz hayat, +902121234567 yemek gibidir.";
       String phonenemmer= str_25.split(" ")[2]; // ikinci elemani aldik
        System.out.println(phonenemmer);
        // ya da
        int indexOfPlus=str_25.indexOf("+");
        System.out.println(str_25.substring(indexOfPlus, indexOfPlus + 13));

        String str_26 = "0123456789";
        System.out.println(str_26.substring(3));
        System.out.println(str_26.substring(3,8));// baslangic dahil bitis dahil degil
        System.out.println(str_26.substring(0));// sifirdan baslayinca tumunu alir
       // System.out.println(str_26.substring(-1));// hata verir

        System.out.println("########################### lastIndexOf#####################################################");
        // lastindexOf();
        String str27="Ay ve ay";
        int indexOf=str27.indexOf("Ay");// soldan saga dogru ve index in ilk karakre numarasini verir
        System.out.println(indexOf);// 0
        int lastindexOf=str27.lastIndexOf("Ay");
        System.out.println(lastindexOf);// 6 // sondan gelir.tersden alir ama yine kelimenin ilk karakreini alir

        /*lastIndex ile index kardes metot dur.aranan kelime bulunamayinca -1 dönerler.sagdan sola arama yapar ve bulduugnda ikl
         karakterin index ini alir
          */
        System.out.println("####################### StartsWith -- endsWith  ###########################################");
        // stratwith ile stringin icerisindeki cumle belirtilen kelime ile basliyor mu baslamiyor mu endswith ile de
        // sonu belirtilen kelime ile basliyor mu.boolean sonuc veririr.True yada Fallse
            String srt28="Burasi mustur ,yolu yokustur";
           boolean yoVarMi= srt28.startsWith("Bu");// True
            System.out.println(yoVarMi);
        boolean muVarMi1= srt28.startsWith("mu");
        System.out.println(muVarMi1); // Falls

        String srt29="Burasi mustur ,yolu yokustur";
        boolean turIleBitiyorMu=srt29.endsWith("tur");
        System.out.println(turIleBitiyorMu); // True

        System.out.println("***** compareTo() *****++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // cok kullanilmayan bir metot.girilen iki kelimeyi harf harf karsilastirir.esit ise 0 verir4
        String str_30= "HBkan";
        String str_31= "Oakak";
        System.out.println(str_30.compareTo(str_31));


        StringBuilder str_32 = new StringBuilder("value");
        String str_33 = new String("value");
        StringBuffer str_34 = new StringBuffer("value");
        String str_35 = "value";
        System.out.println(str_32.equals(str_33));
        System.out.println(str_32.equals(str_35));
        System.out.println(str_33.equals(str_34));
        System.out.println(str_33.equals(str_35));

    }
}