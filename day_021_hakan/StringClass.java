package day_021_hakan;

public class StringClass {

    public static void main(String[] args) {
        // String; karakterler kümesi, sequences of chars
        // String olusturmak icin kullanilan class lar : String, StringBuilder, StringBuffer

        // String Class
        // literal & new keyword

        String str = "value"; // literal String object creation
        String str2 = new String("value"); // new Keyword kullanarak String object creation

        System.out.println("strLiteral : " + str);
        System.out.println("strNewKeyword : " + str2);

        // == ile kiyaslanan degisken/object ler ayni noktayi point/reference/refere/gösterip göstermedigi kontrol edilir
        // equals methodu ile ise, degerler kiyaslanir
        String a1 = "java";
        String a2 = "java";
        System.out.println(a1==a2); // true

        String b1 = new String("java");
        System.out.println(b1==a2); // false

        String b2 = new String("java");
        System.out.println(b1==b2); // false

        System.out.println(b1.equals(b2)); // true
        System.out.println(a1.equals(b2)); // true
        System.out.println(a2.equals(b2));
        String str3 = "Value";
        // equals methodu -> str.equals(str2) str ile str2 degerleri esit mi? true/false

        String str4 = str3.concat("java"); // String str4 = str3 + "java";
        // str3 orjinal degerini koruyor, "Value"
        System.out.println("############################################");
        String str13=str4.concat(str2);
        System.out.println(str3);
        System.out.println("str13:"+str13);
        str4.length(); // str4 ün icerisindeki karakter sayisini verir
        System.out.println(str4.length());
        System.out.println(str4);
        System.out.println(str13.length());
        // str4.charAt(9);
        // IndexOutOfBoundsException hatasi verir, cünkü str4 9 karakterli fakat,
        // index araligi 0 ile 8 arasinda
        System.out.println(str13.charAt(5));

        System.out.println(str4.charAt(5)); // j

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Java";
        String s4 = "Java";
        String s5 = "Java";

        // isEmpty()
        String emp = "";
        System.out.println(emp.isEmpty()); // true// dizenin icinde karakter olup olmadigina bakar.
        // Bos ise hic karakter yoksa True eger bos degilse Fallse veriri



        String emp2 = " ";
        System.out.println(emp2.isEmpty()); // false

        System.out.println(emp2.isBlank()); // true , bosluklardan haric bir karakter var mi diye kontrol eder

        // "" , uzunlugu 0 mi, isEmpty();
        // "        " bosluk haricinde bir karakter var mi? varsa false, yoksa(sadece bosluk ise) true;

        System.out.println(emp.isBlank()); // true

        // toLowerCase() : girilen harfleri, kücük harflere cevirir "JAVA".toLowerCase() -> "java"
        String str5 = "JaVaCi";
        System.out.println(str5.toLowerCase()); // "javaci"

        // toUpperCase() : girilen bütün harfleri büyük harfe cevirir "java".toUpperCase() -> "JAVA"
        System.out.println(str5.toUpperCase()); // "JAVACI"

        // replace() : aranan bir karakter/string in yerine gecme
        // str.replace(arananKelime/arananKarakter, yeniDeger);
        String newStr = "Merhaba python. Ben python i cok seviyorum.";
        newStr = newStr.replace("python","java"); // python u ara ve yerine javayi koy
        System.out.println(newStr);

        // contains() : true/false aranan karakter/kelime iceriliyorsa
        // str.contains("arananDeger") -> iceriyorsa-true    icermiyorsa-false

        System.out.println(newStr.contains("python"));  // false
        System.out.println(newStr.contains("java")); // true




    }
}
