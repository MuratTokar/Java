package day_070_mrt;


public class C209 {
    int x, y;
    public C209(int x, int y) {
        initialize (x,y);
    }
    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 9, y=5;   // lokale variable oldugu icin burdaki degeri basacak
        C209 obj = new C209 (x,y);
        System.out.println(x + " " + y);
    }
} // cevap=A (9 5)
