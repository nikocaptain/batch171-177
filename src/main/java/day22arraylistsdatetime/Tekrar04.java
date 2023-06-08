package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Tekrar04 {
    public static void main(String[] args) {
        //içinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate=LocalDate.now();
        System.out.println("myCurrentDate = " + myCurrentDate);//2023-06-08

        LocalDate now=LocalDate.now();
        System.out.println(now);//2023-06-08

        //tarihten istedigimiz bir bileseni nasil aliriz
        int year=myCurrentDate.getYear();
        System.out.println(year);//2023
        int month=myCurrentDate.getMonthValue();
        System.out.println(month);//6
        int day=myCurrentDate.getDayOfYear();
        System.out.println(day);//159
       int day1= myCurrentDate.getDayOfMonth();
        System.out.println(day1);//8

        DayOfWeek week=myCurrentDate.getDayOfWeek();
        System.out.println(week);//THURSDAY

        //gelecek tarihe nasil gidilir
        System.out.println(myCurrentDate.plusDays(5).plusMonths(5).plusYears(5));

        //geçmiş tarihe nasil gidilir

        System.out.println(myCurrentDate.minusYears(10).minusMonths(10).minusDays(10));//2012-07-29
        System.out.println(LocalDate.now());//2023-06-08
    }
}
