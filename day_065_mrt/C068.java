package day_065_mrt;




import java.io.IOException;

public class C068 {
    public static void main(String[] args) {
        try {
            //        method1();
            //  } catch (MyException me){
            System.out.println("A");
            //    }
            // }
            // public static void method1(){  // line n1
            try {
                //      throw  3 > 10 ? new MyException() : new IOException();
                //   }catch (IOException ie){
                System.out.println("I");
            } catch (Exception e) {
                System.out.println("B");
            }
            // } // E= I yi basacak
//}
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}