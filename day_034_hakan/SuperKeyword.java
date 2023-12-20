package day_034_hakan;
public class SuperKeyword {
}
class A {
    String className = "Class A";
    public A(){
        System.out.println("A constructor");
    }
    public A(String className){
        // super(); Her zaman ilk super() constructor i cagrilir
        System.out.println("A parameter constructor");
    }
    public void printCourse(){
        System.out.println("method A : " + className);
    }
}
class B1 extends A {
   String className = "Class B1";
    public B1(){
        // super(); Her zaman ilk super() constructor i cagrilir
        System.out.println("B1 constructor");
    }
    public B1(String className){
        // super(); Her zaman ilk super() constructor i cagrilir
        super(className);
        super.printCourse();
        System.out.println(super.className);
        System.out.println("B1 parameter constructor");
    }

    public void printCourse(){
        System.out.println("method B1 : " + className);
    }
}
class B2 extends A {
    String className = "Class B2";
    public void printCourse(){
        System.out.println("method B2 : " + className);
    }
}
class C1 extends B1 {
    String className = "Class C1";
    public C1(){
        // super(); Her zaman ilk super() constructor i cagrilir
        System.out.println("C1 constructor");
    }
    public C1(String className){
        // super(); Her zaman ilk super() constructor i cagrilir
        super(className);
        super.printCourse();
        System.out.println(super.className);
        System.out.println(this.className);
        this.printCourse();
        System.out.println("C1 parameter constructor");
    }
    public void printCourse(){
        System.out.println("method C1 : " + className);
    }
}

class TestConstructor{
    public static void main(String[] args) {
        C1 c1 = new C1();
        System.out.println(c1.className); // C1, sonra B1, sonra A
        // variable lari asagidan yukariya dogru arar, ilk buldugunu döner
        // method lari asagidan yukariya dogru arar, ilk buldugunu döner
        System.out.println("*********** method call *********");
        c1.printCourse();

        System.out.println("*********** constructor call *********");
        // constructor, ilk buldugu contructor in icerisindeki gizli super() cagrisindan dolayi,
        // yukariya dogru constructorlari call eder, sonra cagrildigi yere döner
        C1 c2 = new C1("Java Class");

    }
}
