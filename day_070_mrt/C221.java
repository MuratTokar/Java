package day_070_mrt;


import java.util.ArrayList;
import java.util.List;

public class C221 {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red"); // -red
        colors.add("yellow"); // + cyan
        colors.remove(2);
        colors.add(3, "cyan");
        System.out.println(colors);
    }
}
// cevap= B [green, blue, yellow, cyan]