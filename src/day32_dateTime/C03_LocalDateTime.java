package day32_dateTime;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2022-05-24T13:47:32.298153500

        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        // 2025-08-03T18:54:27.559407100
    }
}
