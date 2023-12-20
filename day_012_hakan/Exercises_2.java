package day_012_hakan;

public class Exercises_2 {

    public static void main(String[] args) {
        // sekle göre cevre hesaplayan program
        // d ise 2 kenar uzunlugu, k veya c ise r degerini alacak sekilde
        char sekil = 'h'; // d : dikdortgen k: kare c : cember(2*PI*r) PI=3
        int r = 4, b = 4;
        final int PI = 3;

        switch(sekil){
            default:
                System.out.println("Sekil YOK");
                break;
            case 'd':
            case 'k':
                int cevre = 2*(r + b);
                System.out.println("Cevre : " + cevre);
                break;
            case 'c':
                cevre = 2*PI*r;
                System.out.println("Cevre : " + cevre);
                break;
        }
        int a=6,b1=7;
        final int Pi=3;
        char sekil2='d';
        switch (sekil2){
            case 'd':
            case 'k':
                int cevre=2*(a+b1);
                System.out.println(cevre);
                break;
            case 'c':
                cevre=2*Pi*r;
                System.out.println(cevre);
                break;
            default:
                System.out.println("gecersiz");
                break;
        }



    }
}
