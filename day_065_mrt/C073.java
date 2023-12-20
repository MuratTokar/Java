package day_065_mrt;

import java.time.LocalDate;

public class C073 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,1,30);
        date.plusDays(10);// burdaki deger atanmamis
        System.out.println(date);
    }// 2012-01-30=B
}
