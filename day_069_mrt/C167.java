package day_069_mrt;

public class C167 {
    public static void main(String[] args) {
        int x = 100; // 100
        int a = x++; // 100 = 101
        int b = ++x; // 102 = 102
        int c = x++; // 102 = 103
        int d = (a<b) ? (a<c) ? a: (b<c) ? b : c : x;
        System.out.println(d);
    }
} // Cevap=A(100)
