package day_064_hakan;

public class Q56 {
    public static void main(String[] args) {
        String str = " ";
        str.trim(); // gereksiz, cunku str ye geri atama yapilmamis
        System.out.println(str.equals("") + " " + str.isEmpty());
        // false false

        str.isEmpty(); // false, whitespace var
        // isEmpty(); // if length() is 0, true
        str.isBlank(); // if length is 0 or str.trim().length() is 0 ise
        System.out.println(str.isBlank()); // true

        // "   ".isBlank() = true   "".lenth()=0
    }
}
