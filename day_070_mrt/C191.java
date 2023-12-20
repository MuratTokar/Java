package day_070_mrt;


public class C191 {
    private char var ;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1; // burasi gereksiz cunku siralama ile kafa karistirmak-
        var2 = 'e';

        C191 obj1 = new C191 ();
        C191 obj2 = obj1; // obj1 ile obj2 nin referans degeri ayni
        obj1.var = 'o';
        obj2.var = 'i';
        // obj1.var i
        // obj2.var i

        System.out.print(var1 + " , " + var2); // a, e
        System.out.println(obj1.var + " , " + obj2.var); // i, i
    }
}
// cevap=A(a , ei , i)