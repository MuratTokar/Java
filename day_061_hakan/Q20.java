package day_061_hakan;

public class Q20 {

}

class Test2{
    int a1;

    public static void doProduct(int a){
        a = a*a;
    }

    public static void doString(String s){
        s.concat(" " + s);
    }

    public static void main(String[] args) {
        Test2 item = new Test2();
        item.a1 = 11;       // a1 = 11
        String sb = "Hello";        // sb = "Hello"
        Integer i = 10;     // i = 10
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);
        // 10 Hello 11
    }

}
