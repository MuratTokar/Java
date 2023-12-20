package day_023_hakan;

public class Task_81 {

    public static void main(String[] args) {
        String date = "10/10/2023 20:45:15";
        timeStamp(date);
        timeStamp2(date);
    }

    public static void timeStamp(String date){
        date = date.replaceAll("/","");
        date = date.replaceAll(" ","");
        date = date.replaceAll(":","");
        System.out.println(date);
    }

    public static void timeStamp2(String date){
        date = date.replaceAll("[/: ]","");
        System.out.println(date);
    }
}
