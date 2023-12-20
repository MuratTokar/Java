package day_060_hakan;

public class Q7 {
    static int i; // class variable
    int j; // instance variable, field
    public static void main(String[] args) {
        Q7 q1 = new Q7();
        Q7 q2 = new Q7();
        q1.i=3; // i = 3;
        q1.j=4; // q1j = 4
        q2.i=5; // i = 5;
        q2.j=6; // q2j = 6
        System.out.println(q1.i + " " + q1.j + " " + q2.i + " " + q2.j);
        // 5 4 5 6
    }
}
