package day_31_murat;

public class DriveCar {
    /**
     * DriveCar
     * Fields:
     * - brand, model, fuelType, gears, isEngineOn = false, isWindowsOpen=false, double consumePerKM;
     * Class Variables :
     * - temperature;
     * - getConsume(km:) // yakit tüketimi
     * - startEngine(); // calisip, calismadigini memory de tut
     * - gearUp(); () // calisip calismadigini kontrol et
     * - gearDown(); //  calisip calismadigini kontrol et
     * - speedUp(x); // hiza göre vites arttir, calisip calismadigini kontrol et
     * - speedDown(x); // hiza göre vites azalt, calisip calismadigini kontrol et
     *
     * - openWindows(); // check the status of windows and temperature, then update the status of isWindowsOpen
     * - closeWindows(); // check the status of windows and temperature, then update the status of isWindowsOpen
     * - getCarInfo(); // brand, model, fuelType, consumePerKM, gears
     * - getDrivingInfo(); // hiz, vites, isWindowsOpen, isEngineOn
     */

    // Field leri yada variables  olusturalim:

    String brand; // marka
    String model;
    String fuelType; // yakit türü
    int gears; // vites sayisi 6
    int currentGearStatus;// vites
    double consumePerKM;
    boolean isEngineOn;
    boolean isWindowsOpen;
    int speed;//hiz

    // Class Variable:

    static double temperature; // genel bilgi oldugu icin static yaptik


    // METOTLAR:
    public void getConsume(double distance){ // km yi alacak
        System.out.println(distance * consumePerKM);
    }
    public void startEngine(){ // birsey dönmeyecek
        if (!isEngineOn) {// eger araba calismiyorsa
            System.out.println("Araba calistirliyor");
            isEngineOn = true;

        }else{
            System.out.println("Araba zaten calisiyor");
        }
    }
    public void stopEngine() { // birsey dönmeyecek
        if (isEngineOn) {
            System.out.println("Araba durduruluyor");
            isEngineOn = false;
        }else {
            System.out.println("Araba zaten duruyor");
        }
    }
    public  void gearUp(){
        this.gears++;
    }
    public void gearDown() {
        if (isEngineOn ) {
            if ( this.currentGearStatus<this.gears){

            }
            System.out.println("Vites : " + this.currentGearStatus);
            this.currentGearStatus++;

        }else {
            System.out.println("Lütfen once arabayi calistirin");
        }
    }
    public void speedUp(double rate){
       this.speed+=rate;

    }
    public void speedDown(double rate) {
        this.speed -= rate;
    }
    public void openWindows(){
        this.isWindowsOpen=true;
    }
    public void closeWindows() {
        this.isWindowsOpen = false;
    }
   public void  getCarInfo(){
        //brand, model, fuelType, consumePerKM, gears

    }
    public void getDrivingInfo(){
        // hiz, vites, isWindowsOpen, isEngineOn

    }






}
