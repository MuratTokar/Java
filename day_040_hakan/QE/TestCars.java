package day_040_hakan.QE;

public class TestCars {
    public static void main(String[] args) {
        System.out.println(CarManifacture.getAddress());
        System.out.println(CarManifacture.getBrand());
        System.out.println(CarManifacture.getPhoneNumber());
        System.out.println(CarManifacture.getBuildYear());

        Cars car1 = new Cars("X1",2022,0.1, 60);
        Cars car2 = new Cars("X2",2023,0.07, 65);
        Cars car3 = new Cars("X2",2023,0.07, 65);

        CarManifacture.printAllCarsInfos();

        System.out.println(car1.getTankStatus());
        System.out.println(car1.isTankEmpty());
        System.out.println(car1.isTankFull());
        car1.drive(300);
        System.out.println(car1.getTankStatus());
        car1.fuelTank(5);
        System.out.println(car1.getTankStatus());
        car1.drive(500);

        CarManifacture.getCarWithModel("X1").printCarInfo();
        for(Cars car: CarManifacture.getCarsWithModel("X2")){
            car.printCarInfo();
        }
        CarManifacture.getCarWithId(car1.getCarId()).printCarInfo();
    }
}
