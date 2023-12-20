package day_066_mrt;

public class C088 {
    public static void main(String[] args) {
        int x = 6;
        while(isAvailable(x)){
           //  x--; // 2.yol
            System.out.print(x);
           // System.out.print(--x);// Cevap=A  1.yol
        }
    }

    public static boolean isAvailable(int x){
        return --x > 0 ? true : false;
       // return x-- > 0 ? true : false; //2.yol
    }
}

// 54321 ciktiisni vermesi icin ne yapilmali?

