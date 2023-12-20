package day_009_Exmpls;

public class Ef {

    public static void main(String[] args) {

        int i=19, j=29, k;

        k= i-- - i++ + --j - ++j + --i - j-- + ++i - j++;

        System.out.println("i=" + i);    // 19
        System.out.println("j=" + j);    // 29
        System.out.println("k=" + k);   // -20



    }
}
