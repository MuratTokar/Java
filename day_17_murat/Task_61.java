package day_17_murat;

import java.util.Scanner;

public class Task_61 {
    public static void main(String[] args) {

calculateAge();
    }
    public static void calculateAge(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen dogum yilinizi giriniz");
        int dogumYili=input.nextInt();
        System.out.println("Yasiniz :"+(2023-dogumYili));
    }
}
