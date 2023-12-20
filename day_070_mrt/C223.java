package day_070_mrt;

public class C223 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int i = 0;
        do {
            System.out.print(arr [i] + " ");
            i++;
        }while (i < arr.length + 1);// 5
    }
} // cevap= A (1,2,3,4followed by an ArrayIndexOutOfBoundsException)
