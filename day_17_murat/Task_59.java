package day_17_murat;

public class Task_59 {
    public static void main(String[] args) {

double sonuc=calculatePay(8,15);// ya basa double sonuc yazariz yada yazmadan bastirirz
        System.out.println("sonuc:"+ sonuc);
        }

    public static double calculatePay(double hour, double hourlyPay){
        return hour*hourlyPay;
    }
}
