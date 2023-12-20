package extraCalismalarim;

public class Okul {
    int  numara;
    String ad;
    int yas;
    public String okulAdi="Atatürk lisesi";
    Okul(String ad,int yas,int numara){
        this.numara=numara;
        this.ad=ad;
        this.yas=yas;

    }

    void göster(){
        System.out.println (" Adi : " + ad );
        System.out.println(" Yasi : " + yas);
        System.out.println(" Numarasi : " + numara);


    }

    public static void main(String[] args) {
        // nesne olusturduk
        Okul okul1=new Okul("Ahmet",22,87);
        Okul okul2=new Okul("Mehmet",12,95);
        Okul okul3=new Okul("Veli",41,325);
        Okul okul4=new Okul("Ayse",20,12345);

        // metodu cagiriyoruz
        okul1.göster();

        System.out.println("***********");
        okul2.göster();
        System.out.println("***********");
        okul3.göster();
        System.out.println("***********");
        okul4.göster();


    }
}
