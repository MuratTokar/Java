package day_011_hakan;

public class Task_31 {
    public static void main(String[] args) {
        // Ücgenin ic acilari toplaminin 180 e esit olup olmamasi
        int a = 100, b = 20 , c = 70, sumOfAngles ;
        sumOfAngles = a + b + c;

        if(sumOfAngles == 180){
            System.out.println(a + "," + b + "," + c + " acilari ile bir ücgen cizilebilir");
        } else {
            System.out.println(a + "," + b + "," + c +" acilari ile ücgen CIZILEMEZ");
        }

    }
}
