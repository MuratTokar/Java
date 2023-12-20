package day_009_hakan;

public class AssignmentOperators {
    public static void main(String[] args) {

        // ! islemi boolean olarak verilen bir degeri tersine cevirir, true ise false, false ise true yapar
        int x = 3, y = 5;

        // 1
        x = y; // x = 5

        // 2
        x = 3;
        y = 5;
        x = x + y; // x = 8
        x += y;

        // 3
        x = 3;
        y = 5;
        x = x - y; // x = -2
        x -= y;

        // 4
        x = 3;
        y = 5;
        x = x * y; // x = 15
        x *= y;

        // 5
        x = 3;
        y = 5;
        x = x / y; // x = 0
        x /= y;

        // 6
        x = 3;
        y = 5;
        x = x % y; // x = 3
        x %= y;
    }
}
