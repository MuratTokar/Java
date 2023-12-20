package day_053_hakan.CarRacing;

public class Car extends Thread{
    private int speed;

    public Car(String name, int speed, int priority) {
        super(name);
        this.speed = speed;
        this.setPriority(priority);
        this.start();
        System.out.println(this.getName() + " priority : " + this.getPriority());
    }

    @Override
    public void run() {
        int speed = 1000/this.speed;
        for(int i = 1; i<= 10;i++ ){
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(currentThread().getName() + " " + (i*100) + " m ilerledi.");
        }
    }
}
