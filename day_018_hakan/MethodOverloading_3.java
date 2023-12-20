package day_018_hakan;

public class MethodOverloading_3 {

    public static void main(String[] args) {

    }

    public static void printNames(String name){
        System.out.println(name);
    }

    public static void printNames(String name1, String name2){
        System.out.println(name1);
        System.out.println(name2);
    }

    public static void printNames(String name1, String name2, String name3){
        // ayni islemi yapan diger methodlari cagirarak kod dan tasarruf saglanabilir
        printNames(name1, name2);
        System.out.println(name3);


        // Üstteki ile ayni sonucu verir
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }

    public static void printNames(String name1, String name2, String name3, String name4){
        printNames(name1, name2, name3);
        System.out.println(name4);

        // Üstteki ile ayni sonucu verir
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }
}
