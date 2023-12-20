package day_010_hakan;

public class TasksOperatorPart2 {
    public static void main(String[] args) {
        // TASK A
        // 20 < 30 || 30 >= 30;
        // true || true -> true

        // TASK B
        // comp2 = !("Shinny" == "Rainy" || 70 == 70);
        // comp2 = !(false || true) = !true = false

        // TASK C
        int b=2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
        // 3(b=3) == 2 || 2(b=2) == 2 && 1(b=1) == 2;
        // false || true && false;
        // false
        System.out.println(res);

        // TASK D
        boolean z = true;
        int y = 20;
        boolean x = (y != 10) || (z=false); // (20 != 10) || (false) // true || ?
        System.out.println(" x : " + x);

        // TASK E
        double d = 20, d2 = 80; // d = 20.0
        System.out.println((((d + d2) * 25) % 40 <= 20));
        // Short cut :  ifadenin sonuna .sout yazarsaniz, o ifadeyi icine alip sout olusturuyor
    }
}
