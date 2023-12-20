package day_070_hakan;

public class Q_209 {
    int x, y;
    public Q_209(int x, int y) {
        initialize (x,y);
    }
    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 9, y=5;
        Q_209 obj = new Q_209 (x,y);
        System.out.println(x + " " + y);
    }
}
