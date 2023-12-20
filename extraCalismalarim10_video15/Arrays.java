package extraCalismalarim10_video15;

public class Arrays {
    // Array non primitive data turu oldugu icin direkt yazdirilamaz ama direk yazdirmaya calisirsak bize array i degil
    // referans numarasini yazdiracaktir.Array i yazdirmak icin toString kullaniriz
    public static void main(String[] args) {
        int[] sayi={5,6,8,10};


       // System.out.println(sayi);// [I@7d417077  referans numarasini yazdirir


        for (int i = 0; i <sayi.length ; i++) {
           // System.out.print(sayi[i] + " "); //  5 6 8 10
            System.out.println(" Index "  +  i  +  " Deger " + sayi[i] ); //  5 6 8 10


        }
        int[] sayi1={5,6,8,10};
        System.out.println();
    }
}
