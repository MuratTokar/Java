package Homework13;

public class Cozum_5 {
    public static void main(String[] args) {
        //5. Girilen sayinin kac basamakli oldugunu veren programi yaziniz.
        //Input : 1234567890 Output : Girilen sayi 10 basamaklidir.
        long input=1234567890l;
        int sayac=0;
        for (long i = input; input!=0;  input/=10) {// <=0 da olabilir
            sayac++;
        }
            System.out.println(" Girilen sayi " + sayac + " basamaklidir");

    }
}
