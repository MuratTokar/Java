package day_36_murat;

public class ComputerTest {
    public static void main(String[] args) {
Laptop laptop=new Laptop(10,1500,2023);
laptop.closeLid();// superclass ta metot cagiriyorum
laptop.open();
laptop.close();
        System.out.println(laptop.toString());// referans dönecek
    }
}
