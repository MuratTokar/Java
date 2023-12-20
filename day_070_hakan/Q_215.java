package day_070_hakan;

class LogFileException extends Exception { }
class AccessViolationException extends RuntimeException { }
public class Q_215 {
    public static void main(String[] args) {
        Q_215 obj = new Q_215 ();
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
        //throw  new LogFileException();
    }
    public void open () {
        System.out.println("Opened.");
        throw  new AccessViolationException();
    }
}
