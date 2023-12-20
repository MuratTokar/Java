package day_053_hakan.CarRacing;

public class CarTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Car("Ferrari", 250, 1);
        new Car("Mercedes", 240, 10);
        new Car("BMW", 200, 10);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        int[] nums = new int[3];
        System.out.println(nums[4]);
    }
}
