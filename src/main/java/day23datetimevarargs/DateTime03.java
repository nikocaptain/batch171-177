package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);//2023-06-10T22:21:16.704760700

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM*dd*yyyy - HH*mm a");
        String formattedLtd=dtf.format(ldt);
        System.out.println(formattedLtd);

    }
}
