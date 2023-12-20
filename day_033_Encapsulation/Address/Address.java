package day_033_Encapsulation.Address;

public class Address {

    private String street;
    private String city;
    private String state;
    private int postalCode;
    private String country;

    public Address() {
    }

    public void setAddress(String street, String city, String state, int postalCode, String country){
        this.street=street;
        this.city=city;
        this.state=state;
        this.postalCode=postalCode;
        this.country=country;
    }

    public String getAddress(){
        return street + ", " + city + ", " + state + ", " + postalCode + ", " + country;
    }






}
