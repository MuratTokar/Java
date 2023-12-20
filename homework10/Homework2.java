package homework10;

public class Homework2 {
    public static void main(String[] args) {

/*2-Verilen 4 sayidan en büyügü ve en kücügü veren programi yaziniz.
        Input : 3, 5, 12, 40 Output : En kücük sayi 3, en büyük sayi ise 40 tir
        */
        int ilkSayi=3, ikinciSayi=5, ücüncüSayi=12, dördüncüSayi=40;

        int enKücükSayi=dördüncüSayi;

        if (ilkSayi<enKücükSayi){
            enKücükSayi=ilkSayi;
        }
        if (ikinciSayi<enKücükSayi){
            enKücükSayi=ikinciSayi;
        }
        if (ücüncüSayi<enKücükSayi) {
            enKücükSayi=ücüncüSayi;
        }
int enBuyukSayi=ilkSayi;

        if (ikinciSayi>enBuyukSayi){
            enBuyukSayi=ikinciSayi;
        }
        if (ücüncüSayi>enBuyukSayi){
            enBuyukSayi=ücüncüSayi;
        }
        if (dördüncüSayi>enBuyukSayi){
            enBuyukSayi=dördüncüSayi;
        }

        System.out.println("En kücük sayi " + enKücükSayi + " en büyük sayi " + enBuyukSayi + " tir.");


    }
}
