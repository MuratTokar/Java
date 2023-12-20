package day_062_hakan;

public class Q32 {
    int i; // field, instance variable, object variable,
    // her bir object icin farkli degerleri vardir
    static int j; // class variable, tum objectler icin ayni degere sahiptir

    public static void main(String[] args) {
        Q32 q1 = new Q32();
        Q32 q2 = new Q32();
        q1.i=3; // q1i = 3;
        q1.j=4; // j = 4
        q2.i=5; // q2i = 5;
        q2.j=6; // j = 6
        System.out.println(q1.i + " " + q1.j + " " + q2.i + " " + q2.j);
        // 3 6 5 6
    }
}
