package day_053_hakan;

public class CounterTest {

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName() + " Threadi basladi");
        //System.out.println(Thread.currentThread().getName() + " Thread id : "  + Thread.currentThread().getId());
        Counter counter = new Counter();
        counter.setName("Counter");
        counter.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(10 / 0);
        //System.out.println(Thread.currentThread().getName() + " Thread id : "  + Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName() + " Threadi bitti");

    }
}
