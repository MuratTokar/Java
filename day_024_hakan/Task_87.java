package day_024_hakan;

public class Task_87 {

    public static void main(String[] args) {

        int numberOfDay = 1;

        // 1.yol

        String[] gunler_1 = {"Pazartesi","Sali","Carsamba","Persembe","Cuma","Ctesi","Pazar"};

        // 3.yol
        String[] gunler_3;
        gunler_3 = new String[]{"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Ctesi", "Pazar"};


        String[] gunler_4 = new String[]{"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Ctesi", "Pazar"};

        // 2.yol

        String[] gunler_2 = new String[7];
        gunler_2[0] = "Pazartesi";
        gunler_2[1] = "Sali";
        gunler_2[2] = "Carsamba";
        gunler_2[3] = "Persembe";
        gunler_2[4] = "Cuma";
        gunler_2[5] = "Ctesi";
        gunler_2[6] = "Pazar";

        gunler_2[6] = "Pazartesi";

        // System.out.println( gunler_2[6]); 6.index e baska deger atandi



        System.out.println("Bugun günlerden "+ gunler_2[numberOfDay - 1]);
        System.out.println("Bugun günlerden "+ gunler_1[numberOfDay - 1]);

    }
}
