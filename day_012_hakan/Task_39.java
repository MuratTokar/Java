package day_012_hakan;

public class Task_39 {

    public static void main(String[] args) {
        char colorCode = 'k';

        switch(colorCode){
            case 'r':
            case 'R':
                System.out.println("Red");
                break;
            case 'O':
            case 'o':
                System.out.println("Orange");
                break;
            case 'g':
            case 'G':
                System.out.println("Green");
                break;
            default:
                System.out.println("lütfen gecerli bir karakter giriniz (r,R,g,G,o,O)");
        }

    }
}
