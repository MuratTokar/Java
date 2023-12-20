package day_013_murat;

public class VV {
    public static void main(String[] args) {
        // girilen sayinin cift mi  tek mi oldugunu  kontrol eden programi yaziniz.

        int a=4;
        if (a%2==0){
            System.out.println( a + " cift sayidir");
        }else {
            System.out.println( a + " tek saidir");
        }
        System.out.println("***********************************************");
        switch (a%2){
            case 0:
                System.out.println( a + " bir cifttir");
                break;
            case 1:
                System.out.println(a + " bir tektir");
                break;
        }
        char not='A';
        if (not=='A'||not=='a'){
            System.out.println("Cok basarili");
        } else if (not=='B'||not=='b') {
            System.out.println("Basarili");

        }else {
            System.out.println("Gecersiz  not");
        }
        System.out.println("*********************************************");

        switch (not){
            case 'A':
            case 'a':
                System.out.println("Cok basarilisiniz");
                break;
            case 'B':
            case 'b':
                System.out.println("Basarili");
                break;
            default:
                System.out.println("Basarisiz");
                break;
        }
        String name="Deniz";
        String cinsiyet="Kadin";

        int erkekDenizSayisi=0;
        int kadinDenizSayisi=0;

        if (name=="Deniz"){
            if (cinsiyet=="Kadin"){
                kadinDenizSayisi++;

            }
        }else {
            erkekDenizSayisi++;
        }
    }
}
