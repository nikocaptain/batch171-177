package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TekrarDT03 {
    public static void main(String[] args) {
       LocalDateTime ltd= LocalDateTime.now();
        System.out.println("time = " + ltd);//time = 2023-06-11T12:19:43.392029400

        //gun-ay-yil/saat-dakika-saniye yi alınız.

       DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
      String formatted= dtf.format(ltd);
        System.out.println("formatted = " + formatted);//formatted = 11-06-2023  12:22:29
    }
}
