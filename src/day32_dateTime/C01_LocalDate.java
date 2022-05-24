package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh = LocalDate.now();// Objenin olusturuldugu tarihi trh ye atar
        LocalDate baskaTrh = LocalDate.of(1972,1,18);
        // istedigimiz yil ay ve gun degerlerine gore bize obje olusturur

        System.out.println(trh);// 2022-05-24

        System.out.println(trh.getDayOfMonth()); // 24
        System.out.println(trh.getDayOfWeek()); // TUESDAY
        System.out.println(trh.getMonthValue()); // 5
        System.out.println(trh.getYear()); // 2022

        // bir tarihten istedigimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20)); // 2022-01-04
        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022-04-16

        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-03-06

        // Istedigimiz ulkenin o andaki tarihini  elde etmek istersek
        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-05-24

        // is ile baslayan method'lar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear()); // false
        System.out.println(trh.isAfter(baskaTrh)); // true

    }
}
