package day_018_Exmpls;

public class M6 {
    /*
    Bir sayinin küpünün, 4’te birinin, 10 fazlasini veren sayiyi hesaplayan bir program
yaziniz.
Her islemi bir methoda yaptiriniz.
Örnek : küpünüAl(num) -> return sayininKüpü
ceyreginiHesapla(sayininKüpü) -> return sayininCeyregi
OnFazlasiniHesapla(sayininCeyregi) -> sayininOnFazlasi
Input : 4 Output : 26
Input : 6 Output : 64

4  ==========>  4*4*4=64  ========= 64/4=16   ========= 16+10=26
     */


    public static void main(String[] args) {

    denklemiHesapla();



    }

    public static void denklemiHesapla() {

        kupunuAl(4);
        ceyreginiHesapla(64);
        System.out.println(OnFazlasiniHesapla(16));


    }

    public static int OnFazlasiniHesapla(int i) {
        return i+10;
    }

    public static int ceyreginiHesapla(int kupunuAl) {
        return kupunuAl/4;
    }

    private static int kupunuAl(int i) {
        return i*i*i;
    }


}
