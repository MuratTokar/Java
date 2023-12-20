package day_011_murat;

public class Task32 {
    public static void main(String[] args) {
        int a=15,b=30,c=25;
        if (a>b&&a>c){
            System.out.println("a en buyuk sayidir");

        } else if (b>a&&b>c) {
            System.out.println("b en buyukruzt");


        }else {
            System.out.println("c enbuyuktur");

            //2.yol:
        }
        int enbuyuk2=Math.max(a,b);
        int enbuyuk=Math.max(enbuyuk2,c);
        System.out.println("en buyuk : " + enbuyuk);


    }
}
