package day_052_murat;

public class Arrays2D {

    public static void main(String[] args) {
        //1-Her satirdaki en buyuk sayiyi bulalim
        //1.satirdaki en buyuk sayi 12
        //2.satirdaki en buyuk sayi.....
        Integer[][] numbers={{1,5,8,12},{4,8,9,3},{0,13,15,30}};
         int[] maxNumbers=new int[numbers.length];//3 array i tek tek for dongusune atacak.3 array var length 3 tur
        for (int i = 0; i <numbers.length ; i++) {
            int max=Integer.MIN_VALUE;// en kucuk degeri int max aattik
            for (int num:numbers[i]){ // tum array lari for a attiik ve her bir elemaninni num a atadik
                // max i bul
                if (max<num){
                    max=num;
                }
            }
            maxNumbers[i]=max;
            System.out.println((i+1) + "satirdaki en buyuk sayi = " + max);

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
        for(Integer[] arr : numbers){
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







        // 2-Satirlarin ve kolonlarin kendi arasinda toplamlari
        //     1-satirdaki sayilarin toplami : 26
        //     2-satirdaki sayilarin toplami : 24
        //     3-satirdaki sayilarin toplami : 58

        //     1-kolondaki sazilarin toplami :5
        //     2-kolondaki sazilarin toplami :26
        //     3-kolondaki sazilarin toplami :32
        //     4-kolondaki sazilarin toplami :45










        // 3-2D Array daki en büyük ve en kücük sayiyi bulan programi yazin






        // 4-Tüm arry larin toplami








        // 5-   1   +   5   +   8  +  12  =  (sum)
        //      +       +       +      +
        //      4   +   8   +   9  +   3  =  (sum)
        //      ....
        //      --      --      --     --
        //     (sum)   (sum)   (sum)   (sum)





    }

}
