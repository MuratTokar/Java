package extraCalismalarim;

public class AsciiTable {
    public static void main(String[] args) {
        // cahr data türündeki variable ve degerler sayisal data türlerine atanirsa veya sayisal data türündrki datalarla
        // isleme sokulursa ASCII table deki degerleri ile isleme girer

        System.out.println(5 + 'a');
        char ilkHarf=101;
        System.out.println(ilkHarf);// e

        // kullanicinin verdigi harften bir sonraki harfi yazdiran programi yazin
        char girilenChar='f';
        System.out.println(girilenChar+1);// 102+1=103
        // biz 103 u  degil 103 un karsiligi olan char ifadeyi yazdirmak istersek explicit

        System.out.println("Girilen harfin bir sonrasi: " +(char)(girilenChar+1));// g

        // verilen bir harfin 2 önceki harfi yazdirin

        girilenChar='M';
        System.out.println(girilenChar-2); //=78 : sadece m nin ascii table deki degerine bakmis
        System.out.println((char) (girilenChar-2));// K


    }
}
