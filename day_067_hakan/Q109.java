package day_067_hakan;

public class Q109 {
}

class Customer {
    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh){
       // acct.addKWh(kWh);
    }
}

class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    // line n1
    void addKWh(double kWh){
        if(kWh > 0) {
            this.kWh += kWh;
            this.bill = this.kWh * rate;
        }
    }
}
