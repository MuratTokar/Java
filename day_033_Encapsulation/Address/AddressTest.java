package day_033_Encapsulation.Address;

public class AddressTest {
    public static void main(String[] args) {

        Address address=new Address();
        address.setAddress("Bismark Strasse", "Frankfurt", "Hessen", 12345, "Deutschland");

        String mevcutAddress= address.getAddress();
        System.out.println("Mevcut address; "+ mevcutAddress);


        address.setAddress("Zeitloss Strasse", "Friedberg", "Hamburg", 23145, "Deutschland");

        mevcutAddress=address.getAddress();
        System.out.println("Update edilmis address; "+mevcutAddress);

    }
}
