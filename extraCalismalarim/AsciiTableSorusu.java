package extraCalismalarim;

import java.util.Scanner;

public class AsciiTableSorusu {
    public static void main(String[] args) {
        // Kullanicidan bir harf alin ve alfabede o harften sonraki 3.harfi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf girin");
        char girilenHarf=scan.next().charAt(0);
        System.out.println("Girlen Harf : " +girilenHarf + "\nGirilen harften sonraki harf : " +
                (char) ( girilenHarf + 1 ) + "," +
                (char) ( girilenHarf + 2 ) + "," +
                (char) (girilenHarf + 3 ));
        System.out.println("##########################################################################################");
        int a=20;
        int b=6;
        System.out.println(a/b);// 3
        // java bölünen iki sayi tam sayi ise sonucunda tam sayi kismini verir
        double c=6;
        System.out.println(a/c);// 3.3333333333333335
        // int/double=double
        // Bölünen sayilarin data türleri farkli ise sonucu daha genis olanin cinsinden veririr
        float d=6f;
        System.out.println(a / d);// 3.3333333
        // a/b nin sonucunu ondalikli olarak nasil yazariz
        System.out.println((double) (a / b));// 3.0  a/ b yi ayri paranteze alinca sonuc böyle olur ama a/b yi paranteze almasak sonuc double olur
        // sonucun doouble olmasi icin isleme girenlerden birinin double olmasi lazim
        System.out.println((double) a / b);// 3.3333333333333335
        System.out.println(a / (double) b);// 3.3333333333333335

    }
}
