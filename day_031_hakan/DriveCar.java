package day_031_hakan;

public class DriveCar {

    /**
     * DriveCar
     * Fields:
     * - brand, model, fuelType, gears, isEngineOn = false, isWindowsOpen=false, double consumePerKM;
     * Class Variables :
     * - temperature;
     *
     * - getConsume(km:) // yakit tüketimi
     *
     * - startEngine(); // Motoru calistir, calisip, calismadigini memory de tut
     * - stopEngine(); // Motoru durdur, calisip, calismadigini memory de tut
     *
     * - gearUp(); () // calisip calismadigini kontrol et
     * - gearDown(); //  calisip calismadigini kontrol et
     *
     * - speedUp(x); // hiza göre vites arttir, calisip calismadigini kontrol et
     * - speedDown(x); // hiza göre vites azalt, calisip calismadigini kontrol et
     *
     * - openWindows(); // check the status of windows and temperature, then update the status of isWindowsOpen
     * - closeWindows(); // check the status of windows and temperature, then update the status of isWindowsOpen
     * - getCarInfo(); // brand, model, fuelType, consumePerKM, gears
     * - getDrivingInfo(); // hiz, vites, isWindowsOpen, isEngineOn
     */
    // instance variables / fields
    String brand; // marka
    String model;
    String fuelType; // Yakit türü
    int gears; // vites sayisi 6
    int currentGearStatus; // vites sayisi
    int speed; // hiz
    double consumePerKM;
    boolean isEngineOn;
    boolean isWindowsOpen;

    // class variable
    static double temperature;

    public DriveCar(String brand, String model, String fuelType, int gears, double consumePerKM){
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumePerKM = consumePerKM;
    }

    public void getConsume(double distance) {
        System.out.println(distance * consumePerKM);
    }

    public void startEngine() {
        if (!isEngineOn) {
            System.out.println("Araba calistiriliyor... Huluggggggggggg");
            isEngineOn = true;
            this.currentGearStatus = 1;
        } else {
            System.out.println("Araba zaten calisiyor..!");
        }
    }

    public void stopEngine() {
        if (isEngineOn) {
            System.out.println("Araba durduruluyor... Burrrrrrrrrr");
            isEngineOn = false;
            this.currentGearStatus = 0;
            this.speed = 0;
        } else {
            System.out.println("Araba zaten duruyor...!");
        }
    }

    public void gearUp() {
        if (isEngineOn) {
            if (this.currentGearStatus < this.gears) {
                System.out.println("Vites arttiriliyor...");
                this.currentGearStatus++;
                checkRPM();
            }
            System.out.println("Hiz : " + this.speed);
            System.out.println("Vites : " + this.currentGearStatus);

        } else {
            System.out.println("Lütfen önce arabayi calistirin");
        }

    }

    public void gearDown() {
        if (isEngineOn) {
            if (1 < this.currentGearStatus) {
                System.out.println("Vites azaltiliyor...");
                this.currentGearStatus--;
                checkRPM();
            }
            System.out.println("Hiz : " + this.speed);
            System.out.println("Vites : " + this.currentGearStatus);

        } else {
            System.out.println("Lütfen önce arabayi calistirin");
        }
    }

    public void speedUp(double rate) {
        // Hiz - vites methodu
        if (isEngineOn) {
            System.out.println("Hiz arttiriliyor...");
            this.speed += rate;
            adaptGearSpeedCorralation();
            System.out.println("Hiz : " + this.speed);
            System.out.println("Vites : " + this.currentGearStatus);
        } else {
            System.out.println("Lütfen önce arabayi calistirin");
        }
    }

    public void speedDown(double rate) {
        // Hiz - vites methodu
        if (isEngineOn) {
            if(speed < rate ) {
                System.out.println("Araba yeterince hizli degil!");
            } else {
                System.out.println("Hiz azaltiliyor...");
                this.speed -= rate;
                adaptGearSpeedCorralation();
                System.out.println("Hiz : " + this.speed);
                System.out.println("Vites : " + this.currentGearStatus);
            }

        } else {
            System.out.println("Lütfen önce arabayi calistirin");
        }
    }

    public void openWindows() {
        if(20 < temperature && !isWindowsOpen){
            System.out.println("Camlar aciliyor...");
            this.isWindowsOpen = true;
        } else if(isWindowsOpen){
            System.out.println("Camlar zaten acik!");
        } else {
            System.out.println("Hava cok soguk, camlar acilamiyor");
        }

    }

    public void closeWindows() {
        if(isWindowsOpen){
            System.out.println("Camlar kapatiliyor...");
            this.isWindowsOpen = false;
        } else {
            System.out.println("Camlar zaten kapali!");
        }
    }

    public void getCarInfo() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Fuel Type : " + this.fuelType);
        System.out.println("Consume per KM : " + this.consumePerKM);
        System.out.println("Gears : " + this.gears);
    }

    public void getDrivingInfo() {
        System.out.println("Speed : " + this.speed);
        System.out.println("Actual gear : " + this.currentGearStatus);
        System.out.println("Windows status : " + this.isWindowsOpen);
        System.out.println("Engine status : " + this.isEngineOn);
    }

    public void adaptGearSpeedCorralation(){
        this.currentGearStatus = this.speed / 20;
    }

    public void checkRPM(){
        double expectedSpeed = this.currentGearStatus *20;
        if(this.speed < expectedSpeed - 10){
            System.out.println("Arabanin devri düsük");
        } else if( expectedSpeed + 10 < this.speed){
            System.out.println("Arabanin devri yüksek");
        } else {
            System.out.println("Araba devrinde gidiyor....");
        }
    }
}
