package day_053_hakan;

public class Counter extends Thread {
    @Override
    public void run() {
        System.out.println(currentThread().getName() + " Threadi basladi");
        //System.out.println(currentThread().getName() +  " Thread id : " + currentThread().getId());
        for(int i = 1; i<= 10;i++ ){
            System.out.println(currentThread().getName() + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(currentThread().getName() + " Threadi bitti");
    }
}
