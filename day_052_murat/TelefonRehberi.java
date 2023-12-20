package day_052_murat;

import java.util.HashMap;
import java.util.Map;

public class TelefonRehberi implements Comparable<TelefonRehberi>{
    private String name;
    private int age;
    private String phoneNumber;
    private String ulkeKodu;
    private String sehir;

    private static Map<String,TelefonRehberi> phoneBook=new HashMap<>();

    static {
        new TelefonRehberi("Haldun","123456789","+49","Düsseldorf",45);
        new TelefonRehberi("Zafer","423456789","+49","Munchen",47);
        new TelefonRehberi("Murat","323456789","+49","Dortmund",40);
        new TelefonRehberi("Birsen","523456789","+49","Hannover",28);
        new TelefonRehberi("Turgut","723456789","+49","Leipzig",30);
        new TelefonRehberi("Abdullah","823456789","+49","Frankfurt",22);
        new TelefonRehberi("Idris","623456789","+49","Mannheim",35);
        new TelefonRehberi("Busra","362456789","+49","Nurnberg",25);
        new TelefonRehberi("Said","263456789","+49","Munster",40);
        new TelefonRehberi("Alper","462356789","+49","Koln",35);
        new TelefonRehberi("Davut","562346789","+49","Essen",45);
        new TelefonRehberi("Enes TT","762345689","+49","Hamburg",27);
        new TelefonRehberi("Enes CNK","862345679","+49","Heidelberg",30);
    }

   TelefonRehberi(String name, String phoneNumber, String ulkeKodu, String sehir,int age) {
        this.name = name;
        this.age=age;
        this.phoneNumber = phoneNumber;
        this.ulkeKodu = ulkeKodu;
        this.sehir = sehir;
        if (!phoneBook.containsKey(phoneNumber))
        phoneBook.put(phoneNumber,this);
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

    public int getAge() {
        return age;
    }

    public static Map<String, Object> getPhoneBook() {
        Map<String,Object> newMap=new HashMap<>();
        newMap.putAll(phoneBook);
        return newMap;
    }

    @Override
    public String toString() {
        return "TelefonRehberi{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ulkeKodu='" + ulkeKodu + '\'' +
                ", sehir='" + sehir + '\'' +
                '}';
    }

    @Override
    public int compareTo(TelefonRehberi tr) {
        return this.name.compareTo(tr.name);
    }
}
