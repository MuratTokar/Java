package day_070_hakan;

public class Q_191 {
    private char var ;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Q_191 obj1 = new Q_191 ();
        Q_191 obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';
        // obj1.var i
        // obj2.var i

        System.out.print(var1 + " , " + var2); // a, e
        System.out.println(obj1.var + " , " + obj2.var); // i, i
    }
}
