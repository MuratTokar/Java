package homework12;

public class Cozum_1 {
    public static void main(String[] args) {
      /*
        1. Girilen cinsiyet karakterine göre, cinsiyetini yazdiran programi yaziniz.
Input : K Output : Kadin
Input : E Output : Erkek
       */
        char cinsiyet='H';
        switch (cinsiyet){
            case 'K':
            case 'k':
                System.out.println("Cinsiyet Kadindir");
                break;
            case 'E':
            case 'e':
                System.out.println("Cinsiyet Erkektir");
                break;
            default:
                System.out.println("Gecerli bir karakter girin");
        }
    }
}
