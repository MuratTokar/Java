package day_067_mrt;

public class C134 {

    // Which two class definitions fail to compile? (Choose two.)
    // hangi ikisi compile derken hata verir
}
// A
abstract class A3{
    private static int i;
    public void doStuff(){}
    public A3(){}
}
// B
final class A1{
    public A1(){}
}
// C
//private class A2{   // class private olmaz ve hatali
    //private static int i;
   // private A2(){}
//}

// D
class A4{
    protected static final int i=10;
    private A4(){}
}
// E
//final abstract class A5{ // abstract class zaten sub class lar tarafindan implement edilsin diye var.Final olunca kullanilamz
   // protected static int i;
   // void doStuff(){}
    //abstract void doIt();
//}
// CEVAP=A C
