package day_23_murat;

public class Task_81 {
    public static void main(String[] args) {
        String date="10/10/2019 20:45:15";
        timeStamp(date);

    }
    public static void timeStamp(String date){
        date=date.replaceAll("/","");
        date=date.replaceAll(" ","");
        date=date.replaceAll(":","");
        System.out.println(date);
    }
}
