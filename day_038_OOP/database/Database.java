package day_038_OOP.database;

public abstract class Database {
    // abstract bir class olusturdum.


    private String dataName;
    private double dataSize;

    public Database(String dataName, double dataSize) {
        this.dataName = dataName;
        this.dataSize = dataSize;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    private void setDataSize(double dataSize) {
        this.dataSize = dataSize;
    }




    public void printDataSize() {
        System.out.println("Data Boyutu: " + dataSize + " MB");
    }
}
