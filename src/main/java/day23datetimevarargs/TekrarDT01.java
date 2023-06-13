package day23datetimevarargs;

import java.time.LocalDate;
import java.util.Scanner;

public class TekrarDT01 {
    public static void main(String[] args) {
        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen girmek istediginiz tarihi yıl ay gün seklinde  söyleyiniz...");
        int year= scan.nextInt();
        int month= scan.nextInt();
        int day= scan.nextInt();

        LocalDate date=LocalDate.of(year,month,day);
        if (date.isAfter(LocalDate.now())){
            System.out.println("Lütfen rezervasyon için saat giriniz");
        }else {
            System.out.println("Geçmiş tarih girdiniz");
        }
    }
}
