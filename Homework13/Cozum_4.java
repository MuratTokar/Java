package Homework13;

public class Cozum_4 {
    public static void main(String[] args) {
        //Verilen 2 sayi arasindaki tek sayilari yazdiran program yaziniz.
        //Input : 4 , 10 Output : 5,7,9

        int baslangic = 4;
        int son = 10;

        for (int i = baslangic; i < son; i++) {
            if (i % 2 == 1) {
                System.out.print(i);
                if (i < son - 1)
                    System.out.print(", ");

            }
        }
    }
}