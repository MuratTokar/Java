package day_014_hakan;

public class Task_44 {

    public static void main(String[] args) {

        // 60 ile 130 arasindaki 10 un katsayilarinda, KMH'i MPH'a cevirecek bir program yaz
        // for dongusu yaz i=60, i<=130 i+=10
        // code block : convert(cevir) KMH yi MPH'a cevir
        // formula : MPH = KMH * 0.6214

        int start = 60, end = 130;

        for(int i = start; i <=end; i += 10 ){
            double mph = i * 0.6214;
            // mph = Math.round(mph);
            System.out.println(i + "\t KMH = " + mph + " MPH");
        }




    }
}
