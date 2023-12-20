package day_017_hakan;

import java.util.Scanner;

public class Task_63 {

    // (F-32)*100/180 = celcius

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Fahrenheit giriniz : ");
        int fahrenheit = input.nextInt();
        calculateCelcius(fahrenheit);
    }

    public static void calculateCelcius(int fahrenheit){
        int celcius = (fahrenheit-32)*100/180;
        System.out.println(fahrenheit + " Fahrenheit = " + celcius + " Celcius");
    }
}
