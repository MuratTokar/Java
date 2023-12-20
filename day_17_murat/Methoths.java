package day_17_murat;

public class Methoths {
    public static void isimimiYazdir() { // metod tanimladik} parametre almayan metottur.
        System.out.println("Murat");// metodun icine islem yaptik--Sonra main de ismimiYazdir metodunu cagirip basiyoruz

    }

    public static void islem() {// metod tanimladik
        double a = 20, b = 3;
        System.out.println("Carpma:" + (a * b)); // icine islem yaptik
        System.out.println("Bölme:" + (a / b));
    }

    public static void main(String[] args) {
        isimimiYazdir();
       /*
      selam();// metodu cagirdik
    */
        islem(); // cagirdik
        String str = "MURAT";
        System.out.println(str.toLowerCase());// str.toLowerCase() Büyük yaziyi kücük yaziya cevirir
        dünyayyiSelamla();
        yeniGün();
    }

    public static void dünyayyiSelamla() {
        System.out.println("Merhaba dünya");
    }

    public static void yeniGün() {
        System.out.println("Yeni bir güne merhaba");
    }
}

