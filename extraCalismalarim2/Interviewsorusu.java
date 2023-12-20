package extraCalismalarim2;

import java.util.Scanner;

public class Interviewsorusu {
    public static void main(String[] args) {
        /*
        Soru ) Interview QuestionKullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir yil giriniz");
        int yil= scan.nextInt();
        if (yil%4!=0){
            System.out.println("Artik yil degil");
        } else if(yil%100!=0) {
            System.out.println("Artik yildir");

        } else if (yil%400==0){
            System.out.println("Artik yildir");

        }else {
            System.out.println("Artik yil degil");
        }

    }
}
