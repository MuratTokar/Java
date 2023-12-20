package Homework7;

public class Q4 {
    public static void main(String[] args) {
        /*
    4. Asagidaki sorular icin, gerekli olan degiskenleri tanimlayarak ve degerlerini atayarak gerekli
programlari yaziniz.
a. Vücut kitle endeksini hesaplayan program yaziniz.
VKI = Agirlik(kg) / (boy(m)*boy(m))
b. Bir üniversitede, yil sonu notuna, vize notlari %30, ödevler %10, final ise %60 katki
saglamaktadir.
Vize, ödev ve final notlari girildiginde yil sonu notunu hesaplayan program yaziniz.
c. Dogum yilinizi ve gelecekten bir yil degerini tutan degiskenler tanimlayiniz. Yasinizi
hesaplatip, ekrana “Ben X yilinda Y yasinda olacagim.” Yazdiriniz.
d. Yaricapi tutan bir degisken tanimlayiniz. Bu degiskene atanan degree göre, dairenin
cevresini ve alanini hesaplayan programi yaziniz.
Cevre = 2*PI*r;
Alan = PI*r*r;
“Dairenin cevresi X, dairenin alani ise Y.”
     */


        //a

        double VKI=0;
        double agirlik = 80;
        double boy=1.80;

        VKI= agirlik /( boy*boy);

        System.out.println("Vucut Kitle Endeksiniz: " + VKI);

        // b

        double vize=50;
        double odevler=80;
        double finalNot=50;
        double yilSonuNotu=(vize*0.3) + (odevler*0.1) + (finalNot*0.6);
        System.out.println("Yil Sonu Ortalamaniz: " + yilSonuNotu);

        // c
        int yas;
        int dogumYili=1977;
        int gelecektenBirYil=2033;

        yas= gelecektenBirYil - dogumYili;

        System.out.println("Ben " + gelecektenBirYil + " yilinda " + yas + " yasinda olacagim");

        // d

        double cevre;
        double alan;
        double pi=3.14;
        double r=5;

        cevre= 2*pi*r;
        alan= pi*(r*r);

        System.out.println("Dairenin cevresi= " + cevre + " , Dairenin alani ise= " + alan);


    }
}
