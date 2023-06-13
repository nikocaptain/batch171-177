package day23datetimevarargs;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year,month and day number in the given order!!");
        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();

        LocalDate givenDate=LocalDate.of(year,month,day);//spesific tarih luşturduk dynamic olarak

        if (givenDate.isBefore(LocalDate.now())){//girilen tarih şuanki tarihten önce mi diye sorduk
            System.out.println(givenDate+" Invalid Date");
        }else {
            System.out.println("Enter time for ticket");
        }

        //Example 2: kullanicinin girdigi tarihin gun ismini veren kodu yaziniz.

        System.out.println("Please enter year,month and day number in the given order!!");
        int y= input.nextInt();
        int m= input.nextInt();
        int d= input.nextInt();
       LocalDate date= LocalDate.of(y,m,d);

        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());

    }


}
