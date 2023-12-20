package day_026_hakan;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
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
    public static void main(String[] args) {

        // Kullanicidan 12 ayin her biri icin, bir yagis miktari degeri alip, array da tutar
        double[] rainfalls = getRainfallMonthly();
        // Yillik toplam yagis miktari
        double total = sumArrayElements(rainfalls);
        // Aylik ortalama yagis miktari
        double averageMonth = getAverageOfArray(rainfalls);
        // En yüksek aylik yagis miktari
        double maks = getMaksInArray(rainfalls);
        // En düsük aylik yagis miktari
        double min = getMinInArray(rainfalls);

        System.out.println("Yillik toplam yagis miktari : " + total + " inches");
        System.out.println("Aylik ortalama yagis miktari : " + averageMonth + " inches");
        System.out.println("Aylik en yüksek yagis miktari : " + maks + " inches");
        System.out.println("Aylik en düsük yagis miktari : " + min + " inches");
    }

    public static double[] getRainfallMonthly(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nLütfen aylara göre yagis miktarlarini giriniz!");
        System.out.println("\n\tAy \t\tYagis Miktari(inches)");
        String[] months = {"January  ","February ", "March    ", "April    ", "May      ", "June     ",
                "July     ", "August   ", "September", "October  ", "November ", "December "};

        double[] rainfallAmounts = new double[12];
        for (int i=0; i < 12; i++){
            System.out.print(months[i] +"\t\t\t");
            rainfallAmounts[i] = input.nextDouble();
        }

        return rainfallAmounts;
    }

    public static double sumArrayElements(double[] doubleArray){
        double total = 0;
        for(double elem : doubleArray ){
            total += elem;
        }
        return total;
    }

    public static double getAverageOfArray(double[] doubleArray){
        double average = sumArrayElements(doubleArray)/doubleArray.length;
        return average;
    }

    public static double getMaksInArray(double[] doubleArray){
        Arrays.sort(doubleArray);
        return doubleArray[doubleArray.length-1];
    }

    public static double getMinInArray(double[] doubleArray){
        Arrays.sort(doubleArray);
        return doubleArray[0];
    }
}
