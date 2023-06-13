package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz


        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);

        //Anlik zamanda bileşenler nasil alinir?
        int hour=myCurrentTime.getHour();
        System.out.println(hour);

        //Anlik zamanda dakika nasil alinir?
        int minute=myCurrentTime.getMinute();
        System.out.println(minute);
        //Anlik zamanda saniye nasil alinir?
        int second=myCurrentTime.getSecond();
        System.out.println(second);

        //Anlik zamanda nano nasil alinir?
        int nano=myCurrentTime.getNano();
        System.out.println(nano);

        //gelecek ve geçmişe nasil gidilir?


        LocalTime next=myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        /*
        DateTİme class da kullanılan tarih saat formatlari:

        HH:mm==> 24 lu saat sistemi
        hh:mm==> 12 li saat sistemi
        hh:mm a==> 12 li saat sistemi AM,PM gösterilir
        hh:mm ==> 12 li saat sistemi AM,PM gösterilmez
        HH:mm:ss ==> 24 saat sistemi saniye de gosterilir
        HH:MM==> yanlis format "MM" aylar icin kullanilir.
        "mm" minute demektir. "MM" month demektir.

        dd-MM-yyyy==>gun ay yıl digit olarak verir
        MMM===>Aug
        MMMM==>August
         */
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm");
       String formattedmyCurrentDay= dtf1.format(myCurrentTime);
        System.out.println(formattedmyCurrentDay);

        //Date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023, 8, 13);
        System.out.println(myDate);//2023-08-13

        //Tarihi AY/GUN/YİL sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedMydate = dtf2.format(myDate);
        System.out.println(formattedMydate);

        //Tarihi gün / ay isminin ilk üç harfi /yil ikili gir

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formatli=dtf3.format(myDate);
        System.out.println(formatli);

        //Tarihi gün / ay isminin tamami /yil dörtlü gir

        DateTimeFormatter dtf4 =DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        String formatli2=dtf4.format(myDate);
        System.out.println(formatli2);

        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-06-11

        //Amsterdam da ayin kaçi?

        LocalDate dateInAmsterdam=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2023-06-10

        //Tokyo da saat kaç?
        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//04:14:37.994091600

        LocalTime timeInAmsterdam=LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);//21:15:38.606369500

        //Berlinde saat kaç?
       LocalTime timeInBerlin= LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//21:17:19.218853700


    }
}
