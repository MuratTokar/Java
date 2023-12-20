package day_025_Array_methods;

public class RI {
    public static void main(String[] args) {

        String a="asdc 1234 .,,?! #+#+";

        System.out.println(a.replaceAll("\\s", "*")); // asdc*1234*.,,?!*#+#+
        System.out.println(a.replaceAll("\\S", "*"));  // **** **** ***** ****
        System.out.println(a.replaceAll("\\d", "*"));
        System.out.println(a.replaceAll("\\D", "*"));
        System.out.println(a.replaceAll("\\w", "*"));
        System.out.println(a.replaceAll("\\W", "*"));
        System.out.println(a.replaceAll("\\p{Punct}", "*"));



    }
}
