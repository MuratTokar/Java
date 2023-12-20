package day_17_murat;

public class Task_58 {
    public static void main(String[] args) {
        getGreaterNumber(10,20);
    }
    public static void getGreaterNumber(int birinciSayi,int ikinciSayi){

       /*if (birinciSayi>ikinciSayi){
           System.out.println("En büyük sayi:"+ birinciSayi);
       }else if (birinciSayi<ikinciSayi){
           System.out.println("en büyük;"+ikinciSayi);
       }else {
           System.out.println("");
       }*/

int enBüyük= birinciSayi < ikinciSayi ? ikinciSayi : birinciSayi;
        System.out.println(enBüyük);// bu metod da olur
        System.out.println(Math.max (birinciSayi,ikinciSayi));//Mat metodu da olur
    }
}
