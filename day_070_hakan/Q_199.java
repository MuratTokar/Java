package day_070_hakan;

public class Q_199 {
    public static void main(String[] args) {
        String stuff = "TV";
        String res = null;

        res = stuff.equals("TV") ? "Walter": stuff.equals("Movie") ? "White" : "No Result";

        if (stuff.equals("TV")) {
            res = "Walter";
        }else if (stuff.equals("Movie")) {
            res="White";
        }else {
            res ="No Result";
        }
    }
}
