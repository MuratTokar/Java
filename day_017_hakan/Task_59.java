package day_017_hakan;

public class Task_59 {

    public static void main(String[] args) {
        double sonuc = calculatePay(8, 15);
        calculatePay(10, 15);
        System.out.println("Sonuc " + sonuc);
    }

    public static double calculatePay(double hour, double hourlyPay){
        return hour * hourlyPay;
    }
}
