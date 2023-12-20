package day_065_mrt;

public class C071 {
    public void main(String[] args) {
        C2 obj1 = new C1();// C1 den obj1 olustu ve referans C2 icinden
        I obj2 = new C1();//C1 den obj2 olustu ve referans I icinden

        C2 s =(C2) obj2;// obj2 nin referans noktasi degisiyor  s oluyor
       // I t = obj1; // obj1 in referans degeri t olarak degisiyor ama c2 ile interface arasindaa baglanti yok
                     // obj1 e I t yi referans gösteremeyiz.Yani Compilation fails hatasi verir
        I t =(I) obj1; // ama boyle casting yaparsak sorun giderilir.C1 e de casting yaparsak duzelir
        t.displayI();
        s.displayC2();
    }

    class C2 {
        public void displayC2() {
            System.out.println("C32");
        }

    }

    interface I {
        public void displayI();

    }

    class C1 extends C2 implements I {
        public void displayI() {
            System.out.println("C1");

        }// Cevap= D-Compilation fails
    }
}