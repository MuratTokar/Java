package day_060_hakan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q3 {
    public static void main(String[] args) {
        String date = LocalDateTime
                .of(2023, 7,3,20,36)
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);


        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("2020-07-13");
        System.out.println(dtf.format(dt));

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(DateTimeFormatter.ISO_DATE));
    }
}
// DATE
// yyyy-mm-dd
// 2023-07-03

//TIME
// yyyy-mm-ddThh:mm:ss
// 2023-07-03T20:24:42