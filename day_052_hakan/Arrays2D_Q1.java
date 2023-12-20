package day_052_hakan;

public class Arrays2D_Q1 {

    /**
     *  1  5  8   12
     *  4  8  9   3
     *  0  13 15  30
     *
     *  1. Her satirdaki en buyuk sayiyi bulalim
     *      1. satirdaki en buyuk sayi 12
     *      2. satirdaki ...
     *
     *  2. Satirlarin ve kolonlarin kendi arasinda toplamlari
     *      1. satirdaki sayilarin toplami : 26
     *      2. satirdaki sayilarin toplami : 24
     *      3. satir ...
     *
     *      1. kolondaki sayilarin toplami ...
     *
     * 3. 2D Array deki en buyuk ve en kucuk sayiyi bulan program
     *
     * 4. tum arrayin toplami
     *
     * 5.
     *      1   +    5   +   8   +   12  =   (sum)
     *      +        +       +        +
     *      4   +    8   +   9   +   3   =   (sum)
     *      ...
     *      _        _       _       _
     *      sum()   sum()   sum()   sum()
     *
     */

    public static void main(String[] args) {

        int[][] numbers = { {1, 5, 8, 12}, {4, 8, 9, 3}, {0, 13, 15, 30} };

        /*1. Her satirdaki en buyuk sayiyi bulalim
            1. satirdaki en buyuk sayi 12
            2. satirdaki ...*/
        int[] maxNumbers = new int[numbers.length];
        for(int i=0; i < numbers.length ; i ++){
            int max = Integer.MIN_VALUE;
            for(int num : numbers[i]){
                // max i bul
                if(max < num){
                    max = num;
                }
            }
            maxNumbers[i] = max;
            System.out.println((i+1) + ". satirdaki en buyuk sayi = " + max);
        }
        System.out.println("******* array olarak kaydedilen max degerler ********");
        int satir = 1;
        for(int max : maxNumbers){
            System.out.println(satir + ". satirdaki en buyuk sayi = " + max);
            satir ++;
        }

        System.out.println("******* 1.soru alternatif cozum ********");

        for(int i=0; i < numbers.length ; i ++){
            int max = numbers[i][0];
            for(int num : numbers[i]){
                // max i bul
                if(max < num){
                    max = num;
                }
            }
            System.out.println((i+1) + ". satirdaki en buyuk sayi = " + max);
        }

        System.out.println("******* 1.soru alternatif cozum ********");

        for(int i=0; i < numbers.length ; i ++){
            int max = numbers[i][0];
            for(int j=1; j < numbers[i].length ; j++){
                // max i bul
                if(max < numbers[i][j]){
                    max = numbers[i][j];
                }
            }
            System.out.println((i+1) + ". satirdaki en buyuk sayi = " + max);
        }

        System.out.println("******* 1.soru alternatif cozum ********");

        int satir2 = 1;
        for(int[] arr : numbers){
            int max = arr[0];
            for(int num : arr){
                // max i bul
                if(max < num){
                    max = num;
                }
            }
            System.out.println(satir2 + ". satirdaki en buyuk sayi = " + max);
            satir2++;
        }

    }
}
