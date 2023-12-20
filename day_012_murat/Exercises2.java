package day_012_murat;

public class Exercises2 {
    public static void main(String[] args) {
       // sekle göre cevre hesaplayan program
        // d ise 2 kenar uzunlugu,k ve c ise r degerini alacak
        char sekil='c';// d:dikdortgen, k:kare, c:cember(2*PI*r) p=3
        int r=4,b=4;
        final int PI=3;
        switch (sekil){
            case 'd':
            case 'k':
                int cevre=2*(r+b);
                System.out.println("Cevre : " + cevre);
                break;
            case 'c':
                 cevre=2*PI*r;
                System.out.println("Cevre : " + cevre);
                break;
            default:
                System.out.println("Sekil yok");


        }
    }
}
