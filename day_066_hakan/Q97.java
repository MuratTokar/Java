package day_066_hakan;

public class Q97 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        System.out.println(sb.equals(s)); // false farkli object turleri oldugu icin
        System.out.println(sb.toString().equals(s.toString())); // true ayni object turu ve degerleri oldugu icin
        System.out.println(sb.hashCode());
        System.out.println(sb.toString().hashCode());
        System.out.println(s.hashCode());
    }
}
