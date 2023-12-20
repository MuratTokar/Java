package day_038_OOP.database;

public class Runner {
    public static void main(String[] args) {


        CustomerDatabase customer1Database = new CustomerDatabase("NisanRaporu", 100);
        CustomerDatabase customer2Database = new CustomerDatabase("MayisRaporu", 150);

        System.out.println("Musteri 1 Veri Adi: " + customer1Database.getDataName());
        customer1Database.setDataName("HaziranRaporu");

        System.out.println("Musteri 2 Veri Adi: " + customer2Database.getDataName());

        customer1Database.printDataSize();
    }
}
