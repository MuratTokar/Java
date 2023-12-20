package day_018_Exmpls;

import java.util.Scanner;

public class M5 {
    /*
    Palindrome sayi : Bir sayinin tersi kendisine esit ise o sayi bir palindrome sayidir.
Örnek :
12345 == 54321 -> false palindrome degildir
     12321                                           == 12321 -> true palindrome sayidir.
Kullanicinin girdigi bir sayi planidrome olup olmadigini control eden bir method
yaziniz.
Input : 12721 Output : true
Input : 16962 Output : false
     */

    public static void main(String[] args) {

    palindromeMi1();

    palindrome2();
    

    }

    public static void palindrome2() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girinikz..");
        String sayi=scanner.next();

        StringBuilder sb=new StringBuilder(sayi);

        String tersSayi=sb.reverse().toString();

        System.out.println("Girilen sayinin tesi " +tersSayi);

        boolean palindrommu= sayi.equals(tersSayi);
        System.out.println(palindrommu);

    }



    public static void palindromeMi1() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girinikz..");
        String sayi=scanner.next();  // 1234567
                                     // 1234567

        String sayiyiTesineCevir="";


        for (int i = sayi.length()-1; i >=0 ; i--) {

            sayiyiTesineCevir+=sayi.charAt(i);
        }

        System.out.println("Girilen sayinin tesi " +sayiyiTesineCevir);

        boolean palindrommu= sayi.equals(sayiyiTesineCevir);
        System.out.println(palindrommu);
        
    }


}
