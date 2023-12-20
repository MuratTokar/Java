package extraCalismalarim;

public class IncrementAndDecrement_Concatenation {
    public static void main(String[] args) {
        /*
       INCREMENT: Toplama veya carpma yaparak bir variable nin degerini artirabiliriz.Increment isleminin kalici olmasi icin 3 farkli sekilde
        assignment yapilabilir
        int sayi=10;
        sayi=sayi+3
        sayi=variable
        =:assigment
       ( sayi=sayi+3 )  kod dilinde ( sayi+=3)
       sayi++;

       DECREMENT: cikarma veya bölme yaparak bir variablenin degerini azaltabiliriz.3 sekilde yapabilirz
       int sayi=10;
       sayi=sayi-3     // sayi-=3
       sayi--;


         */
        System.out.println("##########################################################################################");
        /*
        a nin degerini 3 artirin ve yeni degerini olustutracaginiz b variable ye atayin
         */
        int a=20;
        a+=3; // veya a++;
        int b=a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // a nin degerini b ye atayin sonra a nin degerini 3 artirin
        a=20;
        b=a;
        a+=3;
        System.out.println(a);
        System.out.println(b);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // a nin degerini 2 azaltin ve sonra a nin degerini yazdirin
        a=20;
        a-=2;
        System.out.println(a);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // d nin degerini 1 artirin ve yeni degerini olusturacaginiz c  variable ye atayin
       int d = 20; // daha kisasi= int c= ++d; önce artir sonra ata
        d++;
        int c;
        c= d ;
        System.out.println("d: " + d);
        System.out.println("c: " + c);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // d nin degerini   c   ye atayin sonra d nin degerini 1 artirin
        d=20; // c=d++;
        c=d;
        d++;
        System.out.println("d nin degeri : " + d + " c nin degeri: " + c);
        // önce k yi artir sonra l ye ata
        int k=22;
        int l=++k;
        System.out.println("k : " + k  + " l: " + l);
        // önce ariracaksak ++a sonra artiracaksak a++
        System.out.println("##########################################");
        // önce k yi yazdirin sonra 1 artirn
        k=22;
        System.out.println(k++);
        System.out.println("####################################################################");
        int x=10;
        System.out.println(x++);
        System.out.println(x);
        // post increment :sonra  degeri artirir
        // Pre intrement=önce  degeri artirir
        //Eger String ile baska data türünde ki bir deger toplanirsa java sonucu String yapar
        System.out.println("################  Concatenation ##############################");
        // Bir stringi baska bir string veya primitive deger ile + isareti kullanarak isleme sokarsak java bu degiskenleri
        // birlestirerek yeni bir string olusturur
        String a1="hello";
        String b1="World";
        System.out.println(a1 + b1);
        System.out.println(a1 + " " + b1);
    }
}
