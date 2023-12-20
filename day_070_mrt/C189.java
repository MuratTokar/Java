package day_070_mrt;

public class C189 {
    public static void main(String[] args) {
     Test t1 = new Test();
        t1.var=300;
        System.out.println(t1); //  100 : 300
       Test t2 = new Test();
        t2.stVar = 300;
        System.out.println(t2); //  300 : 200;
    }
}

class Test {
    public static int stVar = 100;
    public int var = 200;
    public String toString () {
        return stVar + ":" + var;
    }
}
// cevap=D 100:300 300:200
