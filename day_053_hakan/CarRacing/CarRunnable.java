package day_053_hakan.CarRacing;

public class CarRunnable implements Runnable {
    private int speed;
    private String name;
    private Thread th;
    static long start = 0;
    static long end = 0;
    static int counter = 0;

    public CarRunnable(String name, int speed, int priority) {
        counter ++;
        this.name = name;
        this.speed = speed;
        this.th = new Thread(this);
        th.setName(name);
        th.setPriority(priority);
        th.start();

        System.out.println(th.getName() + " priority : " + th.getPriority());
    }

    @Override
    public void run() {
        if(start == 0) start = System.currentTimeMillis();

        int speed = 1000/this.speed;
        for(int i = 1; i<= 10;i++ ){
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(th.currentThread().getName() + " " + (i*100) + " m ilerledi.");
        }

        if(counter == 3){
            end = System.currentTimeMillis();
            System.out.println(end - start);
        }

    }
}
