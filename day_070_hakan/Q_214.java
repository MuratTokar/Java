package day_070_hakan;

public class Q_214 {
    public static final int MIN = 1;

    public static void main(String[] args) {
        int x = args.length;
        if (checkLimit (x)) {           // line n1
            System.out.println("Java SE");
        } else {
            System.out.println("Java EE");
        }
    }
    public static boolean checkLimit(int x) {
        return (x >=MIN) ? true : false;
    }

}
