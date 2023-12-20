package day_068_mrt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C148 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1,1);
        dt.plusDays(30);
        dt.plusMonths(30);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME ));

        //System.out.println(LocalDateTime.now()); // bu bilgisayarin suanki guncel tarih ve satini verecektir
    }
}

//  Cevap=B (2014-07-31T01:01:00)

