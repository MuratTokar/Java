package day_040_hakan.QE;

import java.util.Random;

public class Cars {


    private String carId;
    private String model;
    private int productYear;
    private double consumePerKm;
    private int tankVolume;

    private double fuelAmount;
    private int fullPercentage = 100;

    public Cars(String model, int productYear, double consumePerKm,int tankVolume){
        this.model = model;
        this.productYear = productYear;
        this.consumePerKm = consumePerKm;
        this.tankVolume = tankVolume;
        fuelAmount = tankVolume;
        carId = generateCarId();
        CarManifacture.addNewCar(this);
    }

    public String getCarId(){
        return carId;
    }

    public String getModel(){
        return model;
    }

    public int getProductYear(){
        return productYear;
    }

    public boolean isTankEmpty(){
        // < 5% TRUE, not FALSE
        return fullPercentage <= 5 ? true : false;
    }

    public boolean isTankFull(){
        // 90 % < TRUE, not FALSE
        return 90 <= fullPercentage ? true : false;
    }

    public void fuelTank(double fuelLiter){
        fuelAmount += fuelLiter;
        if(tankVolume < fuelAmount) {
            fuelAmount = tankVolume;
        }
        updateFullPercentage();
    }

    public void drive(double distance){
        fuelAmount -= consumePerKm * distance;
        if(fuelAmount < 0){
            fuelAmount = 0;
            System.out.println("Yakitiniz bitti, lütfen yakit doldurun!");
        }
        updateFullPercentage();
    }

    public String getTankStatus(){
        return fullPercentage + "%";
    }

    private void updateFullPercentage(){
        fullPercentage = (int)(fuelAmount * 100 / tankVolume);
    }

    private String generateCarId(){
        Random rn = new Random();
        String id="";
        for(int i = 1; i<=3;i++){
            id += rn.nextInt(10,100);
        }
        return id;
    }

    public void printCarInfo(){
        System.out.print("( " +getCarId() + ", ");
        System.out.print(getModel() + ", ");
        System.out.print(getProductYear() +" )\n");
    }

}
