package day_18_murat;

public class Task_67 {
    public static void main(String[] args) {
        // 2 sayiyi argument olarak kabul eden
        // Son rakamlari esit ise true, degilse false dönen
        // bir method yaziniz
        boolean sonuc;
        sonuc=sonBasamaklariEsitMi(34456,1238576);
        System.out.println(sonuc);
        sonuc=sonBasamaklariEsitMi(34456,1238597);
        System.out.println(sonuc);
    }
public static boolean sonBasamaklariEsitMi(int num1,int num2){
        int num1SonBasamak=num1%10;
        int num2SonBasamak=num2%10;
    // 1.Yol:boolean sonuc=num1SonBasamak==num2SonBasamak ? true : false;
        return num1SonBasamak==num2SonBasamak;
}
}
