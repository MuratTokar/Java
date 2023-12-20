package day_017_hakan;

import java.sql.SQLOutput;

public class Task_56 {

    public static void main(String[] args) {
        // TASK 56
        convertToKM();
    }

    public static void convertToKM(){
        final double KATSAYI = 1.609344;
        double miles = 100;
        double km;
        km = miles * KATSAYI;
        System.out.println(miles + " miles = " + km + " km");
    }
}
