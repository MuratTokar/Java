package day_32_murat;

public class MobilPhone {
    // class mobilphone
    //field;brand,model ,is 5g,color,price,memory,screenSize
    //call();// battery %2
    // saveToMemory(filesize)// memory -filesize -battry %2// dosya boyutu=file size
    // takephoto//10mb per photo,battery %1
    // getters :all
    //setters:all,except freeMemory

   private String brand;
   private String model;
   private boolean is5G;
   private String color;
   private int price;
   private int memory;
   private double screenSize;
   private int freiMemory;
   private int batteryStatus;

    public MobilPhone(String brand, String model, boolean is5G, String color, int price,
                      int memory, double screenSize, int freiMemory, int batteryStatus) {
        this.brand = brand;
        this.model = model;
        this.is5G = is5G;
        this.color = color;
        this.price = price;
        this.memory = memory;
        this.screenSize = screenSize;
        this.freiMemory = freiMemory;
        this.batteryStatus = batteryStatus;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isIs5G() {
        return this.is5G;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMemory() {
        return this.memory;
    }

    public double getScreenSize() {
        return this.screenSize;
    }

    public int getFreiMemory() {
        return this.freiMemory;
    }

    public int getBatteryStatus() {
        return this.batteryStatus;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIs5G(boolean is5G) {
        this.is5G = is5G;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setFreiMemory(int freiMemory) {
        this.freiMemory = freiMemory;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }
}
