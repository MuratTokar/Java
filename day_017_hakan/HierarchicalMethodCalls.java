package day_017_hakan;

public class HierarchicalMethodCalls {

    public static void main(String[] args) {
        // verilen bir sayinin 2 katinin, 3 te birinin, 5 fazlasini hesaplayan program
        denklemiCoz(6); // argument 6
    }

    public static void denklemiCoz(double a){ // parameter double a

       double sonuc = carpma(a);
        sonuc = bolme(sonuc);
        sonuc = topla(sonuc);
        System.out.println("Sonuc " + sonuc);
    }

    public static double topla(double a){

        return a + 5;
    }

    public static double carpma(double a){

        return 2 * a ;
    }

    public static double bolme(double a){

        return a / 3 ;
    }
}
