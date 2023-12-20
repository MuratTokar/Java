package extraCalismalarim9_video_14;
// verilen 1 den buyuk bir syainin asal olup olmadigini yazdiran bir metot yazin

public class AsalSayiYazdir {
    public static void main(String[] args) {
        asalSayiMi(2);


    }
    public static void asalSayiMi(int sayi) { // neyin asal olup olmadigini yazacak-->int sayi
        int flag = 0;// flag 1 olursa asaldir 0 olursa sal degildir
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {// herhangi bir i sayisina bolunuyorsa asal degildi8r
                flag++;// flagi 1 artirip cikacak
                break;

            }


        }

        if (flag == 0) {
            System.out.println("Girilen " + sayi + " bir asal sayidir");

        } else {

            System.out.println("Girilen " + sayi + " bir asal sayi degildir");
        }


    }
}
