package day_067_mrt;

public class C110 {
    public static void main(String[] args) {
        Base b1=new DerivedB();
        Base b2=new DerivedA();
        Base b3=new DerivedB();
        b1=(Base) b3;
        Base b4=(DerivedA) b3;
        b1.Test();
        b4.Test();

        // b1 -> B
        // b2 -> A
        // b3 -> B
        // b1-b3 -> B
        // b4-b3 -> B
        // metotolar kendi ikl yerdeki degereini alir ama variableler casting yapilinca cast edilen yerdeki variableleri alir



    }
}
class Base{
    public void Test(){
        System.out.println("Base");
    }

}
class DerivedA extends Base{
    public void test(){
        System.out.println("DerivedA");

    }

}
class DerivedB extends DerivedA{
    public void test(){
        System.out.println("DerivedB");
    }
    // cevap=C (DerivedBDerivedB
}
// sub class tan super class a casting yapilabilir fakat super class tan sub class acasting yapilamaz
// casting de variables cast edilen class a göre kullanilirken ,methodlar orijinal object class ina göre kullannilir