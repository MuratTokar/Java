package day_052_hakan;

import java.util.HashMap;
import java.util.Map;

public class TelefonRehberi implements Comparable<TelefonRehberi> {
    private String name;
    private int age;
    private String phoneNumber;
    private String ulkeKodu;
    private String sehir;

    private static Map<String, TelefonRehberi> phoneBook = new HashMap<>();

    static {
        new TelefonRehberi("Haldun",45, "180000000", "+49", "Dusseldorf");
        new TelefonRehberi("Zafer", 47,"170000000", "+49", "Munchen");
        new TelefonRehberi("Murat", 40, "16000000", "+49", "Dortmund");
        new TelefonRehberi("Birsen", 20,"150000000", "+49", "Hannover");
        new TelefonRehberi("Turgut", 30,"140000000", "+49", "Leipzig");
        new TelefonRehberi("Abdullah", 22,"130000000", "+49", "Frankfurt");
        new TelefonRehberi("Davut", 42,"220000000", "+49", "Essen");
        new TelefonRehberi("Idris", 35,"120000000", "+49", "Mannheim");
        new TelefonRehberi("Busra", 25,"190000000", "+49", "Nurnberg");
        new TelefonRehberi("Said", 40,"20000000", "+49", "Munster");
        new TelefonRehberi("Alper", 35,"210000000", "+49", "Koln");
        new TelefonRehberi("Enes TT", 34,"230000000", "+49", "Hamburg");
        new TelefonRehberi("Enes CNK", 30,"240000000", "+49", "Heidelberg");
    }

    TelefonRehberi(){

    }
    TelefonRehberi(String name, int age, String phoneNumber, String ulkeKodu, String sehir){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.ulkeKodu = ulkeKodu;
        this.sehir = sehir;
        if(!phoneBook.containsKey(phoneNumber))
            phoneBook.put(phoneNumber, this);
        else
            System.out.println("Please enter a different phoneNumber");
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUlkeKodu() {
        return ulkeKodu;
    }

    public String getSehir() {
        return sehir;
    }

    public static Map<String, TelefonRehberi> getPhoneBook() {
       Map<String, TelefonRehberi> newMap = new HashMap<>();
       newMap.putAll(phoneBook);
       return newMap;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "TelefonRehberi{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ulkeKodu='" + ulkeKodu + '\'' +
                ", sehir='" + sehir + '\'' +
                "}\n";
    }

    @Override
    public int compareTo(TelefonRehberi tr) {
        return this.name.compareTo(tr.name);
    }
}
