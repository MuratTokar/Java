package day_020_hakan.homework;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    /*

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Baslangic yili : ");
        int baslangicYili = input.nextInt();

        System.out.print("Bitis yili : ");
        int bitisYili = input.nextInt();

        int year = calculateYear(baslangicYili, bitisYili);
        int month = calculateMonth();
        int day = calculateDay(year, month);

        System.out.println(day + "." + month + "." + year);

    }

    public static int calculateDay(int year, int month){
        Random rn = new Random();
        int day = 0;
        // year = 4k -> month=2 maks day 29, haricinde month=2 maks day = 28
        // 4,6, 9, 11 -> maks 30
        // 1,3,5,7,8,10,12 -> maks 31
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = rn.nextInt(1,32);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = rn.nextInt(1,31);
                break;
            case 2:
                if(year%4==0){
                    day = rn.nextInt(1,30);
                } else {
                    day = rn.nextInt(1,29);
                }
                break;
            default:
                System.out.println("Gecersiz ay!");
                break;
        }
        return day;
    }

    public static int calculateYear(int baslangic, int bitis){
        Random rn = new Random();
        int year = rn.nextInt(baslangic,bitis+1);
        return year;
    }

    public static int calculateMonth(){
        Random rn = new Random();
        int month = rn.nextInt(1,13);
        return month;
    }

     */
}
