package day_27_murat;

import java.text.DecimalFormat;
import java.util.Random;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.min(4, 20)); //4
        System.out.println(Math.max(4, 20)); //20
        System.out.println(Math.pow(4, 2));  //16 yani 4 üssü 2 yapip 4 ün kuvvetini aliyor.ikinciyi birincinin kuvveti yapar
        System.out.println(Math.sqrt(16));   //4 karekökünü alir


        // round,ceil,floor
    // Round= yuvarlama demek,double nin virgülden sonraki kismini int olacak sekilde yuvarlar.

        System.out.println(Math.round(2.5));// 3
        System.out.println(Math.round(2.45));// 2
        System.out.println(Math.round(2.459999999999));// 2

        System.out.println("****************** CEIL **************************************");
        // ceil (double) - tavan .üst integer  sayiya tamamliyor
        // a < verilenSayi < b => b (double)
        System.out.println(Math.ceil(2.78)); // 3.0
        System.out.println(Math.ceil(2.18)); // 3.0
        System.out.println(Math.ceil(-2.18)); // -2.0
        System.out.println(Math.ceil(-2.78)); // -2.0

        System.out.println("********** floor *************");

        // floor (double) - taban--Kücük tam sayiya yuvarlar
        // a < verilenSayi < b => a (double)
        System.out.println(Math.floor(2.78)); // 2.0
        System.out.println(Math.floor(2.18)); // 2.0
        System.out.println(Math.floor(-2.18)); // -3.0
        System.out.println(Math.floor(-2.78)); // -3.0

        System.out.println("********** Task *************");
        // TASK : verilen bir ondalik sayiyi
        // virgülden sonra 2 basamaga kadar yuvarlayacak program
        double d = 24.12645;

        // 2412.645     // *100
        // 2413         // round
        // 24.13        // /100.0
        d = Math.round(d*100)/100.0;
        System.out.println(d);
        // System.out.println(Math.round(241264.5));


        System.out.println("********** String.format() *************");
        // String.format()
        d = 24.12645;
        System.out.println(String.format("%.4f", d));

        System.out.println("********** DecimalFormat dec.format() *************");
        // DecimalFormat Class
        d = 24.12645;
        DecimalFormat dec = new DecimalFormat("#.####");
        System.out.println(dec.format(d));

        System.out.println("********** Random Class *************");
        // Random
        Random rn = new Random();
        rn.nextInt(5,15); // 5 dahil, 15 haric arasindaki integer sayilardan birini getir
        // String.format()

        // DecimalFormat


        // Random







    }
    public static void roundNumber(double d, int basamakSayisi){
        int reference = (int) Math.pow(10,basamakSayisi);
        double ref = reference;
        d = Math.round(d*reference)/ref;
        System.out.println(d);
}
}