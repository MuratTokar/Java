package day_33_murat;
import java.util.ArrayList;

import static java.lang.Math.*;

public class StaticInport {
    public static void main(String[] args) {
        System.out.println(Math.min(5, 6));// burada math sinifini tamamen kullanmak icin inporttaki math sonuna yildiz
        // koysam her seferinde math yazmamam gerek kalmz
        //System.out.println(Math.max(5, 6));
        System.out.println(max(5, 6));// yani math yamadik sadece max yazdik
        System.out.println(pow(2, 3));// pow 3 u 2 nin ussu yapti ve sonuc 8
        ArrayList<String> list=new ArrayList();

        /*
        Static import ,bize class ismini kullanmadan o classin icerisindeki method isimlerini yazarak erisebilmemize olanak msaglar
        fakat class ismini kullanmak o methodun nereye ait oldugunu gormek ve kodu daha kolay okuyabilmek icin
        tercih edilmesi tavsiye edilir
         */


    }
}
