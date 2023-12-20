package day_018_hakan;

public class Task_67 {

    // 2 sayiyi argument olarak kabul eden
    // Son rakamlari esit ise true, degilse false dönen
    // bir method yaziniz

    public static void main(String[] args) {
        boolean sonuc;
        sonuc = sonBasamaklariEsitMi(34456, 12345789);
        System.out.println(sonuc); // false
        sonuc = sonBasamaklariEsitMi(34456, 123457896);
        System.out.println(sonuc); // true

    }

    public static boolean sonBasamaklariEsitMi(int num1, int num2){
        int num1SonBasamak = num1%10;
        int num2SonBasamak = num2%10;
        //boolean sonuc = num1SonBasamak == num2SonBasamak ? true : false ;
        return num1SonBasamak == num2SonBasamak;
    }
}
