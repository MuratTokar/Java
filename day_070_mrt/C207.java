package day_070_mrt;

public class C207 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];

        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};

        for (int[] a : arr) {
            for (int i = 0; i < arr.length; i++) {// array im lenght ini almis yani 2 olacak.ilk iki index i basar
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}// cevap B (13 13)