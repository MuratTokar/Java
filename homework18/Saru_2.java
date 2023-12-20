package homework18;

import java.util.Scanner;

public class Saru_2 {
    public static void main(String[] args) {

/*
    Kullanicinin girdigi bir sayiyinin karesini hesaplayan bir metod yaziniz.
Input : karesiniAl(5) Output : 5’in karesi = 25
Not : Math class i icerisinde benzer bir metod var mi control ediniz.*/
karesiniAl();

    }
    public static int karesiniAl(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1 sayi girin");
        int sayi = input.nextInt();
        return sayi*sayi;

    }


    }


