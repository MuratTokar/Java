package day_066_mrt;

public class C086 {

}

class A{
    public void test(){
        System.out.print("A ");
    }
}

class B extends A {
    public void test(){
        System.out.print("B ");
    }
}

class C extends A {
    public void test(){
        System.out.print("C ");
    }

    public static void main(String[] args) {
        A b1 = new A(); // referansi A olan b1 adinda A objesi olusturuldu
        A b2 = new C();// referansi A olan b2 adinda C objesi olusturuldu
          A b3 = (B) b2;       // line n1 ...b2 C objesidir ve C objesini B olarak atayamayiz cunku aralarinda iliski yok
          b1 = (A) b2;        // line n2
        b1.test(); // C
        b3.test(); // C

        // D. A ClassCastException is thrown only at
    }
}

/**
 * Wrapper classlarda, classlar arasinda casting e izin verilmez
 * Primitiv data typlerinde casting e izin verilir
 */
