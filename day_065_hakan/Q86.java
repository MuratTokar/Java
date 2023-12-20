package day_065_hakan;

public class Q86 {}

class A86{
    public void test(){
        System.out.print("A ");
    }
}

class B86 extends A86 {
    public void test(){
        System.out.print("B ");
    }
}

class C86 extends A86 {
    public void test(){
        System.out.print("C ");
    }

    public static void main(String[] args) {
        A86 b1 = new A86();
        A86 b2 = new C86();
      //  A86 b3 = (B86) b2;      // line n1
        A86 b3 = b2;      // line n1
        b1 = (A86) b2;      // line n2
        b1.test(); // C
        b3.test(); // C
    }
}

/**
 * Wrapper classlarda, classlar arasinda casting e izin verilmez
 * Primitiv data typlerinde casting e izin verilir
 */