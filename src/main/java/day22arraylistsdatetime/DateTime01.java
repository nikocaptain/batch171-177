package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //içinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-06-07==>>tarihi local bilgisayarinizdan alir.

        //tarihten istedigimiz bir bileseni nasil aliriz
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);//6

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//7


        //Month bir "enum" dir
        //Enum java da sabit degerleri(Ay isimleri,ulkedeki sehir isimleri) depolamak için kullanilir.
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);//JUNE

        DayOfWeek weekName = myCurrentDate.getDayOfWeek();
        System.out.println(weekName);//WEDNESDAY


        System.out.println("myCurrentDate.plusDays(5) = " + myCurrentDate.plusDays(5).plusMonths(5).plusYears(5));//2028-11-12

        //geçmiş tarihe nasil gidilir
        System.out.println(myCurrentDate.minusYears(10).minusMonths(10).minusDays(10));//2012-07-28


        //spesifik bir tarih objesi nasil olusturulur
        LocalDate date1 = LocalDate.of(1980, 8, 10);
        System.out.println("date1 = " + date1);


        LocalDate date2 = LocalDate.of(1990, 8, 10);
        System.out.println("date2 = " + date2);


        //Bir tarihin başka bir tarihten sonra olup olmadigini nasil kontrol ederiz?
        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);//false

        //Bir tarihin baska bir tarihten once olup olmadigini nasil kontrol ederiz

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);//true


        //bir tarihin bir tarihe esit olup olmadigini nasil kontrol ederiz

        boolean r3=date1.isEqual(date2);
        System.out.println(r3);//false

        //ornek:Kullanicidan aldiginiz tarih geçmişe ait ise


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year,month and day numbers in the given order");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();

        LocalDate givenDate=LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate+" invalid date");

        }else {
            System.out.println("Enter time for the ticket ");

        }
    }
}
