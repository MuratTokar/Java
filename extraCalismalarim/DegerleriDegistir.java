package extraCalismalarim;

import java.util.Scanner;

public class DegerleriDegistir {
    public static void main(String[] args) {


        // Kullanicidan iki sayi alip ikisininde degerlerini degistirn(swap)
        // input sayi1=10;
        // input sayi2=20;
        // output sayi1=20;
        // output sayi2=10; olacaktir.Yani degerler biribiriyle degisecek
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1.sayiyi girin(Tam sayi)");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen 2.Sayiyi girin(Tam sayi)");
        int sayi2=scan.nextInt();
        /*
        Bir bardak su ve bir bardak cayimiz olsun.Bunlari degistirmek icin ücüncü bir baska bardaga ihtiyac var.
        cayi bos bardaga aktaririz.Suyu cayin yerine koyariz.sonra cayi bosalttigimiz bos bardagi
         */
        int temp=0; // bos bardak
        temp=sayi2;// cayi bos bardaga aktardik
        sayi2=sayi1;// suyu cayin bardagina aktardik
        sayi1=temp;// cayi da suyun yerine koyduk ve 3.bardak tekrar bos kaldi
        System.out.println("Sayi 1.in yeni degeri= " + sayi1);
        System.out.println("Sayi 2.in yeni degeri= " + sayi2);


    }
}
