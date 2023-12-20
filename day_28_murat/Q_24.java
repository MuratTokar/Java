package day_28_murat;

public class Q_24 {
    public static void main(String[] args) {



        // verilen array icerisinde  bir lelmanin en az iki defa bulunup bulunmadigini kontrol eden program
        //int[] x = {1, 2, 1, 3};
       // int a = 2;

        int[] x = {1, 2, 1, 3};
        int a = 1;
        ayniSayiVarMi(x, a);
    }

    public static void ayniSayiVarMi(int[] numbers, int num) {
        // counter=elemanin array icindeki tekrarini
        // loop:array in bütün elemanlarini kontrol edecek
        // statement/condition=verilen sayinin elemana esit olup ollmadigini verecek
        // esit ise counter 1 artir
        int counter = 0;
        for (int sayi : numbers) {
            if (sayi == num) {
                counter++;
            }
        }
        System.out.println(2<=counter);
    }
}