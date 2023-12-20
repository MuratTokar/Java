package day_065_mrt;

public class C066 {
    public static void main(String[] args) {
        C2 obj1=new C1();// obje nasil olusturulmus burasi onemli.yani sag taraf
        I obj2=new C1();

        C2 s=(C2) obj2;// obj2 objesini al ve c2 imis gibi C2 s e ata diyor.Artik obj2 nin referansi C2 s
        I t=obj1;// obj1 i de al interfacedeki t ye ata .obj1 in referansi artik  I t dir

        t.displayI(); // t obj1 idi obj1 ise C1 idi
        s.displayC2();// buda c2 yi basacak
    }

}
interface I{
    public void displayI();// interface nin variableleri final dir

}
abstract class C2 implements I{
    public void displayC2(){
        System.out.println("C2");
    }
}
class C1 extends C2{
    public void displayI(){
        System.out.println("C1");// burada C1 i basacak
        // C1C2
    }
}
