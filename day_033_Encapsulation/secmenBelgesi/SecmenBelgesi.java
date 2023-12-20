package day_033_Encapsulation.secmenBelgesi;

import java.util.Random;
import java.util.Scanner;

public class SecmenBelgesi {
    private static String[] messages = {"Oyunuz Oyumuzdur","Yaptiklarimiz yapacaklarimizin teminatidir","1 oy 1 Oydur", " Oy verme komsuna gelir basina"};

    private String isim;
    private String sehir;
    private int sandikNo;

    static {
        Random random=new Random();
        int mesajIndex= random.nextInt(messages.length);
        System.out.println(messages[mesajIndex]);
    }

    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scanner.nextInt();

        if (yas<18){
            System.out.println("Oy kullanamazsin");
            System.exit(1);
        } else {
            Random random=new Random();
            sandikNo= random.nextInt(501) +500;
        }
    }

    public SecmenBelgesi() {
    }

    public SecmenBelgesi(String isim, String sehir) {
        this.isim = isim;
        this.sehir = sehir;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public int getSandikNo() {
        return sandikNo;
    }

    public void setSandikNo(int sandikNo) {
        this.sandikNo = sandikNo;
    }

    @Override
    public String toString() {
        return "SecmenBelgesi{" +
                "isim='" + isim + '\'' +
                ", sehir='" + sehir + '\'' +
                ", sandikNo=" + sandikNo +
                '}';
    }


}
