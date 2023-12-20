package day_061_hakan;

public class Q17 {
    public static void main(String[] args) {
       int x=3, y =5;
       Test obj = new Test(x,y);
       System.out.println(x + " " + y);

    }
}

class Test{
    int x,y;
    static int  a, b;
    public Test(int x, int y){
        initialize(x,y);
    }

    public void initialize(int x, int y){
        this.x = x*x;
        a = x*x;
        this.y = y*y;
        b = y*y;
    }

    public static void main(String[] args) {
        int x=3, y =5;
       // int a=3, b =5;
        Test obj = new Test(x,y);
        System.out.println( x + " " + y);
        System.out.println( a + " " + b);
        System.out.println( Test.a + " " + Test.b);
        System.out.println(obj.x + " " + obj.y);

    }

}
