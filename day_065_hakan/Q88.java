package day_065_hakan;

public class Q88 {
    public static void main(String[] args) {
        int x = 6;
        while(isAvailable(x)){
            System.out.print(--x);
        }
    }

    public static boolean isAvailable(int x){
        return --x > 0 ? true : false;
    }
}

// 54321 ciktiisni vermesi icin ne yapilmali?