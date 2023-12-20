package day_018_Exmpls;

public class M8 {

     /*
Bir hesap makinesi yapiniz.
- Methodlar, 3 argument Kabul etmeli, ikisi sayi, birisi islem türü olmali
- islem türünü karakter olarak Kabul etmeli
- Sayilar ve islem türünün siralari önemsiz olmali
Örnek:
aritmetikIslemiYap(3, 5, ’+’) -> sonuc = 8
aritmetikIslemiYap(3, ’*’ , 5) -> sonuc = 15
aritmetikIslemiYap(‘+’, 6 , 5) -> sonuc = 11
     */
     public static void main(String[] args) {

     aritmetikIslemYap(3, 5, '+'); // 8

     aritmetikIslemYap(3, '*', 5);  // 15

     aritmetikIslemYap('+', 6, 5);  // 11


     }

     private static void aritmetikIslemYap(int i, int i1, char c) {

          switch (c){
               case '+':
                    System.out.println("sonuc : " + (i+i1));break;
               case '*':
                    System.out.println("sonuc : " + (i*i1));break;
               case '-':
                    System.out.println("sonuc : " + (i-i1));break;
               case '/':
                    System.out.println("sonuc : " + (i/i1));break;
          }
     }

     private static void aritmetikIslemYap(int i, char c, int i1) {

          switch (c){
               case '+':
                    System.out.println("sonuc : " + (i+i1));break;
               case '*':
                    System.out.println("sonuc : " + (i*i1));break;
               case '-':
                    System.out.println("sonuc : " + (i-i1));break;
               case '/':
                    System.out.println("sonuc : " + (i/i1));break;
          }
     }

     private static void aritmetikIslemYap(char c, int i, int i1) {

          switch (c){
               case '+':
                    System.out.println("sonuc : " + (i+i1));break;
               case '*':
                    System.out.println("sonuc : " + (i*i1));break;
               case '-':
                    System.out.println("sonuc : " + (i-i1));break;
               case '/':
                    System.out.println("sonuc : " + (i/i1));break;
          }
     }


}
