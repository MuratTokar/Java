package day_070_mrt;


class LogFileException extends Exception { } // burda hem checked var hem unchecked var.Compiler sirasinda handle etmeliyiz cunku belli degil
class AccessViolationException extends RuntimeException { }

public class C215 {
    public static void main(String[] args) throws LogFileException {
      C215 obj = new C215 ();
        try {
            obj.open ();
            obj.process ();
            // insert code here
        }
        catch (Exception e) {
            System.out.println("Completed.");
        }
    }
    public void process() {
        System.out.println("Processed");
       // throw  new LogFileException(); // bu hatanin handle edilmesi lazim.ya try --catch ile yakalariz ya da throw ederiz
    }
    public void open () {
        System.out.println("Opened.");
        throw  new AccessViolationException();
    }
}
       // Hangi kod compiler error u fix eder?
 // cevap=B( At line 13 add throws LogFileException)