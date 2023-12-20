package day_040_hakan.QE;

import java.util.ArrayList;
import java.util.List;

abstract class CarManifacture {

    private static final String brand;
    private static final String buildYear;
    private static final String address;
    private static final String phoneNumber;

    static private final ArrayList<Cars> cars = new ArrayList<>();

    static {
        brand="BMW";
        buildYear = "1916";
        address = "München";
        phoneNumber = "+49123456789";
    }



    public static String getBrand(){
        return brand;
    }

    public static String getBuildYear(){
        return buildYear;
    }

    public static String getAddress(){
        return address;
    }

    public static String getPhoneNumber(){
        return phoneNumber;
    }

    static void addNewCar(Cars car){
        cars.add(car);
    }

    public static Cars getCarWithModel(String model){
        for(Cars car  : cars){
            if(car.getModel().equals(model)){
                return car;
            }
        }
        return null;
    }

    public static List<Cars> getCarsWithModel(String model){
        List<Cars> sameModelCars = new ArrayList<>();
        for(Cars car  : cars){
            if(car.getModel().equals(model)){
                sameModelCars.add(car);
            }
        }
        return sameModelCars;
    }

    public static Cars getCarWithId(String id){
        for(Cars car  : cars){
                if(car.getCarId().equals(id)){
                    return car;
                }
        }
        return null;
    }

    public static void printAllCarsInfos(){
        for(Cars car : cars){
            System.out.println("####### New Car #######");
            System.out.print("( " +car.getCarId() + ", ");
            System.out.print(car.getModel() + ", ");
            System.out.print(car.getProductYear() +" )\n");
        }
    }



}