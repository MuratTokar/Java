package homework18;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {
        // Kullanicidan alinan 2 sayiyi toplayan ve ciktisini alan “sum()” isminde bir metod
        //yaziniz.
        //Input : sum(3,5) Output : “Sonuc : 8”

        System.out.println("Sayilarin toplami:"+sum());

    }
    public static int sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
      int sayi1=input.nextInt();
        System.out.println("Lütfen bir sayi girin");
        int sayi2=input.nextInt();

        return sayi1+sayi2;
    }
}
