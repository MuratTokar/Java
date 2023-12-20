package day_061_hakan;

public class Q15 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        //StringBuilder sb2 = sb1;
        String str1 = sb1.toString(); // "Duke"
        //String str1 = "Duke"; ustteki ifade bu ifadeden farklidir
        //String str2 = str1;
        String str2 = "Duke";
        // insert code
        System.out.println(str1 == str2); // referans noktalarini check eder



        String str3 = new String("Java");
        String str4 = new String("Java1");
        String str5 = new String("Java");
        String str6 = "Java";
        str5 = str3;

        // equals methodu ise hashcode u yani degerleri kiyaslar
        // !!! farkli data typleri, object instance lari kiyaslanirsa, degerleri ayni olsa da FALSE verir
        // StringBuilder object ile String object mesela
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str5.hashCode());
        System.out.println(str6.hashCode());

        // == isareti identity hashcode u kiyaslar, referans noktasini kiyaslar
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        System.out.println(System.identityHashCode(str5));
        System.out.println(System.identityHashCode(str6));
    }
}

// 2 literal, ayni degerlere sahip String
// ya da create edilmis bir object in, baska bir object e atanmasi ile
// == sorgusu true gelebilir
