package Homework8;

public class Q4 {
    public static void main(String[] args) {
         /*
    Girilen 5 basamakli bir sayinin, ilk basamagindaki ve son basamagindaki sayiyi toplayan
programi yaziniz.
input = 34782 output = 5
     */


            int input=34872;
            int ilkBasamak= input%10;
            int sonBasamak=input/10000;
            int toplam=ilkBasamak+sonBasamak;

            System.out.println("Rakamlarin toplami: " + toplam);

        }
}
