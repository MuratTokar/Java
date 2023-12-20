package extraCalismalarim7_12.video;



import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
       /* s oru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.*/

        int sayi=5;
        int faksayi=1;
        for (int i = sayi; i >=1; i--) {
            faksayi*=i;

        }
        System.out.println(faksayi);


    }
}
