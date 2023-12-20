package day_010_hakan;

public class Task_27 {

    public static void main(String[] args) {
        // 0-12 good morning
        // 12-15 good afternoon
        // 15-24 Good evening
        int hour = 15; // 0-24

        if(hour < 12){
            System.out.println("Good morning!");
        }

        if(12 <= hour && hour < 15 ){
            System.out.println("Good afternoon!");
        }

        if(15 <= hour)
            System.out.println("Good evening!");

    }
}
