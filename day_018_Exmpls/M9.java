package day_018_Exmpls;

public class M9 {
    /*
Alan hesaplayan bir proram yaziniz.
- Ayni isimde bir dairenin veya dikdörtgenin alanine hesaplayabilmeli
- PI sayisini 3 aliniz
- Daire Alani = PI * yaricap * yaricap; Dikdörtgen Alani = kisaKenar * uzunKenar;
Input : alanHesapla(5) Output : 75
alanHesapla(4,5) Output : 20
     */


    public static void main(String[] args) {

        System.out.println(alanHesapla(5));

        System.out.println(alanHesapla(4, 5));


    }

    public static int alanHesapla(int i, int i1){

        return i*i1;
    }

    public static int alanHesapla(int i) {
        int PI=3;
        return PI*i*i;
    }
}
