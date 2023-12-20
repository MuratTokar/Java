package extraCalismalarim4;

public class CharAt_Length {
    public static void main(String[] args) {
        String str="Java Candir";

        System.out.println(str.charAt(0));// j

        // 6.harfi yazdik
        System.out.println(str.charAt(5));// c

        // sondan 2.harfi yaazdik
        System.out.println(str.charAt(str.length() - 2));// i

        // son harf
        System.out.println(str.charAt(str.length() - 1));// r
    }
}
