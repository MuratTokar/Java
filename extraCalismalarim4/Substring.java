package extraCalismalarim4;

public class Substring {
    public static void main(String[] args) {
        /* verilen bir stringin istedigimiz bir bolumunu bize döndürür.tek yada cift parametre kullanilir.girdigimiz
        * index numarasinda itibaren göre bize getirir.Buna tek parametre substring denir
        * eger sondan istenen karakteri elde etmek istrsek length()-istenen karakter sayisi kullaniri */

        String str="Java ne kadar güzel";

        System.out.println(str.substring(8)); // kadar güzel

        System.out.println(str.substring(2, 7));// van---ilk index dahil ama son index dahil degil

        System.out.println(str.substring(str.length() - 3));// zel ---sondan 3.index ten baslayip sonuna kadar gider

        System.out.println(str.substring(str.length()));// hiclik yani bos satir

        System.out.println(str.substring(2, 3).toUpperCase());// 2.karakteri buyuk yazdik

    }
}
