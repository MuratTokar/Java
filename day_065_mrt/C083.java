package day_065_mrt;

public class C083 {
}

class Test83 {
    public static void main(String[] args) {
      Test83 ts = new Test83();
        System.out.println(isAvailable + " "); // true

        isAvailable = ts.doStuff(); // isAvailable = false// normlde statik method obje ile cagrilasi istenmez ama cagrilabilir
        // .amac burda kafa kasristirmak.
        System.out.println(isAvailable); // false
        // System.out.println(ts.isAvailable); // false
       // System.out.println(doStuff()); sadeece metodu basarsak true olacak .Cunku default false tersini ise tru gönderecek
    }

    public static boolean doStuff(){
        return !isAvailable;// tersini gönderecek o da yani Fals.
    }

    static boolean isAvailable = true;


    }


// C = true false
