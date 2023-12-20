package day_070_mrt;

    class E1 extends Exception { } // checked & unchecked exception
    class E2 extends RuntimeException { } // unchecked exception
public class C190 {
    public void m1() { // throws E1 yazarsak duzelir ama hatayi uste firlatmis oluruz
        System.out.println("m1.Accessed.");
      //   throw new E1(); /// buranin compile esnasinda handle edilmesi lazim.Yada buraya try catch icine aliriz
    }

    public void m2() {
        System.out.println("m2.Accessed.");
        throw new E2();
    }

    public static void main(String[] args) {
        int level = 1;
        C190 obj = new C190();
        if (level <= 5 && level >= 3) {
            obj.m1();
        } else {
            obj.m2();
        }
    }
} // cevap=B ( The program fails compile due to the unhandled E1 exception)