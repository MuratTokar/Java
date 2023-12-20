package day_063_hakan;

public class Q47 {

    public static void main(String[] args) {
        C1 obj1 = (C1) new C2();
        C2 obj2 = (C2) new C3();
        C2 obj3 = (C2) new C1(); // classCastException
        C3 obj4 = (C3) obj2;
    }

    // C1
    // C2 extends C1
    // C3 extends C2

    // 16. C1 obj1 = (C1) new C2();
    // 17. C2 obj2 = (C2) new C3();
    // 18. C2 obj3 = (C2) new C1();
    // 19. C3 obj4 = (C3) obj2;

    // classlarda, ust class alt class a gecis yapamaz

    // C3 < C2 < C1 -> is a relationship
    // kopek -> hayvan -> canli olarak dusunulebilir

}

class C1{}
class C2 extends C1{}
class C3 extends C2{}
