package day_065_hakan;

import java.time.LocalDate;

public class Q73 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012,1, 30);
        //date =  // 2012-2-09
        date.plusDays(10);
        System.out.println(date); // 2012-1-30
    }
}
