package extraCalismalarim4;

import java.util.Locale;

public class String_Manipulations {
    public static void main(String[] args) {
        // verilen bir stringi hazir metotlarla degistiremktir
        String str="java candir";
        System.out.println(str.toUpperCase());
        System.out.println(str);// asil variable deger atamazsak variable degismez
        System.out.println("##################################");

        String str1="JAVA CANDIR";
       str1= str1.toLowerCase();
        System.out.println(str1);

        System.out.println("###############################");
       String str2="JAVA CANDIR";
       str2=str2.toLowerCase(Locale.forLanguageTag("TR")); // java candır // türkce karakter yaptik.Norlmade java candir olmaliydi
        System.out.println(str2);
    }
}
