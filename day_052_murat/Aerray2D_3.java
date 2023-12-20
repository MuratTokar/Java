package day_052_murat;

public class Aerray2D_3 {
    public static void main(String[] args) {
        // 3-2D Array daki en büyük ve en kücük sayiyi bulan programi yazin
        int[][] numbers = {{1, 5, 8, 12}, {4, 8, 9, 3}, {0, 13, 15, 30}};
         int max=Integer.MIN_VALUE;// en bbuyuk icin en kucugunu veriyoruz.gelen veriler bundan kucuk olsun
        int min=Integer.MAX_VALUE;
        for (int[] arr :numbers){
            for(int num:arr){
                if (max <num){
                    max=num;
                }
                if (num<min){
                    min=num;
                }

            }

        }
         System.out.println("En buyuk sayi : " + max);
         System.out.println("En kucuk sayi : " + min);
    }
}
