package day_017_hakan;

import java.util.Scanner;

public class Task_61 {

    public static void main(String[] args) {
        boolean devamMiTamamMi = true;
        while(devamMiTamamMi) {
            devamMiTamamMi = calculateAge();
        }
    }

    public static boolean calculateAge(){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dogum yilinizi giriniz! : ");
        int dogumYili = input.nextInt();
        if(dogumYili == 0){
            return false;
        }
        System.out.println("Yasiniz : " + (2023-dogumYili));
        return true;
    }
}
