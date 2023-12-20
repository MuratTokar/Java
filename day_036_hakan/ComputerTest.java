package day_036_hakan;

public class ComputerTest {

    public static void main(String[] args) {
        Laptop laptop = new Laptop(10,1500, 2023 );

        laptop.closeLid();
        laptop.open();
        laptop.close();
        System.out.println(laptop.toString());
    }
}
