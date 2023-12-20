package day_038_OOP.nakliyeFirmasi;

public class Runner {
    public static void main(String[] args) {

        YazihaneIsleri firma=new YazihaneIsleri();



        Esya obj1=new Esya("Buzdolabi", "Gri", 1, 2);
        Esya obj2=new Esya("Sofa", "Lila", 3, 4.5);
        Esya obj3=new Esya("Firin", "Beyaz", 1, 1.5);

       firma.esyaEkle(obj1);
       firma.esyaEkle(obj2);
       firma.esyaEkle(obj3);

       firma.esyaListesiYazdir();

        double toplamHacim= firma.hacimHesapla();
        System.out.println("Tasinacak Esyanin Toplam Hacmi :" + firma.hacimHesapla() +" m3");

        double teklifFiyati= firma.teklifGonder();
        System.out.println("Tasima Bedeli : " + teklifFiyati + " Euro");

    }
}
