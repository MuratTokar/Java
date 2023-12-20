package day_008_murat;

public class Day8HomeWork {
    public static void main(String[] args) {
        //1-- a) 101%10 + 3*2-20/2=?
        int sonucA= 101%10 + 3*2 - 20/2;
        System.out.println("A´nin Cevabi:"+sonucA);

        // b) (2+3)*5-100%15=?
        int sonuB=(2+3)*5-100%15;
        System.out.println("B´nin sonucu:"+sonuB);

        // c) 25/5*2/5*2=?
        int sonucC=25/5*2/5*2;
        System.out.println("C´nin sonucu:"+sonucC);

        // d)12+5-3/1-2*3=?
        int sonucD=12+5-3/1-2*3;
        System.out.println("D´nin sonucu:"+sonucD);

        //e) (5+(8-4)*3-16)+2=?
        int sonucE=(5+(8-4)*3-16)+2;
        System.out.println("E´nin sonucu:"+sonucE);

        //2--Kenarlari 5cm ve 7cm olan bir diktorgenin alanini ve cevresini hesaplayan programi yaziniz.
        int a=5;int b=7;
        int cevre=2*(a+b);
        int alan=a*b;
        System.out.println("Dikdörtgenin cevresi:"  + cevre + ("cm  dir."));
        System.out.println("Dikdörtgenin alani:" + alan + (" cm dir."));

        // 3--Girilen 2 basamakli bir sayinin karesinin, 3 te birinin, 7 fazlasinin, 10 a bölümünden kalan
        //sayiyi hesaplayan programi yaziniz.
        //Input = 30 output = 7

        int girilenSayi=30;
        int sonuc=((girilenSayi*2)/3+7)%10;
        System.out.println("Girilen 2 basamakli bir sayinin karesinin, 3 te birinin, 7 fazlasinin, 10 a bölümünden kalan\t"+sonuc + (" dir"));

        //4--Girilen 5 basamakli bir sayinin, ilk basamagindaki ve son basamagindaki sayiyi toplayan
        //programi yaziniz.
        //input = 34782 output = 5
        int ilkBasamak=34782/10000;
        int sonbasamak=2/1;
        int sonucu=ilkBasamak+sonbasamak;
        System.out.println("Girilen 5 basamakli bir sayinin, ilk basamagindaki ve son basamagindaki sayiyinin toplami\t"
                +sonucu+ (" tir "));

        // 5--Bir restoranda hesap, KDV haric gelmektedir. KDV orani %18 olduguna göre, gelen hesabin,
        //KDV dahil halini veren programi yaziniz.
        //input = 100€ output = 118€
        int matrah=100;
        double kdvOrani=0.18;
        double kdvDahil=(matrah*kdvOrani)+matrah;
        System.out.println("Bir restoranda hesap, KDV haric gelmektedir. KDV orani %18 olduguna göre, gelen hesabin,\n"
                +"KDV dahil tutari " + kdvDahil +  ( " Euro dur " ));

        // 6--Bir isci günlük 100€ yevmiye ile calismaktadir. Saat ücreti ise 15€ dur. Günde max 8 saat
        //calisan bu iscinin, toplam calisma süresine göre alacagi ücreti hesaplayan program yaziniz.
        //input = 100 output = 1260€

         int yevmiye=100;
         int saacreti=15;

        //7. Verilen 4 basamakli bir sayinin rakamlari toplamini hesaplayan program yaziniz.
        // input = 1592 output = 17




    }
}
