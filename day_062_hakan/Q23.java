package day_062_hakan;

public class Q23 {

    public static void main(String[] args) {
        char colorCode = 'y';
         int color; // initialize edilmezse hata verir
        switch (colorCode){
            case 'r':
                //int color = 100; local olarak declare edildigi icin, switch disindan ulasilamaz
                color = 100;
                break;
            case 'b':
                color=10;
                break;
            case 'y':
                color=1;
                break;
            default:
                color = 0; // her halukarda burada initialize edilecegi icin hata vermez
        }
        System.out.println(color);

    }
}
