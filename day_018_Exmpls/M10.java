package day_018_Exmpls;

public class M10 {
    /*
    10. Bir ögrencinin ismi, sinifi, ögrenci numarasi girildiginde “$ögrnenciNumarasi numarali
$name ismindeki ögrenci, $sinif sinifinda ögrenimine devam etmektedir.” Seklinde
cikti veren program yaziniz.
(ögrenci ismi -> String, sinif -> char, ögrenci numarasi -> int)
- Girilen degerlerin sirasinin önemi olmamali
Örnek :
ögrenciBilgileriYazdir(“Satilmis“, 12345, `C`)
ögrenciBilgileriYazdir(`C`, “Satilmis“, 12345)
Output :
“12345 numarali Satilmis ismindeki ögrenci, C sinifinda ögrenimine devam
etmektedir.”
     */

    public static void main(String[] args) {

    ogrenciBilgileriYazdir("Satilmis", 12345, 'C');

    ogrenciBilgileriYazdir('C',"Satilmis", 12345);

    }

    public static void ogrenciBilgileriYazdir(char z, String x, int y) {
        System.out.println(y+ " numarali " + x + " ismindeki ogrenci, " + z + " sinifinda ogrenimine devam etmektediir");
    }


    public static void ogrenciBilgileriYazdir(String x, int y, char z) {
        System.out.println(y+ " numarali " + x + " ismindeki ogrenci, " + z + " sinifinda ogrenimine devam etmektediir");
    }


}
