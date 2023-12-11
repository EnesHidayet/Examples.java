package org.enes.lesson34;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class DateOrnek {
    public static void main(String[] args) {

        long sure=System.currentTimeMillis()-(24*60*60*1000);
        Date date=new Date();
        System.out.println(date);
        Date date2=new Date(sure);
        System.out.println(date2);
        System.out.println(date.getTime());

        System.out.println("-----------------------------");

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate1=LocalDate.of(2021,06,10);
        LocalDate localDate2=LocalDate.of(2020, Month.DECEMBER,10);
        System.out.println(localDate1);
        System.out.println(localDate2);
        //String bir veriden tarih üretmek.
        LocalDate localDate3=LocalDate.parse("1992-10-14");
        System.out.println(localDate3);
//        LocalDate localDate4=LocalDate.parse("10-10-1960");
//        System.out.println(localDate4);

        System.out.println(localDate2.getDayOfYear()); // yýlýn kaçýncý günü
        System.out.println(localDate2.getDayOfMonth()); // ayýn kaçýncý günü
        System.out.println(localDate2.getDayOfWeek()); // haftanýn kaçýncý günü
        System.out.println(localDate2.getDayOfWeek().getValue()); // haftanýn kaçýncý günü
        System.out.println(localDate2.getMonth());
        System.out.println(localDate2.getYear());
        System.out.println(localDate2.isLeapYear());
        System.out.println(localDate2.plusYears(2));
        System.out.println(localDate2);
        System.out.println(localDate2.plusMonths(2));
        System.out.println(localDate2.plusWeeks(2));
        System.out.println(localDate2.plusDays(2));
        System.out.println(localDate2.minusDays(5));
        System.out.println(localDate2.minusWeeks(5));
        System.out.println(localDate2.minusMonths(5));
        System.out.println(localDate2.minusYears(5));
        System.out.println(localDate2.isBefore(LocalDate.now()));
        System.out.println(localDate2.isAfter(LocalDate.now()));

    }
}
