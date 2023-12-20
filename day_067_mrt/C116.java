package day_067_mrt;

public class C116 {
    public static void main(String[] args) {
        A b1=new A();
        A b2=new C();
        b1=(A) b2;
        A b3=(B) b2;
        b1.test(); // line n1
        b3.test();// line n2

        // b1-->A
        // b2-->C
        // b1--b2-->C
        // b3--b2-->C ama B ye casting ediyor ama B ve C arasinda iliski yok ve casting edilemez.sadece A da bulusan iki subclass
        // Cevap=E(A ClassCastException is thrown only at line n2)
    }
}
class A{
    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}
 class C extends A {
    public void test(){
        System.out.println("C");
    }

}
