package day_053_hakan.CarRacing;

public class CarRunnableTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new CarRunnable("Ferrari", 1, 10);
        new CarRunnable("Mercedes", 1, 10);
        new CarRunnable("BMW", 1, 10);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        int[] nums = new int[3];
        System.out.println(nums[4]);
    }
}
