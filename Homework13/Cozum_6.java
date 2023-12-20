package Homework13;

public class Cozum_6 {
    public static void main(String[] args) {
        //Girilen bir sayinin asal olup olmadigini veren program yaziniz.
        //Input : 25 Output : 25 asal DEGILDIR.
        //Input : 17 Output : 17 asal bir sayidir. sadece kendisine ve 1 e bölünen sayilar asaldir
        int input = 17;
        for (int a = 2; a <= input / 2; a++) {
            if (input % a == 0) {
                System.out.println("asal degildir.");
                break;
            } else {
                System.out.println("asaldir.");
                break;

            }
        }
    }
    }