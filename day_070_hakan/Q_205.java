package day_070_hakan;

import java.time.LocalDate;

public class Q_205 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);
    }
}
