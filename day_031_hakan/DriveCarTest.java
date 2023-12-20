package day_031_hakan;

import day_036_hakan.AccessModifiers;

public class DriveCarTest {
    public static void main(String[] args) {
        DriveCar car_1 = new DriveCar("BMW", "X5", "Diesel",
                8, 0.30);

        DriveCar.temperature = 25;

        car_1.getConsume(300);
        car_1.getCarInfo();

        System.out.println("**************** Engine OFF **************");
        car_1.closeWindows();
        car_1.gearDown();
        car_1.gearUp();
        car_1.speedDown(20);
        car_1.speedUp(30);
        car_1.stopEngine();
        car_1.openWindows();
        car_1.getDrivingInfo();
        System.out.println("**************** Engine ON **************");
        car_1.startEngine();
        car_1.openWindows(); // camlar zaten acik!
        car_1.gearDown();
        car_1.gearUp();
        car_1.gearUp();
        car_1.gearUp();
        car_1.gearUp();
        car_1.gearUp();
        car_1.gearUp();
        car_1.gearUp();
        car_1.gearUp();
        car_1.gearUp();
        car_1.gearUp();
        car_1.getDrivingInfo();
        car_1.speedDown(20);
        car_1.speedDown(20);
        car_1.speedDown(20);
        car_1.getDrivingInfo();
        car_1.speedUp(30);
        car_1.speedUp(30);
        car_1.speedUp(30);
        car_1.speedUp(30);
        car_1.getDrivingInfo();
        car_1.closeWindows();
        car_1.gearDown();
        car_1.gearDown();
        car_1.gearDown();
        car_1.gearDown();
        car_1.getDrivingInfo();
        car_1.stopEngine();
        car_1.getDrivingInfo();

    }
}
