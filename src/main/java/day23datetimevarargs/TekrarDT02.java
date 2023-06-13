package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TekrarDT02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz

        LocalTime time = LocalTime.now();
        System.out.println(time);//11:34:10.075355500

        //Anlik zamanda bileşenler nasil alinir?
        int hour = time.getHour();
        System.out.println(hour);//11

        int minute = time.getMinute();
        System.out.println(minute);//35

        int second = time.getSecond();
        System.out.println(second);//47

        System.out.println(hour + ":" + minute + ":" + second);//11:36:25

        //gelecek ve geçmişe nasil gidilir?

        LocalTime gecmis = time.minusHours(5);
        System.out.println(gecmis);//06:37:41.430635300

        System.out.println("time.minusMinutes() = " + time.minusMinutes(30));//11:08:37.882557800

        //saat ve dakika olarak formatlayin
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh+mm+ss");
        String formatli = dtf1.format(time);
        System.out.println("formatli = " + formatli);//formatli = 11+46+55

        //Date formati nasil degistirilir?
        LocalDate date = LocalDate.now();

        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("yyyy/dd/MMMM");
        String formatli2=dtf2.format(date);
        System.out.println("formatli2 = " + formatli2);//formatli2 = 2023/11/June

        //Tarihi gün / ay isminin ilk üç harfi /yil ikili gir
        DateTimeFormatter dtf3 =DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formatli3=dtf3.format(date);
        System.out.println("formatli3 = " + formatli3);//formatli3 = 11/Jun/23

        //Tarihi gün / ay isminin tamami /yil dörtlü gir
        DateTimeFormatter dtf4 =DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formatli4=dtf4.format(date);
        System.out.println("formatli4 = " + formatli4);//formatli4 = 11/June/2023

        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz

        LocalDate istanbul=LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(istanbul);//2023-06-11

        LocalDate tokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyo = " + tokyo);//tokyo = 2023-06-11

        //Tokyo da saat kaç?
        LocalTime tokyoTime=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyoTime = " + tokyoTime);//tokyoTime = 18:01:49.837178300

        //Berlinde saat kaç?
        LocalTime berlin=LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("berlin = " + berlin);//berlin = 11:04:38.900523500
        
        
    }
}
