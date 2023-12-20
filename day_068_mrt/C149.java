package day_068_mrt;

public class C149 {
}

class App {
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];

        bool[0]= new Boolean(Boolean.parseBoolean("true")); // "true" "TRUE" "tRue" -> true // bu sekilde her zaman true dönecek
        bool[1]= new Boolean(null); // true dsinda fallse donecek cunku boolean true yada fallse donecektir,null atanmis ama fallse

        System.out.println(bool[0] + " " + bool[1]);

    }
}
//
// others false

// Cevap=A ( True-False)