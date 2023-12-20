package day_009_hakan;

public class LogicalOperators {
    public static void main(String[] args) {

        // & AND ve Operator
        // TRUE & TRUE      = 1 TRUE
        // TRUE & FALSE     = 0 FALSE
        // FALSE & FALSE    = 0 FALSE
        // FALSE & TRUE     = 0 FALSE

        // | OR veya Operator
        // TRUE | TRUE      = 1 TRUE
        // TRUE | FALSE     = 1 TRUE
        // FALSE | TRUE     = 1 TRUE
        // FALSE | FALSE     = 0 FALSE

        System.out.println(false & false); // iki tarafi da isleyip, sonrasinda kiyaslar
        System.out.println(true && false); // ilk tarafi isleyip, ihtiyaca göre 2.tarafi isleyip kiyaslar

        // FALSE && ? -> FALSE
        // FALSE & ? -> ? kismini isleyecek, sonra kiyaslama yapacak

        // TRUE || ? -> TRUE
        // TRUE | ? -> ? kismini isleyecek, sonra kiyaslama yapacak

        System.out.println(2==4 & (243%13 + 15*2-150 > 1265%14 -245 + 13*13 + 200)); // F & ? -> F
        System.out.println(2==4 && (243%13 + 15*2-150 > 1265%14 -245 + 13*13 + 200)); // F -> F

        System.out.println(!true);
        System.out.println(!(2>4));

        // XOR ^ birbirinden farkli olan durumlarda, true, ayni durumlarda false veriyor
        System.out.println(true^false); // true
        System.out.println(false^false); // false

        // Islem onceligi ! -> && -> ||


        int a = 100, b=7, c=200;
        a%=b;
        a*=b;
        c/=b;
        c-=a;
        c+=b;
        System.out.println(c);

    }
}
