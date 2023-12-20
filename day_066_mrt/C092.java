package day_066_mrt;

public class C092 {
    public static void main(String[] args) {


        Integer x = new Integer("1");
        System.out.println(x + 5);
        switch (x) {
            case 1:
                System.out.println(x);
        }
    }
}

// ACCEPTED
// A switch works with the
// - byte, short, char, and int primitive data types.
// - String
// - enum
// - Wrapper classes : Character, Byte, Short, and Integer

// NOT ACCEPTED(kabul etmez)
// long, double, float, except the above wrapper classes// long, double, float ve bunlarin wrapper class larini kabul etmez

/*
    Which three code fragments can be independently inserted at line n1 to enable the code to print One?
        (Choose three.)
        A. byte x = 1;
        B. short x = 1;
        C. String x = "1"; // bu stringi kabul etmez
        D. long x = 1; // kabul etmez
        E. double x = 1;// kabul etmez
        F. Integer x = new Integer("1");
        Answer: A B F
        93.
// A B F
*/
