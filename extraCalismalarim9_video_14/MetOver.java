package extraCalismalarim9_video_14;

public class MetOver {
    public static void main(String[] args) {
        // bir class ta yni isme sahip farkli islem yapan methodlar olabilir.
        // java bu methodlardan hangisinin calisacagina parametrelere gore karar verir
        // bir class ta ismi ayni ,parametreleri farkli methodlar olmasina method overloading denir
        // parametreleri farkli olmak zorunda ama return type onemli degil

        /*
        * ACCES MODIFIER:
        * 1-Public:Proje icerisinde tum class lardan ulasilabilir
        * 2Protected:icinde bulundugu package ve childclass lardan ulasilir
        * 3-Default:sadece bulundugu package icinden ulasilir
        * 4-Private:sadece bulundugu class da ulasilir
        * -->> static olarak isaretlenmis metotlar ,metot disinda bulunan variable ve metotlardan sadece
        * sadece static olanlar direkt ulasabilir
        * */

        topla(3,5);//int-int 8
        topla(3.4,2.3);// double-double 5,7
        topla(3,2.3);// int-double
        topla(2.3,5);// double -int

        topla('a','b');// integer metodu bunu kabul eder cunku asci de harfler integer gibi davranir
        topla(3f,4f);// double kabul etti .cunku double float tan buyuk
        topla(3f,4);// double ve int kabul etti.
        // java overloading:
        //1-isim ve parametreleri ayni olan birden fazla metot olusturulamaz.
        //2-data türleri farkli olan parametrelerin yerlerini degistirirsek
        // java yeni bir metot olarak kabul eder.(int,double)(double int)
    }
    public static void topla(int a,int b){
        System.out.println("Iki integer sayinin toplami : " + (a + b));
    }
    public static void topla(double a,double b){
        System.out.println("Iki double  sayinin toplami : " + (a+b));

    }
    public static void topla(int sayi1,double sayi2){
        System.out.println("Int sayi ile double sayinin toplami : " + (sayi1+sayi2));

    }
    public static void topla(double sayi2,int sayi1){
        System.out.println("Double sayi ile int sayinin toplami : " + (sayi2+sayi1));
    }
}
