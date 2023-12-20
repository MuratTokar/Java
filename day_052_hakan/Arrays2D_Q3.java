package day_052_hakan;

public class Arrays2D_Q3 {

    /**
     * 1  5  8   12
     * 4  8  9   3
     * 0  13 15  30
     * <p>
     * 1. Her satirdaki en buyuk sayiyi bulalim
     * 1. satirdaki en buyuk sayi 12
     * 2. satirdaki ...
     * <p>
     * 2. Satirlarin ve kolonlarin kendi arasinda toplamlari
     * 1. satirdaki sayilarin toplami : 26
     * 2. satirdaki sayilarin toplami : 24
     * 3. satir ...
     * <p>
     * 1. kolondaki sayilarin toplami ...
     * <p>
     * 3. 2D Array deki en buyuk ve en kucuk sayiyi bulan program
     * <p>
     * 4. tum arrayin toplami
     * <p>
     * 5.
     * 1   +    5   +   8   +   12  =   (sum)
     * +        +       +        +
     * 4   +    8   +   9   +   3   =   (sum)
     * ...
     * _        _       _       _
     * sum()   sum()   sum()   sum()
     */

    public static void main(String[] args) {

        int[][] numbers = {{1, 5, 8, 12}, {4, 8, 9, 3}, {0, 13, 15, 30}};

       // 3. 2D Array deki en buyuk ve en kucuk sayiyi bulan program

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int[] arr : numbers){
            for(int num : arr){
                if(max < num){
                    max = num;
                }
                if(num < min ){
                    min = num;
                }
            }
        }

        System.out.println("En buyuk sayi : " + max);
        System.out.println("En kucuk sayi : " + min);

    }
}
