package day_26_murat;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /**
         * Aylik yagis miktarini (her ay icin ayri ayri) kullanicidan aliniz
         * bu yagis miktarini bir array de tutunuz
         *  output :
         *      - Yillik toplam yagis miktari
         *      - Aylik ortalama yagis miktari
         *      - En yüksek aylik yagis miktari
         *      - En düsük aylik yagis miktari
         *
         */
    }
    public static void getRainfallMonthly(){// 1.önce metot actik
        Scanner input=new Scanner(System.in); // 3.kullanicidan bilgi alacagiz
        System.out.println("Lütfen aylara göre yagis miktarini girin");
        System.out.println("\tAy \t\tYagis Miktari(inches):");
        String[] months={"January","Gebruary","March","April","May","June","July","August","September","October",
                "November","December"};
        double[]rainFallAmounts=new double[12];
        for (int i = 0; i <12 ; i++) {   // for döngüsüne attik
            System.out.println(months[i] + "\t\t\t");
            rainFallAmounts[i]=input.nextDouble();


        }

    }
}
