package day_070_mrt;

public class C206 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        for (int e = 0; e < a.length; e += 2) {//cevap B
            //  for (xxxxx) {
                System.out.println(a[e]); // 1 3 5
            //  }
        }
    }
}