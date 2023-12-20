package extraCalismalarim4;

public class EQUALS {
    public static void main(String[] args) {
        String str1="Java";
        String str2="JAVA";
        String str3="java";
        String str4="JaVa";
        String str5="Java";
        String str6="Ja";
        String str7="va";
        String str8=str6.concat(str7);// aralara + isareti koyarak ta birlestirebiliriz


        System.out.println(str1.equals(str2));// falls
        System.out.println(str3.equals(str4));// falls

        // eger buyuk kucuk harf onemli degilse equalsIgnoreCase kullanilir
        System.out.println(str1.equalsIgnoreCase(str2));// true

        System.out.println(str8);//Java

        System.out.println(str1 == str5);// true
        System.out.println(str1 == str8);// falls
    }
}
