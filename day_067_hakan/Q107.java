package day_067_hakan;

public class Q107 {
    public static void main(String[] args) {
        System.out.println(Boolean.valueOf("true")); // true
        System.out.println(Boolean.valueOf("tRuE")); // true
        System.out.println(Boolean.valueOf("TRUE")); // true
        System.out.println(Boolean.valueOf("1")); // false
        System.out.println(Boolean.valueOf(null)); // false
        System.out.println(Boolean.valueOf(true)); // true
    }
}
// javac Q107.java
// java Q107 1 null


// false false
