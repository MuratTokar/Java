package day_014_murat;

public class Task44 {
    public static void main(String[] args) {
        // 60 ile 130 arsinfaki 10un kat sayilarinda ,MPH a cevirecek bir program yaz
        // for dongosu yaz i=60 ,i<=130 ,i +=10
        // formula :MPH =KMH*0,6214
        int start=60,end=130;
        for (int i=start; i<=end; i+=10){
         double mph=i*0.6214;
            System.out.println(i+"KMH="+ mph+"" + "MPH");

        }

    }
}
