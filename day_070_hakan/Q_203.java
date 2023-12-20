package day_070_hakan;

public class Q_203 {
    public static void main(String[] args) {
        String myStr = "Hello World " ;
        myStr = myStr.trim();
        int i1 = myStr.indexOf(" ", 6);
        System.out.println(i1); // 5
    }
}
